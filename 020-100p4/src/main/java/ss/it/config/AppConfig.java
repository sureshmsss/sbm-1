package ss.it.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@ComponentScan(basePackages = "ss.it")
@PropertySource("ss/it/commons/info.properties")
public class AppConfig {

}
