package com.rjwm5.rjwm5.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 员工实体
 */
@Data
public class Employee implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String username;

    private String name;

    private String password;

    private String phone;

    private String sex;

    private String idNumber;//身份证号码

    private Integer status;

//    设置字段的自动填充
//    注意：此处只是设置公共字段的自动填充策略
//    设置策略后公共字段并不能实现自动填充，
//    还需要设置元数据对象处理器
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateTime;

//    注意：此处存在问题
//    @TableField(fill = FieldFill.INSERT)
    private Long createUser;

//    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Long updateUser;

}
