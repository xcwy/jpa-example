package io.rai.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/**
 * Created by rai on 16/11/26.
 */
@Configuration
@EnableJpaAuditing
public class Config {
  @Bean
  public CustomAuditorAware auditorProvider(){
    return new CustomAuditorAware();
  }
}
