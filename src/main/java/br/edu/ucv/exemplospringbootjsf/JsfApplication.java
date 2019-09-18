/*
 * ................
 */
package br.edu.ucv.exemplospringbootjsf;

import javax.faces.webapp.FacesServlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

/**
 *
 * @author romulo.douro
 * @see
 * <a href="https://www.baeldung.com/jsf-spring-boot-controller-service-dao">Fonte</a>
 * @see
 * <a href="https://pt.stackoverflow.com/questions/101842/erro-java-lang-noclassdeffounderror-em-java-web-com-jsf?answertab=votes#tab-top">Acerto</a>
 */
@SpringBootApplication
public class JsfApplication extends SpringBootServletInitializer implements ServletContextInitializer {

 public static void main(String[] args) {
  SpringApplication.run(JsfApplication.class, args);
 }

 @Bean
 public ServletRegistrationBean servletRegistrationBean() {
  FacesServlet servlet = new FacesServlet();
  ServletRegistrationBean servletRegistrationBean
          = new ServletRegistrationBean(servlet, "*.jsf");
  return servletRegistrationBean;
 }

 @Override
 public void onStartup(ServletContext servletContext) throws ServletException {
   servletContext.setInitParameter("primefaces.THEME", "redmond");
 }

}
