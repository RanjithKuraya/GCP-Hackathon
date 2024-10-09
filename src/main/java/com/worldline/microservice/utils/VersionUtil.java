package com.worldline.microservice.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class VersionUtil {

    @Value("${app.version}")
    private String version;

    public String getVersion() {
        return version;
    }
}