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
     * 实习生手机号1
     */
    private String tPhone1;

    /**
     * 实习生手机号2
     */
    private String tPhone2;

    /**
     * 实习生银行卡号1
     */
    private String tBankNum1;

    /**
     * 实习生银行卡号2
     */
    private String tBankNum2;

    /**
     * 实习生家庭住址
     */
    private String tAddress;

    /**
     * 实习生紧急联系人1电话
     */
    private String tWornningNum1;

    /**
     * 实习生紧急联系人1关系
     */
    private String tWornningRelation1;

    /**
     * 实习生紧急联系人1姓名
     */
    private String tWornningName1;

    /**
     * 实习生紧急联系人2电话
     */
    private String tWornningNum2;

    /**
     * 实习生紧急联系人2关系
     */
    private String tWornningRelation2;

    /**
     * 实习生紧急联系人2姓名
     */
    private String tWornningName2;

    /**
     * 实习生学历
     */
    private String tEducation;

    /**
     * 实习生毕业学校
     */
    private String tSchool;

    /**
     * 实习生毕业院系
     */
    private String tFaculty;

    /**
     * 实习生专业
     */
    private String tMajor;

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