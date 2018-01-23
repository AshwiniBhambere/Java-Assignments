import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class HelloWorldConfig
{
    @Scope(BeanDefinition.SCOPE_PROTOTYPE)
    @Bean
    public Hello printmessage()
    {
        Hello h=new Hello();
        return  h;
    }
}
