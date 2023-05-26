package com.example.springbootboard.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * packageName    : com.example.springbootboard.config
 * fileName       : WebConfig
 * author         : son-jia
 * date           : 2023-05-26
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-05-26        son-jia       최초 생성
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {

    // view에서 접근할 경로
    private String resourcePath = "/upload/**";
    // 실제 파일이 저장되어 있는 경로
    private String savePath = "file:///C:/Users/wldk9/IdeaProjects/springboot_img/";

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler(resourcePath)
                .addResourceLocations(savePath);
    }
}
