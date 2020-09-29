package com.atguigu.mapper;

import java.util.List;

import com.atguigu.entity.Property;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author author
 * @since 2020-09-25
 */
public interface PropertyMapper extends BaseMapper<Property> {
    //查询所有信息
	List<Property> findAll();
	//添加一条属性数据
	int add(Property property);
	//修改一条属性的数据
	int updateId(Property property);
	//删除一条属性数据
	int  delete(Integer sId);
	//根据属性id查询
	Property findById(Integer sId);
	//根据属性查询
	Property findProperty(String property);
}
