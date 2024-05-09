package ra.springmvc_crud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ra.springmvc_crud.model.Student;
import ra.springmvc_crud.repository.StudentRepository;

import java.util.List;

@Service
public class StudentServiceImp implements StudentService {
    //Tạo instance của StudentRepositoryImp - tiêm studentRepositoryImp từ container
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public boolean create(Student student) {
        return studentRepository.create(student);
    }
}
