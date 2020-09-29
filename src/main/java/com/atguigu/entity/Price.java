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
public class Price implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "p_id", type = IdType.AUTO)
    private Integer pId;

    /**
     * 类型
     */
    private String pType;

    /**
     * 价格
     */
    private Double pMoney;

    /**
     * 批次
     */
    private Integer pBatch;

    /**
     * 型号
     */
    private String pModel;
    /**
     * 状态
     */
}
