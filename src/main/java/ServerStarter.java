import org.apache.tools.ant.taskdefs.Sleep;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ImportResource;

@EnableCaching
@SpringBootApplication(scanBasePackages={"com.hundsun.jres","com.hundsun.lcpt","com.zhangph.test"},
        exclude= {DataSourceAutoConfiguration.class})
@ImportResource(locations={"classpath*:**SpringContext.xml"})
public class ServerStarter {
    public static final String HUNDSUN_VERSION = "@system 理财登记过户平台 @version 6.0.0.1 @sp_version BTA6.0V202001.00.000 @lastModiDate 2020/3/25 @describe ";

    public static void main(String[] args) {
        SpringApplication.run(ServerStarter.class,args);
    }

}
