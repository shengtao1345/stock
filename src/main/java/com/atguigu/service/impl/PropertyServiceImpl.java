package com.atguigu.service.impl;

import com.atguigu.entity.Property;
import com.atguigu.mapper.PropertyMapper;
import com.atguigu.service.IPropertyService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author author
 * @since 2020-09-25
 */
@Service
public class PropertyServiceImpl extends ServiceImpl<PropertyMapper, Property> implements IPropertyService {

}
