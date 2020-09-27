package com.atguigu.service;

import java.util.List;

import com.atguigu.entity.OutWarehouse;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author author
 * @since 2020-09-25
 */
public interface IOutWarehouseService extends IService<OutWarehouse> {
	List<OutWarehouse> findAll();
}
