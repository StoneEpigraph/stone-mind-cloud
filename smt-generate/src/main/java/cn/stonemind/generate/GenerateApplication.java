package cn.stonemind.generate;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.stonemind.generate.mapper")
//@NacosPropertySource(dataId = "smt-server-base-dev.yml", autoRefreshed = true)
public class GenerateApplication {

	public static void main(String[] args) {
		SpringApplication.run(GenerateApplication.class, args);
	}

}
