package com.atguigu.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atguigu.entity.Price;
import com.atguigu.service.IPriceService;
import com.atguigu.util.StockUtil;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.models.auth.In;

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
@RequestMapping("/stack/price")
@Api(value = "价格管理", tags = "价格库管理", description = "价格出库管理")
public class PriceController {
@Resource
private IPriceService iPriceService;
@ApiOperation(value = "查询价格所有")
@GetMapping("findAll")
public StockUtil<List<Price>> findAll(){
	return iPriceService.findAll();
}
@ApiOperation(value = "添加一条价格信息")
@PostMapping("/add")
public StockUtil<Integer>add(Price price) {
	return iPriceService.add(price);
}
@ApiOperation(value = "删除一条价格信息")
@GetMapping("/deleteId")
public StockUtil<Integer> deleteId(Integer pId) {
	return iPriceService.deleteId(pId);
}
@ApiOperation(value = "修改一条价格信息")
@PostMapping("/update")
public StockUtil<Integer> update(Price price) {
	return iPriceService.update(price);
}
@ApiOperation(value = "根据型号查")
@GetMapping("/findModel")
public StockUtil<Price> findModel(String pModel) {
	return iPriceService.findModel(pModel);
}
@ApiOperation(value = "根据批次查")
@GetMapping("/findBatch")
public StockUtil<Price>findBatch(Integer pBatch) {
	return iPriceService.findBatch(pBatch);
}
@ApiOperation(value = "根据批次查")
@GetMapping("/findType")
public StockUtil<Price> findType(String pType) {
	return iPriceService.findType(pType);
}
}
