package dev.maxpetrushin.web.rest.consuming_rest.open_feign;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "dev.maxpetrushin.web.rest.consuming_rest")
public class OpenFeignConfig {
}
