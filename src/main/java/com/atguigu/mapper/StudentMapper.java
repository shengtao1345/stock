package com.atguigu.mapper;

import java.util.List;

import com.atguigu.entity.EnterWarehouse;
import com.atguigu.entity.Student;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * 实习生个人信息 Mapper 接口
 * </p>
 *
 * @author author
 * @since 2020-09-25
 */
public interface StudentMapper extends BaseMapper<Student> {
	//查询所有
	List<Student> findAll();
	//删除
	Integer delete(Integer id); 
	//修改
	Integer update(Student student);
	//添加
	Integer add(Student student);
	//根据姓名
	Student findByName(String tName);
	//根据id
	Student findById(Integer tId);
	//根据类型
	Student findByType(Integer tNumber);
	//根据编号查询报修人姓名
	List<Student> findByNumber(Integer tNumber);
}
