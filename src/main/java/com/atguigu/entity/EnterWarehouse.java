package com.atguigu.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;

import org.springframework.format.annotation.DateTimeFormat;

import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author author
 * @since 2020-09-25
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class EnterWarehouse implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 入库id
     */
    @TableId(value = "b_id", type = IdType.AUTO)
    private Integer bId;

    /**
     * 类型
     */
    private String bType;

    /**
     * 型号
     */
    private String bModel;

    /**
     * 编号
     * 
     * 
     * 
     */
    private Integer bNumber;

    /**
     * 批次
     */
    private Integer bBatch;

    /**
     * 状态
     */
    private Integer bStutes;

    /**
     * 入库时间
     */
    @TableField("enterTime")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime enterTime;


}
