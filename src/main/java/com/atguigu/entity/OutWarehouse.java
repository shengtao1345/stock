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
public class OutWarehouse implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "c_id", type = IdType.AUTO)
    private Integer cId;

    /**
     * 类型
     */
    private String cType;

    /**
     * 型号
     */
    private String cModel;

    /**
     * 编号
     */
    private Integer cNumber;

    /**
     * 批次
     */
    private Integer cBatch;

    /**
     * 状态
     */
    private Integer cStutes;

    /**
     * 出库时间
     */
    @TableField("lastTime")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime lastTime;


}
