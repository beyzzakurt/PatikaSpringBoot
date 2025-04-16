package com.beyzakurt.bean;

import com.beyzakurt.dto.BeanDto;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;


@Configuration
public class BeanConfig {

    // Scope(request): Sadece bir istek boyunca çalışır.
    // Scope(session): Bir oturum boyunca çalışır.
    // Scope(singleton): Proje başlarken çalışır, proje kapatıldığında biter.

    @Bean(initMethod = "initialBeanMethod", destroyMethod = "finalBeanMethod")
    @Scope("singleton")
    public BeanDto beanDto() {

        return BeanDto.builder()
                .id(0L)
                .beanName("Example Bean")
                .beanData("Sample data")
                .build();
    }
}

