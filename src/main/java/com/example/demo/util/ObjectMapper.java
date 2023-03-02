package com.example.demo.util;



import com.example.demo.dto.PricesDTO;
import com.example.demo.entity.PricesEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface ObjectMapper {



     PricesDTO entityListToSource(PricesEntity listPricesEntity);

     PricesDTO prueba (PricesEntity pri);


}
