package com.atguigu.service.impl;

import com.atguigu.entity.EnterWarehouse;
import com.atguigu.entity.OutWarehouse;
import com.atguigu.mapper.EnterWarehouseMapper;
import com.atguigu.service.IEnterWarehouseService;
import com.atguigu.util.StockUtil;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author author
 * @since 2020-09-25
 */
@Service
public class EnterWarehouseServiceImpl extends ServiceImpl<EnterWarehouseMapper, EnterWarehouse> implements IEnterWarehouseService {
@Resource
private EnterWarehouseMapper enterWarehouseMapper;
	@Override
	public StockUtil<List<EnterWarehouse>> findAll() {
		// TODO Auto-generated method stub
		StockUtil<List<EnterWarehouse>>  stock = new StockUtil<>();
		List<EnterWarehouse> outWarehouses = new ArrayList<>();
		outWarehouses = enterWarehouseMapper.findAll();
		stock.setCode(200);
		stock.setMessage("查询成功");
		stock.setData(outWarehouses);
		return stock;
	}

	@Override
	public StockUtil<Integer> add(EnterWarehouse enterWarehouse) {
		// TODO Auto-generated method stub
		StockUtil<Integer> stock = new StockUtil<>();
		int i = enterWarehouseMapper.add(enterWarehouse);
		stock.setCode(200);
		stock.setMessage("添加成功");
		stock.setData(1);
		return stock;
	}

	@Override
	public StockUtil<Integer> update(EnterWarehouse enterWarehouse) {
		// TODO Auto-generated method stub
		StockUtil<Integer> stock = new StockUtil<>();
		int i = enterWarehouseMapper.update(enterWarehouse);
		stock.setCode(200);
		stock.setMessage("修改成功");
		stock.setData(1);
		return stock;
	}

	@Override
	public StockUtil<Integer> delete(Integer bId) {
		// TODO Auto-generated method stub
		StockUtil<Integer> stack = new StockUtil<>();
		int i = enterWarehouseMapper.delete(bId);
		stack.setCode(200);
		stack.setMessage("删除成功");
		stack.setData(1);
		return stack;
	}

	@Override
	public StockUtil<EnterWarehouse> findById(Integer bId) {
		// TODO Auto-generated method stub
		StockUtil<EnterWarehouse> stock = new StockUtil<>();
		EnterWarehouse findById = new EnterWarehouse();
		findById = enterWarehouseMapper.findById(bId);
		stock.setCode(200);
		stock.setMessage("查询成功");
		stock.setData(findById);
		return stock;
	}

	

	@Override
	public StockUtil<EnterWarehouse> findByType(String bType) {
		// TODO Auto-generated method stub
		StockUtil<EnterWarehouse> stock = new StockUtil<>();
		EnterWarehouse findType = new EnterWarehouse();
	    findType = enterWarehouseMapper.findByType(bType);
		stock.setCode(200);
		stock.setMessage("查询成功");
		stock.setData(findType);
		return stock;
	}

	@Override
	public StockUtil<EnterWarehouse> findByBatch(Integer bBatch) {
		// TODO Auto-generated method stub
		StockUtil<EnterWarehouse> stock = new StockUtil<>();
		EnterWarehouse findBatch = new EnterWarehouse();
		findBatch = enterWarehouseMapper.findByBatch(bBatch);
		stock.setCode(200);
		stock.setMessage("查询成功");
		stock.setData(findBatch);
		return stock;
	}

	@Override
	public StockUtil<EnterWarehouse> findByModel(String bModel) {
		// TODO Auto-generated method stub
		StockUtil<EnterWarehouse> stock = new StockUtil<>();
		EnterWarehouse findComdel = new EnterWarehouse();
		findComdel = enterWarehouseMapper.findByModel(bModel);
		stock.setCode(200);
		stock.setMessage("查询成功");
		stock.setData(findComdel);
		return stock;
	}

}
