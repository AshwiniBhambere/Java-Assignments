import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
    public static void main(String []args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
        Hello hello = context.getBean(Hello.class);
        System.out.println(hello.getMessage());

        Hello h2=context.getBean(Hello.class);
        h2.setMessage("Hello!");
        System.out.println(h2.getMessage());
        System.out.println(hello.getMessage());

    }

}
