package com.beyzakurt.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Log4j2
@Builder
public class BeanDto {
    private  Long id;
    private  String beanName;
    private  String beanData;


    public void initialBeanMethod() {
        log.info("Bean baslamadan önce ben varım.");
        System.out.println("Bean baslamadan once çalışacak metod");
    }


    public void finalBeanMethod() {
        log.info("Bean bittikten sonra ben varım.");
        System.out.println("Bean bittikten sonra çalışacak metod");
    }
}
