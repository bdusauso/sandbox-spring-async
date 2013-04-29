package be.codinsanity.sandbox;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.concurrent.Future;

/**
 * Hello world!
 */
public class App {
    public static final Logger log = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("application-context.xml");
        AsyncService asyncService = ctx.getBean(AsyncService.class);
        Future<String> future = asyncService.helloAsynchronous("Bruno");
        boolean cancelled = future.cancel(true);
        log.info("Future cancelled ? {}", cancelled);
    }
}
