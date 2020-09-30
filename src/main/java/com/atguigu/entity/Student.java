package com.atguigu.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 实习生个人信息
 * </p>
 *
 * @author author
 * @since 2020-09-25
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Student implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 实习生id
     */
    @TableId(value = "t_id", type = IdType.AUTO)
    private Integer tId;

    /**
     * 实习生姓名
     */
    private String tName;

    /**
     * 实习生性别
     */
    private String tSex;

    /**
     * 实习生年龄
     */
    private Integer tAge;

    /**
     * 实习生出生日期
     */
    private LocalDateTime tBirthday;

    /**
     * 实习生身份证号
     */
    private String tIdCard;

   

    /**
     * 实习生家庭住址
     */
    private String tAddress;

    /**
     * 实习生入职时间
     */
    private LocalDateTime tEntryTime;

    /**
     * 实习生修改时间
     */
    private LocalDateTime tUpdateTime;

    /**
     * 实习生状态（0：不存在，1：存在）
     */
    private String tStatus;

    /**
     * 电脑编号
     */
    private String tNumber;


}
