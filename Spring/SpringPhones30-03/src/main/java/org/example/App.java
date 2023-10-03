package org.example;

import org.example.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        Iphone ip1 = ctx.getBean(Iphone.class);
        ip1.makeOutgoingCall();
    }
}
