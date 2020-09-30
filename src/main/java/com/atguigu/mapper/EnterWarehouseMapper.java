package com.atguigu.mapper;

import java.util.List;

import com.atguigu.entity.EnterWarehouse;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author author
 * @since 2020-09-25
 */
public interface EnterWarehouseMapper extends BaseMapper<EnterWarehouse> {
	List<EnterWarehouse> findAll();
	int add(EnterWarehouse enterWarehouse);
	int update(EnterWarehouse enterWarehouse);
	int delete(Integer bId);
	EnterWarehouse findById(Integer bId);
	EnterWarehouse findByModel(String bModel);
	EnterWarehouse findByType(String bType);
	EnterWarehouse findByBatch(Integer bBatch);
}
