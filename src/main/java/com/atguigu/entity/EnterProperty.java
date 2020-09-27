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
public class EnterProperty implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "sb_id", type = IdType.AUTO)
    private Integer sbId;

    /**
     * 属性id
     */
    private Integer sId;

    /**
     * 入库id
     */
    private Integer bId;


}
