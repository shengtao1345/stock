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
public class Teacher implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "h_id", type = IdType.AUTO)
    private Integer hId;

    /**
     * 姓名
     */
    private String hName;

    /**
     * 型号
     */
    private String hModel;

    /**
     * 批次
     */
    private Integer hBatch;

    /**
     * 编号
     */
    private Integer hNumber;


}
