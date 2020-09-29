package com.atguigu.mapper;

import java.util.List;

import com.atguigu.entity.OutWarehouse;
import com.atguigu.util.StockUtil;
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
 //删除一条出库信息
 int delete(Integer cId);
 //修改一条出库信息
 int update(OutWarehouse outWarehouse);
 //添加一条出库的信息
 int add(OutWarehouse outWarehouse);
 //根据出库id查询
 OutWarehouse findById(Integer cId);
 //根据出库型号查询
 OutWarehouse findCmodel(String cModel);
 //根据出库类型查询
 OutWarehouse findType(String cType);
 //根据出库批次查询
 OutWarehouse findBatch(Integer cBatch);
}
