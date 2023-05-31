package com.starfall.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class sfProperties {
    @Value("${com.starfall.title}")
    private String title;
    @Value("${com.starfall.description}")
    private String description;
}
