package com.atguigu.mapper;

import java.util.List;

import com.atguigu.entity.EnterStock;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author author
 * @since 2020-09-25
 */
public interface EnterStockMapper extends BaseMapper<EnterStock> {
List<EnterStock>fidnAll();
}
