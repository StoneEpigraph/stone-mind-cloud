package cn.stonemind.entity;

import lombok.Data;

@Data
public class User extends BaseEntity{

    private String id;

    private String username;

    private String password;

    private int age;
}
