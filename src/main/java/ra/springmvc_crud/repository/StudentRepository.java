package ra.springmvc_crud.repository;

import ra.springmvc_crud.model.Student;

import java.util.List;

public interface StudentRepository {
    List<Student> findAll();
    boolean create(Student student);
}
