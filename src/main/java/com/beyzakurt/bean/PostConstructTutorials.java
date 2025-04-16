package com.beyzakurt.bean;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.logging.Logger;

@Controller
public class PostConstructTutorials {

    @Autowired
    Logger log;

    // Bean henüz başlamadığı için null pointer döner. Burada bağımlılığı enjekte edemiyoruz.
    // parametresiz constructor
    // because "this.log" is null
    // public PostConstructTutorials() {
    //   log.info("Log info çağırıldı.");
    // }


    // PostConstruct yapısının görevi bean nesnesi oluşturulduğunda hemen oluşur.
    @PostConstruct
    public void init() {
        log.info("Log info çağırıldı.");
    }

    public static void main(String[] args) {
        PostConstructTutorials constructController = new PostConstructTutorials();
        System.out.println(constructController);
    }
}
