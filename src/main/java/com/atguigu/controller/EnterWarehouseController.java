package com.atguigu.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atguigu.entity.EnterWarehouse;
import com.atguigu.service.IEnterWarehouseService;
import com.atguigu.util.StockUtil;

import io.swagger.annotations.ApiOperation;

import java.util.List;

import javax.annotation.Resource;


/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author author
 * @since 2020-09-25
 */
@RestController
@RequestMapping("/stock/enterWarehouse")
public class EnterWarehouseController {
@Resource
private IEnterWarehouseService iEnterWarehouseService;
	@ApiOperation("查询所有")
	@GetMapping("/findAll")
	public StockUtil<List<EnterWarehouse>> findAll(){
		return iEnterWarehouseService.findAll();
	}
	@ApiOperation("添加")
	@PostMapping("/add")
	public StockUtil<Integer> add(EnterWarehouse enterWarehouse) {
		return iEnterWarehouseService.add(enterWarehouse);
		
	}
	@ApiOperation("更新")
	@PostMapping("/update")
	public StockUtil<Integer> update(EnterWarehouse enterWarehouse) {
		return iEnterWarehouseService.update(enterWarehouse);
	}
	@ApiOperation("删除")
	@GetMapping("/delete")
	public StockUtil<Integer> delete(Integer bId) {
		return iEnterWarehouseService.delete(bId);
	}
	@ApiOperation("根据id查")
	@GetMapping("/findById")
	public StockUtil<EnterWarehouse> findById(Integer bId){
		return iEnterWarehouseService.findById(bId);
	}
	@ApiOperation("根据型号查")
	@GetMapping("/findByModel")
	public StockUtil<EnterWarehouse> findByModel(String bModel){
		return iEnterWarehouseService.findByModel(bModel);
	}
	@ApiOperation("根据类型查")
	@GetMapping("/findByType")
	public StockUtil<EnterWarehouse> findByType(String bType){
		return iEnterWarehouseService.findByType(bType);
	}
	@ApiOperation("根据批次查")
	@GetMapping("/findByBatch")
	public StockUtil<EnterWarehouse> findByBatch(Integer bBatch){
		return iEnterWarehouseService.findByBatch(bBatch);
	}
	
}
