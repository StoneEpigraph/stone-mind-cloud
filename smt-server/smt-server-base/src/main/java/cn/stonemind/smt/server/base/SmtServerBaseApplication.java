package cn.stonemind.smt.server.base;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@MapperScan("cn.stonemind.smt.server.base.mapper")
@SpringBootApplication
public class SmtServerBaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmtServerBaseApplication.class, args);
	}

}
