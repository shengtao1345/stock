package com.atguigu.service.impl;

import com.atguigu.entity.Student;
import com.atguigu.mapper.StudentMapper;
import com.atguigu.service.IStudentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
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

}
