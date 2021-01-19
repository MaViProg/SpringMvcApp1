package config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MySpringMvcDispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        //ставим локацию spring-конфигурации
        return new Class[]{SpringConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        //все http-запросы от пользователя посылаем на DispatcherServlet
        return new String[] {"/"};
    }
}
