package cn.stonemind.entity;

import lombok.Data;

import java.util.Date;

@Data
public class BaseEntity {

    private String createBy;

    private Date createTime;

    private String modifyBy;

    private Date modifyTime;
}
