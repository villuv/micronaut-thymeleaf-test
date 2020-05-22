package thymeleaf.test;

import io.micronaut.context.annotation.Bean;
import io.micronaut.context.annotation.Factory;
import io.micronaut.context.annotation.Primary;
import org.thymeleaf.templateresolver.AbstractConfigurableTemplateResolver;
import org.thymeleaf.templateresolver.UrlTemplateResolver;

@Factory
public class ViewFactory {

  @Bean @Primary
  public AbstractConfigurableTemplateResolver urlTemplateResolver() {
    UrlTemplateResolver urlTemplateResolver = new UrlTemplateResolver();
    urlTemplateResolver.setOrder(0);
    urlTemplateResolver.setTemplateMode("HTML");
    return urlTemplateResolver;
  }

}
