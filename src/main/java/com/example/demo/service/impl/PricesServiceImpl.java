package com.example.demo.service.impl;

import com.example.demo.dto.PricesDTO;
import com.example.demo.dto.PricesEntradaDTO;
import com.example.demo.repository.PricesDAO;
import com.example.demo.service.PricesService;
import com.example.demo.util.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PricesServiceImpl implements PricesService {

    /** The model mapper. */
    private final ObjectMapper modelMapper;

    /** The prices service DAO.*/
    private final PricesDAO pricesDAO;

    /**
     * Metodo de implementacion para la busqueda de productos segun los criterios.
     *
     * @param entrada the entrada.
     * @return prices.
     */
    @Override
    public List<PricesDTO> buscarPrices(PricesEntradaDTO entrada) {

        return mapPrices(entrada).stream().collect(Collectors.collectingAndThen(Collectors.toList(), prices -> {
            if (prices.isEmpty()) try {
                throw new Exception("No se han encontrado elementos con estos criterios de búsqueda");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            return prices;
        }));
    }

    /**
     * Mapeo de datos con mapstruct.
     *
     * @param brandDTO
     * @return map.
     */
    private List<PricesDTO> mapPrices (PricesEntradaDTO brandDTO){
        return modelMapper.entityListToSource(pricesDAO.getTPrices(brandDTO.getBrand_id(), brandDTO.getStart_date()
                ,brandDTO.getProduct_id()));
    }

}
