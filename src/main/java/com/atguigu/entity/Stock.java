package com.atguigu.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
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
public class Stock implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 库存id
     */
    @TableId(value = "k_id", type = IdType.AUTO)
    private Integer kId;

    /**
     * 类型
     */
    private String kType;

    /**
     * 型号
     */
    private String kModel;

    /**
     * 编号
     */
    private Integer kNumber;

    /**
     * 批次
     */
    private Integer kBatch;

    /**
     * 状态(0：未修改 1：已修改)
     */
    private Integer kStutes;


}
