package com.atguigu.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atguigu.entity.Property;
import com.atguigu.service.IPropertyService;
import com.atguigu.util.StockUtil;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author author
 * @since 2020-09-25
 */
@RestController
@RequestMapping("/stack/property")
@Api(value = "仓库属性管理", tags = "仓库属性管理", description = "仓库属性管理")
public class PropertyController {
	@Resource 
	private IPropertyService iPropertyService;
	@ApiOperation(value = "添加一条属性信息")
	@PostMapping("/add")
	public StockUtil<Integer> add(Property property) {
		return iPropertyService.add(property);
	}
	@ApiOperation(value = "修改一条属性信息")
	@PostMapping("/updateId")
	public StockUtil<Integer> updateId(Property property) {
		return iPropertyService.updateId(property);
	}
	@ApiOperation(value = "删除一条属性信息")
	@GetMapping("/delete")
	public StockUtil<Integer> delete(Integer sId) {
		return iPropertyService.delete(sId);
	}
	@ApiOperation(value = "查询属性所有")
	@GetMapping("/findAll")
	public StockUtil<List<Property>> findAll(){
		return iPropertyService.findAll();
	}
	@ApiOperation(value = "根据id查询")
	@GetMapping("/findById")
	public StockUtil<Property> findById(Integer sId) {
		return iPropertyService.findById(sId);
	}
	@ApiOperation(value = "根据属性查")
	@GetMapping("/findProperty")
	public StockUtil<Property> findProperty(String property ) {
		return iPropertyService.findProperty(property);
	}
}
