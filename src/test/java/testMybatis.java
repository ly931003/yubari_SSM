import com.yubari.domain.User;
import com.yubari.mapper.UserMapper;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testMybatis {
    @Test
    public void mybatis01(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapper = (UserMapper)context.getBean("userMapper");
        User user = userMapper.selectByPrimaryKey(10);
        System.out.println(user);
    }
}
