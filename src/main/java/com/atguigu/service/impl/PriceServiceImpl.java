package com.atguigu.service.impl;

import com.atguigu.entity.Price;
import com.atguigu.mapper.PriceMapper;
import com.atguigu.service.IPriceService;
import com.atguigu.util.StockUtil;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;


import io.swagger.models.auth.In;
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
public class PriceServiceImpl extends ServiceImpl<PriceMapper, Price> implements IPriceService {
	@Resource
	private PriceMapper priceMapper;

	@Override
	public StockUtil<Integer> add(Price price) {
		// TODO Auto-generated method stub
		StockUtil<Integer> stockUtil = new StockUtil<>();
		int i = priceMapper.add(price);
		stockUtil.setCode(200);
		stockUtil.setMessage("添加成功");
		stockUtil.setData(1);
		return stockUtil;
	}

	@Override
	public StockUtil<Integer> update(Price price) {
		// TODO Auto-generated method stub
		StockUtil<Integer> stockUtil = new StockUtil<>();
		int i = priceMapper.update(price);
		stockUtil.setCode(200);
		stockUtil.setMessage("修改成功");
		stockUtil.setData(1);
		return stockUtil;
	}

	@Override
	public StockUtil<Integer>deleteId(Integer pId) {
		// TODO Auto-generated method stub
		StockUtil<Integer> stockUtil = new StockUtil<>();
		int i = priceMapper.deleteId(pId);
		stockUtil.setCode(200);
		stockUtil.setMessage("删除成功");
		stockUtil.setData(1);
		return stockUtil;
	}

	@Override
	public StockUtil<List<Price> > findAll() {
		// TODO Auto-generated method stub
		StockUtil<List<Price> > stockUtil = new StockUtil<>();
		List<Price> prices = new ArrayList<>();
		prices = priceMapper.findAll();
		stockUtil.setCode(200);
		stockUtil.setMessage("查询成功");
		stockUtil.setData(prices);
		return stockUtil;
	}

	@Override
	public StockUtil<Price> findModel(String pModel) {
		// TODO Auto-generated method stub
		StockUtil<Price> stockUtil = new StockUtil<>();
		Price findModel = new Price();
		findModel = priceMapper.findModel(pModel);
		stockUtil.setCode(200);
		stockUtil.setMessage("查询成功");
		stockUtil.setData(findModel);
		return stockUtil;
	}

	@Override
	public StockUtil<Price> findBatch(Integer pBatch) {
		// TODO Auto-generated method stub
		StockUtil<Price> stockUtil = new StockUtil<>();
		Price findBatch= new Price();
		findBatch = priceMapper.findBatch(pBatch);
		stockUtil.setCode(200);
		stockUtil.setMessage("查询成功");
		stockUtil.setData(findBatch);
		return stockUtil;
	}

	@Override
	public StockUtil<Price> findType(String pType) {
		// TODO Auto-generated method stub
		StockUtil<Price> stockUtil = new StockUtil<>();
		Price findType= new Price();
		findType = priceMapper.findType(pType);
		stockUtil.setCode(200);
		stockUtil.setMessage("查询成功");
		stockUtil.setData(findType);
		return stockUtil;
	}

}
