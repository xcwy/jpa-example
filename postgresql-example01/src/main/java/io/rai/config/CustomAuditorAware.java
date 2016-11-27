package io.rai.config;

import org.springframework.data.domain.AuditorAware;

/**
 * Created by rai on 16/11/26.
 */
public class CustomAuditorAware implements AuditorAware<String> {

  @Override
  public String getCurrentAuditor() {
    return null;
  }
}
