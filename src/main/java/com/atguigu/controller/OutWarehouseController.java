package com.atguigu.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atguigu.entity.OutWarehouse;
import com.atguigu.service.IOutWarehouseService;

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
@RequestMapping("/stack/outWarehouse")
public class OutWarehouseController {
@Resource
private IOutWarehouseService iOutWarehouseService;
@GetMapping("/findAll")
public List<OutWarehouse> findAll(){
	return iOutWarehouseService.findAll();
}
}
