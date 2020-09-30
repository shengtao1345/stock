package com.atguigu.service.impl;

import com.atguigu.entity.EnterWarehouse;
import com.atguigu.entity.Student;
import com.atguigu.mapper.StudentMapper;
import com.atguigu.service.IStudentService;
import com.atguigu.util.StockUtil;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

/**
 * <p>
 * 实习生个人信息 服务实现类
 * </p>
 *
 * @author author
 * @since 2020-09-25
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements IStudentService {
	@Resource
	private StudentMapper studentMapper;
		@Override
		public StockUtil<List<Student>> findAll() {
			// TODO Auto-generated method stub
			StockUtil<List<Student>>  stock = new StockUtil<>();
			List<Student> outWarehouses = new ArrayList<>();
			outWarehouses = studentMapper.findAll();
			stock.setCode(200);
			stock.setMessage("查询成功");
			stock.setData(outWarehouses);
			return stock;
		}

		@Override
		public StockUtil<Integer> delete(Integer id) {
			// TODO Auto-generated method stub
			StockUtil<Integer> stack = new StockUtil<>();
			int i = studentMapper.delete(id);
			stack.setCode(200);
			stack.setMessage("删除成功");
			stack.setData(1);
			return stack;
		}

		@Override
		public StockUtil<Integer> update(Student student) {
			// TODO Auto-generated method stub
			StockUtil<Integer> stock = new StockUtil<>();
			int i = studentMapper.update(student);
			stock.setCode(200);
			stock.setMessage("修改成功");
			stock.setData(1);
			return stock;
		}

		@Override
		public StockUtil<Integer> add(Student student) {
			// TODO Auto-generated method stub
			StockUtil<Integer> stock = new StockUtil<>();
			int i = studentMapper.add(student);
			stock.setCode(200);
			stock.setMessage("添加成功");
			stock.setData(1);
			return stock;
		}

		@Override
		public StockUtil<Student> findByName(String tName) {
			// TODO Auto-generated method stub
			StockUtil<Student> stock = new StockUtil<>();
			Student findById = new Student();
			findById = studentMapper.findByName(tName);
			stock.setCode(200);
			stock.setMessage("查询成功");
			stock.setData(findById);
			return stock;
		}

		@Override
		public StockUtil<Student> findById(Integer tId) {
			// TODO Auto-generated method stub
			StockUtil<Student> stock = new StockUtil<>();
			Student findById = new Student();
			findById = studentMapper.findById(tId);
			stock.setCode(200);
			stock.setMessage("查询成功");
			stock.setData(findById);
			return stock;
		}

		@Override
		public StockUtil<Student> findByType(Integer tNumber) {
			// TODO Auto-generated method stub
			StockUtil<Student> stock = new StockUtil<>();
			Student findType = new Student();
		    findType = studentMapper.findByType(tNumber);
			stock.setCode(200);
			stock.setMessage("查询成功");
			stock.setData(findType);
			return stock;
		}
}
