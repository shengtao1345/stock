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
public class StudentGuarantee implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 学生和保修关系id、
     */
    @TableId(value = "gt_id", type = IdType.AUTO)
    private Integer gtId;

    /**
     * 学生id
     */
    private Integer tId;

    /**
     * 保修id
     */
    private Integer gId;


}
