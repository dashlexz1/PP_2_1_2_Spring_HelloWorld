import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.util.logging.Logger;

public class App {
    public static void main(String[] args) {
        Logger log = Logger.getLogger(App.class.getName());
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        Cat catBean = (Cat) applicationContext.getBean("cat");
        HelloWorld bean2 = (HelloWorld) applicationContext.getBean("helloworld");
        Cat catBean2 = (Cat) applicationContext.getBean("cat");
        if(catBean == catBean2) {
            log.info("true");
        } else {
            log.info("false");
        }
        if (bean == bean2) {
            log.info("true");
        } else {
            log.info("false");
        }
    }
}