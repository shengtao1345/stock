package com.atguigu.service;

import java.util.List;

import com.atguigu.entity.Price;
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
public interface IPriceService extends IService<Price> {
	   //添加一条价格表数据
	   StockUtil<Integer> add(Price price);
	   //修改一条价格的数据
	   StockUtil<Integer> update(Price price);
	   //删除一条价格的数据
	   StockUtil<Integer> deleteId(Integer pId);
	   //查询所有数据
	   StockUtil<List<Price> >findAll();
	   //根据类型查询
	   StockUtil<Price> findModel(String pModel);
	   //根据批次查询
	   StockUtil<Price> findBatch(Integer pBatch);
	   //根据型号查询
	   StockUtil<Price>  findType(String pType);
	   
}
