import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class App
{
    public  static void main(String []args)
    {
        Resource r=new ClassPathResource("applicationContext.xml");
        BeanFactory bf=new XmlBeanFactory(r);
        Hello hello= (Hello) bf.getBean("h");
       System.out.println( hello.getMessage());
    }
}
