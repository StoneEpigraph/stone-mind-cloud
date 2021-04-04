package cn.stonemind.generate.service.impl;

import cn.stonemind.entity.User;
import cn.stonemind.generate.mapper.UserMapper;
import cn.stonemind.generate.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getUserList() {
        List<User> userList = new ArrayList<>();

        User user1 = new User();
        user1.setUserid(UUID.randomUUID().toString());
        user1.setUsername("zhangsan");
        user1.setPassword("123qweASD");

        User user2 = new User();
        user2.setUserid(UUID.randomUUID().toString());
        user2.setUsername("zhangsan");
        user2.setPassword("123qweASD");

        User user3 = new User();
        user3.setUserid(UUID.randomUUID().toString());
        user3.setUsername("zhangsan");
        user3.setPassword("123qweASD");
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        return userList;

//        return userMapper.getUserList();
    }

}
