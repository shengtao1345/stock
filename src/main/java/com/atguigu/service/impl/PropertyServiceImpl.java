package com.atguigu.service.impl;

import com.atguigu.entity.Property;
import com.atguigu.mapper.PropertyMapper;
import com.atguigu.service.IPropertyService;
import com.atguigu.util.StockUtil;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import io.swagger.annotations.ApiModel;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author author
 * @since 2020-09-25
 */
@ControllerAdvice
@Service
public class PropertyServiceImpl extends ServiceImpl<PropertyMapper, Property> implements IPropertyService {
	@Resource
	private PropertyMapper propertyMapper;
	@ExceptionHandler(NullPointerException.class)
	@Override
	public StockUtil<List<Property>> findAll() {
		// TODO Auto-generated method stub
		StockUtil<List<Property>> stockUtil = new StockUtil<>();
		List<Property> properties = new ArrayList<>();
		properties = propertyMapper.findAll();
		stockUtil.setCode(200);
		stockUtil.setMessage("查询成功");
		stockUtil.setData(properties);
		return stockUtil;
	}

	@Override
	public StockUtil<Integer> add(Property property) {
		// TODO Auto-generated method stub
		StockUtil<Integer> stockUtil = new StockUtil<>();
		int i = propertyMapper.add(property);
		stockUtil.setCode(200);
		stockUtil.setMessage("添加成功");
		stockUtil.setData(1);
		return stockUtil;
	}

	@Override
	public StockUtil<Integer> updateId(Property property) {
		// TODO Auto-generated method stub
		StockUtil<Integer> stockUtil = new StockUtil<>();
		int i = propertyMapper.updateId(property);
		stockUtil.setCode(200);
		stockUtil.setMessage("修改成功");
		stockUtil.setData(1);
		return stockUtil;
	}

	@Override
	public StockUtil<Integer> delete(Integer sId) {
		// TODO Auto-generated method stub
		StockUtil<Integer> stockUtil = new StockUtil<>();
		int i = propertyMapper.delete(sId);
		stockUtil.setCode(200);
		stockUtil.setMessage("删除成功");
		stockUtil.setData(1);
		return stockUtil;
	}
	@Override
	public StockUtil<Property> findById(Integer sId) {
		// TODO Auto-generated method stub
		StockUtil<Property> stockUtil = new StockUtil<>();
		Property findById = new Property();
		findById = propertyMapper.findById(sId);
		stockUtil.setCode(1);
		stockUtil.setMessage("查询成功");
		stockUtil.setData(findById);
		return stockUtil;
	}

	@Override
	public StockUtil<Property> findProperty(String property) {
		// TODO Auto-generated method stub
		StockUtil<Property> stockUtil = new StockUtil<>();
		Property findProperty= new Property();
		findProperty = propertyMapper.findProperty(property);
		stockUtil.setCode(1);
		stockUtil.setMessage("查询成功");
		stockUtil.setData(findProperty);
		return stockUtil;
	}

}
