package com.atguigu.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atguigu.entity.Student;
import com.atguigu.service.IStudentService;
import com.atguigu.util.StockUtil;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import java.util.List;

import javax.annotation.Resource;



/**
 * <p>
 * 实习生个人信息 前端控制器
 * </p>
 *
 * @author author
 * @since 2020-09-25
 */
@RestController
@RequestMapping("/stock/student")
@Api(value = "学生管理", tags = "学生管理", description = "学生管理")
public class StudentController {
@Resource
private IStudentService iStudentService;

	@ApiOperation("查询所有")
	@GetMapping("/findAll")
	public List<Student> findAll(){
		return iStudentService.list();
	}
	@ApiOperation("添加")
	@PostMapping("/add")
	public StockUtil<Integer> add(Student student) {
		return iStudentService.add(student);
	}
	@ApiOperation("更新")
	@PostMapping("/update")
	public StockUtil<Integer> update(Student student) {
		return iStudentService.update(student);
	}
	@ApiOperation("删除")
	@GetMapping("/delete/{id}")
	public StockUtil<Integer> delete(Integer id) {
		return iStudentService.delete(id);
	}
	@ApiOperation("根据姓名")
	@GetMapping("/findByName")
	public StockUtil<Student> findByName(String tName){
		return iStudentService.findByName(tName);
	}
	@ApiOperation("根据姓名")
	@GetMapping("/findById")
	public StockUtil<Student> findById(Integer tId){
		return iStudentService.findById(tId);
	}
	@ApiOperation("根据姓名")
	@GetMapping("/findByType")
	public StockUtil<Student> findByType(Integer tNumber){
		return iStudentService.findByType(tNumber);
	}
}
