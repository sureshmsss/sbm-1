package ss.it.config;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "ss.it")
//@PropertySource("ss/it/commons/info.properties")
public class AppConfig {
	public AppConfig() {
		System.out.println("0-param of " + this.getClass());
	}

	@Bean//("month")
	public LocalDateTime getMonth() {
		System.out.println("AppConfig.getMonth() ");
		return LocalDateTime.now();
	}

}
