package com.atguigu.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atguigu.entity.OutWarehouse;
import com.atguigu.service.IOutWarehouseService;
import com.atguigu.util.StockUtil;

import io.swagger.annotations.Api;
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
@RequestMapping("/stack/outWarehouse")
@Api(value = "仓库出库管理", tags = "仓库出库管理", description = "仓库出库管理")
public class OutWarehouseController {
@Resource
private IOutWarehouseService iOutWarehouseService;
@ApiOperation(value = "查询出库所有")
@GetMapping("/findAll")
public StockUtil<List<OutWarehouse>> findAll(){
	return iOutWarehouseService.findAll();
}
@ApiOperation(value = "添加一条出库信息")
@PostMapping("/add")
public StockUtil<Integer> add(OutWarehouse outWarehouse) {
	return iOutWarehouseService.add(outWarehouse);
}
@ApiOperation(value = "删除一条出库信息")
@GetMapping("/delete")
public StockUtil<Integer> delete(Integer cId) {
	return iOutWarehouseService.delete(cId);
}
@ApiOperation(value = "修改一条出库信息")
@PostMapping("/update")
public StockUtil<Integer> update(OutWarehouse outWarehouse) {
	return iOutWarehouseService.update(outWarehouse);
}
@ApiOperation(value = "根据出库id查询")
@GetMapping("/findById")
public StockUtil<OutWarehouse> findById(Integer cId) {
	return iOutWarehouseService.findById(cId);
}
@ApiOperation(value = "查询出库型号查")
@GetMapping("/findCmodel")
public StockUtil<OutWarehouse> findCmodel(String CModel) {
	return iOutWarehouseService.findCmodel(CModel);
}
@ApiOperation(value = "查询出库类型查")
@GetMapping("/findType")
public StockUtil<OutWarehouse> findType(String cType) {
	return iOutWarehouseService.findType(cType);
}
@ApiOperation(value = "查询出库批次查")
@GetMapping("/findBatch")
public StockUtil<OutWarehouse> findBatch(Integer cBatch) {
	return iOutWarehouseService.findBatch(cBatch);
}
}
