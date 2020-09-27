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
public class Property implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id

     */
    @TableId(value = "s_id", type = IdType.AUTO)
    private Integer sId;

    /**
     * 属性
     */
    private String property;


}
