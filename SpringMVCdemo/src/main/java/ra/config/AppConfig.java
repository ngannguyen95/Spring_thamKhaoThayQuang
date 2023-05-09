package ra.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"ra.controller", "ra.model.serviceIMPL", "ra.model.daoIMPL"})
public class AppConfig implements WebMvcConfigurer {
    // cấu hình đâu là file view của ứng dụng
    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        // chỉ định các thư mục chứa view của ứng dụng
        resolver.setPrefix("/views/");
        // khai báo các file views có phần mở rộng, kiểu file
        resolver.setSuffix(".jsp");
        return resolver;
    }
}
