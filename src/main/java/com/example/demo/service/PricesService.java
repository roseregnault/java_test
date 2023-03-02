package com.example.demo.service;

import com.example.demo.dto.PricesDTO;
import com.example.demo.dto.PricesEntradaDTO;

import java.util.List;

/**
 * The interface PricesService.
 */
public interface PricesService {

    /**
     *  Buscar prices.
     *
     *
     * @param entrada the entrada.
     * @return the busqueda prices dto.
     */

    PricesDTO buscarPrices(PricesEntradaDTO entrada);


}
