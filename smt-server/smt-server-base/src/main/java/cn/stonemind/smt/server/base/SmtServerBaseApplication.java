package cn.stonemind.smt.server.base;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.stonemind.smt.server.base.mapper")
public class SmtServerBaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmtServerBaseApplication.class, args);
	}

}
