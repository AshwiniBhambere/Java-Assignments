import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main(String args[]) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Hello hello = (Hello) context.getBean("h1");
        System.out.println(hello.getMessage());

        Hello h2;

      h2=( Hello) context.getBean("h1");
      h2.setMessage("Hello!!!");
      System.out.println(h2.getMessage());
      System.out.println(hello.getMessage());
    }


}
