package com.lynn.springboot.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by eligshn on 2018/12/6.
 */
@Component
    public class NeoProperties {
        @Value("${com.neo.title}")
        private String title;
        @Value("${com.neo.description}")
        private String description;


}

