package com.api.apiclientsdk;

import com.api.apiclientsdk.client.ApiClient;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * YuApi 客户端配置
 *
 * @author
 * @from
 */
@Configuration
@ConfigurationProperties("yuapi.client")
@Data
@ComponentScan
public class ApiClientAutoConfig {

    private String accessKey;

    private String secretKey;

    @Bean
    public ApiClient yuApiClient() {
        return new ApiClient(accessKey, secretKey);
    }

}
