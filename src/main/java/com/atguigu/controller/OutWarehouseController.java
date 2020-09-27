package com.atguigu.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.atguigu.entity.OutWarehouse;
import com.atguigu.service.IOutWarehouseService;

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
@Controller
@RequestMapping("/stack/outWarehouse")
public class OutWarehouseController {
@Resource
private IOutWarehouseService iOutWarehouseService;
@GetMapping("/findAll")
public List<OutWarehouse> findAll(){
	return iOutWarehouseService.findAll();
}
}
