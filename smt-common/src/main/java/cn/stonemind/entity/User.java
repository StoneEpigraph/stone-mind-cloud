package cn.stonemind.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;


@EqualsAndHashCode(callSuper = true)
@Data
public class User extends BaseEntity{

    private String userid;

    private String username;

    private String password;

    private int gender;

    private String mobile;

    private String email;

    private Date registerTime;

}
