package ss.it.cfgs;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "ss.it")
public class AppConfig {
	public AppConfig() {
		System.out.println("0-param of " + this.getClass());
	}

	@Bean(name="sysDate")
	public LocalDateTime createLdt() {
		System.out.println("AppConfig.createLdt()");
		return LocalDateTime.now();
	}
}
