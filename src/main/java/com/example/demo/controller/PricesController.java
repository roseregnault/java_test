package com.example.demo.controller;

import com.example.demo.dto.PricesDTO;
import com.example.demo.dto.PricesEntradaDTO;
import com.example.demo.service.PricesService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.net.BindException;
import java.util.List;

@RestController
@AllArgsConstructor
@Slf4j
public class PricesController {

    PricesService pricesService;

    /**
     * Endpoint de consulta para busqueda por fecha, brand_id y product_id.
     *
     **/
    @GetMapping(value = "/prices", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public PricesDTO buscarProducto(@Validated @RequestBody(required = true) PricesEntradaDTO entrada) throws Exception {
        return pricesService.buscarPrices(entrada);
    }
}
