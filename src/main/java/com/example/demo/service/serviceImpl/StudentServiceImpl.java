package com.example.demo.service.serviceImpl;

import com.example.demo.dao.StudentMapper;
import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {

    private StudentMapper studentDao;
    @Autowired
    public void setStudentDao(StudentMapper studentDao){
        this.studentDao = studentDao;
    }

    @Override
    public int deleteByPrimaryKey(Long studentId) {
        return studentDao.deleteByPrimaryKey(studentId);
    }

    @Override
    public int insert(Student record) {
        return studentDao.insert(record);
    }

    @Override
    public int insertSelective(Student record) {
        return studentDao.insertSelective(record);
    }

    @Override
    public Student selectByPrimaryKey(Long studentId) {
        return studentDao.selectByPrimaryKey(studentId);
    }

    @Override
    public int updateByPrimaryKeySelective(Student record) {
        return studentDao.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Student record) {
        return studentDao.updateByPrimaryKey(record);
    }

}
