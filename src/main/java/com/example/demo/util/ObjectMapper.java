package com.example.demo.util;



import com.example.demo.dto.PricesDTO;
import com.example.demo.dto.PricesEntradaDTO;
import com.example.demo.entity.PricesEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface ObjectMapper {



     List<PricesDTO> entityListToSource(List<PricesEntity> listPricesEntity);

     PricesDTO prueba (PricesEntity pri);







   /* <D> D map(Object o, Class<D> clazz) ;

    <D> Collection<D> map(Collection<?> oList, Class<D> clazzDestino);

    <D> List<D> map(List<?> oList, Class<D> clazzDestino);

    default <D> List<D> mapCollection(Collection<?> oList, Class<D> clazzDestino) {
        if (oList == null) {
            return null;
        } else {
            List<D> convertedList = new ArrayList<>();
            for (Object or : oList) {
                convertedList.add(map(or, clazzDestino));
            }
            return convertedList;
        }
    }

    default <D> D mapMapper(Object source, Class<D> destination){
        if (source == null){
            return null;
        }else{
            return (D) Arrays.stream(destination.getFields()).findAny();
        }
    }*/


}
