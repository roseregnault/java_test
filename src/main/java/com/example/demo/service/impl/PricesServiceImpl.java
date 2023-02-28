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


    @Override
    public List<PricesDTO> buscarPrices(PricesEntradaDTO entrada) {
        return mapPrices(entrada).stream().collect(Collectors.collectingAndThen(Collectors.toList(),
                pricesDTOS -> {
                    if(pricesDTOS.isEmpty()) try {
                        throw new Exception("No se han encontrado elementos con este criterio de busqueda.");
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    return pricesDTOS;
        }));
    }

    private List<PricesDTO> mapPrices (PricesEntradaDTO brandDTO){
        return modelMapper.map(pricesDAO.findByid(brandDTO), PricesDTO.class);
    }


}
