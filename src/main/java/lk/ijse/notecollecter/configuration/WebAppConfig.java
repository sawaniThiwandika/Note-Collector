package lk.ijse.notecollecter.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackages= "lk.ijse.notecollecter")
@EnableWebMvc
public class WebAppConfig {
}
