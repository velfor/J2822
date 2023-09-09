package by.itstep.boot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

@Configuration
public class SpringfoxConfig {
//    @Bean
//    public Docket docket(){
//        return new Docket(DocumentationType.SWAGGER_2)
//                .select()
//                .apis(RequestHandlerSelectors.any()) //классы для документации basePackage("by.itstep.boot")
//                .paths(PathSelectors.any()) //какие методы для документации
//                .build()
//                .apiInfo(apiInfo());
//    }
//
//    public ApiInfo apiInfo(){
//        return new ApiInfo(
//                "Name API", //заголовок
//                "API for bookstore", //описание
//                "1.0", //версия
//                "http://www.х.org", //урл для условия пользования
//                new Contact("API owner", "http://www.my.com","my@rmailer.org"), //имя владельца, урл личной страницы и почта
//                "api_license",
//                "http://www.license.edu.org",
//                new ArrayList<>() //расширения вендора
//        );
//    }

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();
    }
}
