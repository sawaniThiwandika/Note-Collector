package lk.ijse.notecollecter.configuration;

import jakarta.servlet.annotation.MultipartConfig;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackages= "lk.ijse.notecollecter")
@EnableWebMvc
@MultipartConfig
public class WebAppConfig {
}
