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
 * 
 * </p>
 *
 * @author author
 * @since 2020-09-25
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Guarantee implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 保修id
     */
    @TableId(value = "g_id", type = IdType.AUTO)
    private Integer gId;

    /**
     * 报修人名字
     */
    private String gName;

    /**
     * 电脑编号
     */
    private Integer gNuber;

    /**
     * 状态（0代表已修1代表未修）
     */
    private Integer gStutes;

    /**
     * 报修时间
     */
    private LocalDateTime gTime;


}
