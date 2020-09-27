package com.atguigu.service.impl;

import com.atguigu.entity.OutWarehouse;
import com.atguigu.mapper.OutWarehouseMapper;
import com.atguigu.service.IOutWarehouseService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

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
public class OutWarehouseServiceImpl extends ServiceImpl<OutWarehouseMapper, OutWarehouse> implements IOutWarehouseService {
	@Resource
	private OutWarehouseMapper outWarehouseMapper;

	@Override
	public List<OutWarehouse> findAll() {
		// TODO Auto-generated method stub
		return outWarehouseMapper.findAll();
	}

}
