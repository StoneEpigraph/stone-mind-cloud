package cn.stonemind.generate.controller;

import cn.stonemind.entity.BaseResponse;
import com.alibaba.nacos.api.NacosFactory;
import com.alibaba.nacos.api.PropertyKeyConst;
import com.alibaba.nacos.api.config.ConfigService;
import com.alibaba.nacos.api.config.annotation.NacosValue;
import com.alibaba.nacos.api.exception.NacosException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLOutput;
import java.util.Properties;

@RequestMapping("nacos")
@RestController
public class NacosController {

    @NacosValue(value = "${connectTimeoutInMills:5000}", autoRefreshed = true)
    private String connectTimeoutInMills;

    /**
     * Nacos-client方式
     * 需要引入nacos-client依赖
     * @return
     * @throws NacosException
     */
/*    @RequestMapping("getConfig")
    public BaseResponse getConfig() throws NacosException {
        Properties prop = new Properties();
        String serverAddr = "127.0.0.1:9999";
        String dataId = "smt-server-base-dev.yaml";
        String group = "DEFAULT_GROUP";
        prop.put(PropertyKeyConst.SERVER_ADDR, serverAddr);

        ConfigService configService = NacosFactory.createConfigService(prop);
        // TODO 为什么无法获取配置
        String content = configService.getConfig(dataId, group, 5000);
        System.out.println(content);
        return new BaseResponse().data(content);
    }*/

    /**
     * TODO 使用SpringBoot方式获取，依旧无法获取
     * <dependency>
     * 			<groupId>com.alibaba.boot</groupId>
     * 			<artifactId>nacos-config-spring-boot-starter</artifactId>
     * 			<version>0.2.7</version>
     * 		</dependency>
     * @return
     */
/*    @RequestMapping("getBySpringBootMode")
    public BaseResponse getConfig() {
        return new BaseResponse().message(connectTimeoutInMills);
    }*/

}
