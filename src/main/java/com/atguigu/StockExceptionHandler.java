package com.atguigu;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.atguigu.util.StockUtil;


@ControllerAdvice(basePackages = {"com.atguigu.controller"})
public class StockExceptionHandler {
	@ExceptionHandler(value = Exception.class)
	public StockUtil<?> defaultErrorHandler(Exception e){
		System.out.println("异常信息："+e.getMessage());
		StockUtil<Boolean> comm=new StockUtil<>();
		comm.setCode(500);
        comm.setMessage("发生未知错误");
		return comm;
	}
}
