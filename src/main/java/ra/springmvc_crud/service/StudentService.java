package ra.springmvc_crud.service;

import ra.springmvc_crud.model.Student;

import java.util.List;

public interface StudentService {
    List<Student> findAll();
    boolean create(Student student);
}
