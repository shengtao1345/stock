package com.atguigu.service;

import java.util.List;

import com.atguigu.entity.OutWarehouse;
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
public interface IOutWarehouseService extends IService<OutWarehouse> {
	//查询所有信息
 StockUtil<List<OutWarehouse>>findAll();
 //删除一条出库信息
 StockUtil<Integer> delete(Integer cId);
 //修改一条出库信息
 StockUtil<Integer> update(OutWarehouse outWarehouse);
 //添加一条出库的信息
 StockUtil<Integer> add(OutWarehouse outWarehouse);
 //根据出库id查询
 StockUtil<OutWarehouse> findById(Integer cId);
 //根据出库型号查询
 StockUtil<OutWarehouse> findCmodel(String cModel);
 //根据出库类型查询
 StockUtil<OutWarehouse> findType(String cType);
 //根据出库批次查询
 StockUtil<OutWarehouse> findBatch(Integer cBatch);
}
