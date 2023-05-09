package ra.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

// tạo class này để khi web start lên thì nó vào file AppConfig để đọc
public class WebConfig extends AbstractAnnotationConfigDispatcherServletInitializer {
   // trả ra các lớp mà nó sẽ đọc các config của ứng dụng
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{AppConfig.class};
    }
//
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[0];
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
