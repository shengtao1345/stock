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
public class OutStock implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "ck_id", type = IdType.AUTO)
    private Integer ckId;

    /**
     * 出库id
     */
    private Integer cId;

    /**
     * 库存id
     */
    private Integer kId;


}
