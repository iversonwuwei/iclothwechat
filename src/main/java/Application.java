import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by walden on 2016/12/22.
 */
@ComponentScan(basePackages = {"com.walden"})
@MapperScan(basePackages = {"com.walden.mapper"})
@SpringBootApplication
public class Application {

    public static void main(String[] args){
        SpringApplication.run(Application.class);
    }
}
