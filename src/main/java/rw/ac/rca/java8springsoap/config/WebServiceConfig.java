package rw.ac.rca.java8springsoap.config;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;


@EnableWs //Enable Spring Web Services
@Configuration //Spring Configuration
public class WebServiceConfig {

    // MessageDispatcherServlet
    // ApplicationContext
    // url -> /ws/*

    @Bean
    public ServletRegistrationBean<MessageDispatcherServlet> messageDispatcherServlet(ApplicationContext context) {
        MessageDispatcherServlet messageDispatcherServlet = new MessageDispatcherServlet();
        messageDispatcherServlet.setApplicationContext(context);
        messageDispatcherServlet.setTransformWsdlLocations(true);
        return new ServletRegistrationBean<>(messageDispatcherServlet, "/ws/Edine-noella/*");
    }

    @Bean(name = "Items")
    public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema itemsSchema) {
        DefaultWsdl11Definition definition = new DefaultWsdl11Definition();
        definition.setPortTypeName("ItemPort");
        definition.setTargetNamespace("https://rca.ac.rw/Edine-noella/soap-app");
        definition.setLocationUri("/ws/Edine-noella");
        definition.setSchema(itemsSchema);
        return definition;
    }

    @Bean(name = "Supplier")
    public DefaultWsdl11Definition defaultWsdl12Definition(XsdSchema suppliersSchema) {
        DefaultWsdl11Definition definition = new DefaultWsdl11Definition();
        definition.setPortTypeName("SupplierPort");
        definition.setTargetNamespace("https://rca.ac.rw/Edine-noella/soap-app");
        definition.setLocationUri("/ws/Edine-noella");
        definition.setSchema(suppliersSchema);
        return definition;
    }

    @Bean
    public XsdSchema itemsSchema() {
        return new SimpleXsdSchema(new ClassPathResource("app.xsd"));
    }

    @Bean
    public XsdSchema suppliersSchema() {
        return new SimpleXsdSchema(new ClassPathResource("app.xsd"));
    }
}

