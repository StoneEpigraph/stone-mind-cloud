package cn.stonemind.generate.mapper;

import cn.stonemind.entity.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserMapper {

    public List<User> getUserList();
}
