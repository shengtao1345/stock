package com.atguigu.mapper;

import java.util.List;

import com.atguigu.entity.OutWarehouse;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author author
 * @since 2020-09-25
 */
public interface OutWarehouseMapper extends BaseMapper<OutWarehouse> {
	//查询所有信息
 List<OutWarehouse> findAll();
}
