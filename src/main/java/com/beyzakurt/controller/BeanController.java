package com.beyzakurt.controller;

import com.beyzakurt.bean.BeanConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BeanController {

    @Autowired
    BeanConfig beanConfig;

    // http://localhost:8080/bean/beanDto
    @GetMapping("/bean/beanDto")
    @ResponseBody // html olmadan direkt ekranda gostermeye yarar.
    public String getBeanDto() {
        return beanConfig.beanDto()+"";
    }
}
