package com.example.demo.configuration;

import com.example.demo.util.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Configuration
public class ModelMapperConfiguration {

    @Bean("objectMapper")
    @Primary
    public ObjectMapper objectMapper() {

        return new ObjectMapper() {
            @Override
            public <D> D map(Object o, Class<D> clazz) {
                return null;
            }

            @Override
            public <D> Collection<D> map(Collection<?> oList, Class<D> clazzDestino) {
                return null;
            }

            @Override
            public <D> List<D> map(List<?> oList, Class<D> clazzDestino) {
                return null;
            }


        };
    }}
