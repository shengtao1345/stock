package com.atguigu.service.impl;

import com.atguigu.entity.OutWarehouse;
import com.atguigu.mapper.OutWarehouseMapper;
import com.atguigu.service.IOutWarehouseService;
import com.atguigu.util.StockUtil;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author author
 * @since 2020-09-25
 */
@Slf4j
@Service
@Transactional
public class OutWarehouseServiceImpl extends ServiceImpl<OutWarehouseMapper, OutWarehouse> implements IOutWarehouseService {
	@Resource
	private OutWarehouseMapper outWarehouseMapper;

	@Override
	public StockUtil<List<OutWarehouse>> findAll() {
		// TODO Auto-generated method stub
		StockUtil<List<OutWarehouse>>  stock = new StockUtil<>();
		List<OutWarehouse> outWarehouses = new ArrayList<>();
		outWarehouses = outWarehouseMapper.findAll();
		stock.setCode(200);
		stock.setMessage("查询成功");
		stock.setData(outWarehouses);
		return stock;
	}

	@Override
	public StockUtil<Integer> delete(Integer cId) {
		// TODO Auto-generated method stub
		StockUtil<Integer> stack = new StockUtil<>();
		int i = outWarehouseMapper.delete(cId);
		stack.setCode(200);
		stack.setMessage("删除成功");
		stack.setData(1);
		return stack;
	}

	@Override
	public StockUtil<Integer> update(OutWarehouse outWarehouse) {
		// TODO Auto-generated method stub
		StockUtil<Integer> stock = new StockUtil<>();
		int i = outWarehouseMapper.update(outWarehouse);
		stock.setCode(200);
		stock.setMessage("修改成功");
		stock.setData(1);
		return stock;
	}
	@Override
	public StockUtil<Integer> add(OutWarehouse outWarehouse) {
		// TODO Auto-generated method stub
		StockUtil<Integer> stock = new StockUtil<>();
		int i = outWarehouseMapper.add(outWarehouse);
		stock.setCode(200);
		stock.setMessage("添加成功");
		stock.setData(1);
		return stock;
	}

	@Override
	public StockUtil<OutWarehouse> findById(Integer cId) {
		// TODO Auto-generated method stub
		StockUtil<OutWarehouse> stock = new StockUtil<>();
		OutWarehouse findById = new OutWarehouse();
		findById = outWarehouseMapper.findById(cId);
		stock.setCode(200);
		stock.setMessage("查询成功");
		stock.setData(findById);
		return stock;
	}

	@Override
	public StockUtil<OutWarehouse> findCmodel(String cModel) {
		// TODO Auto-generated method stub
		StockUtil<OutWarehouse> stock = new StockUtil<>();
		OutWarehouse findComdel = new OutWarehouse();
		findComdel = outWarehouseMapper.findCmodel(cModel);
		stock.setCode(200);
		stock.setMessage("查询成功");
		stock.setData(findComdel);
		return stock;
	}

	@Override
	public StockUtil<OutWarehouse> findType(String cType) {
		// TODO Auto-generated method stub
		StockUtil<OutWarehouse> stock = new StockUtil<>();
		OutWarehouse findType = new OutWarehouse();
	    findType = outWarehouseMapper.findType(cType);
		stock.setCode(200);
		stock.setMessage("查询成功");
		stock.setData(findType);
		return stock;
	}

	@Override
	public StockUtil<OutWarehouse> findBatch(Integer cBatch) {
		// TODO Auto-generated method stub
		StockUtil<OutWarehouse> stock = new StockUtil<>();
		OutWarehouse findBatch = new OutWarehouse();
		findBatch = outWarehouseMapper.findBatch(cBatch);
		stock.setCode(200);
		stock.setMessage("查询成功");
		stock.setData(findBatch);
		return stock;
	}

}
