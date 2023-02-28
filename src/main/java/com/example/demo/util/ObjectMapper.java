package com.example.demo.util;

import lombok.experimental.UtilityClass;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Collection;
import java.util.List;
@Configuration
public interface ObjectMapper {

    <D> D map(Object o, Class<D> clazz);

    <D> Collection<D> map(Collection<?> oList, Class<D> clazzDestino);

    <D> List<D> map(List<?> oList, Class<D> clazzDestino);
}
