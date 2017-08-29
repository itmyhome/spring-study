//
//import EchoService;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
///**
// * Created by zli on 2016/11/23.
// */
//public class TestConsumer {
//    public static final Logger logger = LoggerFactory.getLogger(TestConsumer.class);
//
//    public static void main(String[] args) {
//        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring/test-consumer.xml");
//        ctx.start();
//
//        EchoService echoService = (EchoService) ctx.getBean("echoService");
//        System.out.println(echoService.echo("aaaaa"));
//    }
//}
