package com.atguigu.service;

import java.util.List;

import com.atguigu.entity.EnterWarehouse;
import com.atguigu.entity.Student;
import com.atguigu.util.StockUtil;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 实习生个人信息 服务类
 * </p>
 *
 * @author author
 * @since 2020-09-25
 */
public interface IStudentService extends IService<Student> {

	//查询所有
		StockUtil<List<Student>> findAll();
		//删除
		StockUtil< Integer> delete(Integer id); 
		//修改
		StockUtil< Integer> update(Student student);
		//添加
		StockUtil< Integer> add(Student student);
		//根据姓名
		StockUtil<Student> findByName(String tName);
		//根据id
		StockUtil<Student> findById(Integer tId);
		//根据类型
		StockUtil<Student> findByType(Integer tNumber);

}
