package com.atguigu.service;

import java.util.List;

import com.atguigu.entity.Property;
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
public interface IPropertyService extends IService<Property> {
	    //查询所有信息
		StockUtil<List<Property> > findAll();
		//添加一条属性数据
		StockUtil<Integer> add(Property property);
		//修改一条属性的数据
		StockUtil<Integer> updateId(Property property);
		//删除一条属性数据
		StockUtil<Integer> delete(Integer sId);
		//根据属性id查询
		StockUtil<Property> findById(Integer sId);
		//根据属性查询
		StockUtil<Property> findProperty(String property);
}
