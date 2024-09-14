package lk.ijse.notecollecter;

import lk.ijse.notecollecter.configuration.WebAppConfig;
import lk.ijse.notecollecter.configuration.WebAppRootConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AppInit extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {//presentation layer eke nowana wena layer wala configurations krnn

        return new Class[]{WebAppRootConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {//presentation layer eke configuration krnn
        return new Class[]{WebAppConfig.class};
    }

    @Override
    protected String[] getServletMappings() {//dispatcher servlet ek register krnn
        return new String[]{"/"};
    }
}
