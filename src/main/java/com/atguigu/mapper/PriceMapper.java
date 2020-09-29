package com.atguigu.mapper;

import java.util.List;

import com.atguigu.entity.Price;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author author
 * @since 2020-09-25
 */
public interface PriceMapper extends BaseMapper<Price> {
	//添加一条价格表数据
   int add(Price price);
   //修改一条价格的数据
   int update(Price price);
   //删除一条价格的数据
   int deleteId(Integer pId);
   //查询所有数据
   List<Price> findAll();
   //根据类型查询
   Price findModel(String pModel);
   //根据批次查询
   Price findBatch(Integer pBatch);
   //根据型号查询
   Price findType(String pType);
   
}
