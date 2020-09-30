package com.atguigu.service;

import java.util.List;

import com.atguigu.entity.EnterWarehouse;
import com.atguigu.util.StockUtil;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author author
 * @since 2020-09-25
 */
public interface IEnterWarehouseService extends IService<EnterWarehouse> {
	StockUtil< List<EnterWarehouse>> findAll();
	StockUtil <Integer> add(EnterWarehouse enterWarehouse);
	StockUtil <Integer> update(EnterWarehouse enterWarehouse);
	StockUtil <Integer> delete(Integer bId);
	StockUtil<EnterWarehouse> findById(Integer bId);
	StockUtil <EnterWarehouse> findByModel(String bModel);
	StockUtil<EnterWarehouse> findByType(String bType);
	StockUtil<EnterWarehouse> findByBatch(Integer bBatch);
}
