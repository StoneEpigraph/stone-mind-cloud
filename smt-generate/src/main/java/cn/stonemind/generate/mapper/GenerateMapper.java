package cn.stonemind.generate.mapper;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface GenerateMapper {


    List<String> getDatabase();

}
