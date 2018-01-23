import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfig
{
    @Bean
    public Hello printmessage()
    {
           Hello h=new Hello();
            h.setMessage("Hello World!!!");
            return  h;
    }
}
