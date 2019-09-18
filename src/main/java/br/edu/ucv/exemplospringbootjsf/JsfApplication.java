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
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/**
 *
 * @author romulo.douro
 * @see
 * <a href="https://www.baeldung.com/jsf-spring-boot-controller-service-dao">Fonte</a>
 * @see
 * <a href="https://pt.stackoverflow.com/questions/101842/erro-java-lang-noclassdeffounderror-em-java-web-com-jsf?answertab=votes#tab-top">Acerto</a>
 */
@SpringBootApplication
public class JsfApplication extends SpringBootServletInitializer implements ServletContextInitializer, WebMvcConfigurer {

 public static void main(String[] args) {
  SpringApplication.run(JsfApplication.class, args);
 }

 /*@Bean
 public ServletRegistrationBean servletRegistrationBean() {
  FacesServlet servlet = new FacesServlet();
  ServletRegistrationBean servletRegistrationBean
          = new ServletRegistrationBean(servlet, "*.jsf");
  return servletRegistrationBean;
 }*/
 
 /*@Override
 public void configureViewResolvers(ViewResolverRegistry registry) {
  //registry.jsp("/WEB-INF/jsp/", ".jsp");
  InternalResourceViewResolver resolver = new InternalResourceViewResolver();
  resolver.setPrefix("/WEB-INF/jsp/");
  //resolver.setSuffix(".html");
  //resolver.setViewClass(JstlView.class);
  registry.viewResolver(resolver);
 }*/
 
 @Override
 public void onStartup(ServletContext servletContext) throws ServletException {
  AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
  ctx.register(JsfApplication.class);
  ctx.setServletContext(servletContext);
  
  ServletRegistration.Dynamic servlet = servletContext.addServlet("Faces Servlet", new FacesServlet());
  servlet.addMapping("*.html");
  //servlet.addMapping("/");
  servlet.setLoadOnStartup(1);
          
  
  //servletContext.setInitParameter("primefaces.THEME", "redmond");
  //servletContext.setInitParameter("primefaces.THEME", "none");
  servletContext.setInitParameter("primefaces.THEME", "start");
 }

}
