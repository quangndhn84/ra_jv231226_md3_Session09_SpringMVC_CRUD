package ra.springmvc_crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ra.springmvc_crud.model.Student;
import ra.springmvc_crud.service.StudentService;

import java.util.List;

@Controller
@RequestMapping("/studentController")
public class StudentController {
    @Autowired
    private StudentService studentService;

    //    @RequestMapping(value = "/findAll",method = RequestMethod.GET)
    @GetMapping("/findAll")
    public ModelAndView getAllStudent() {
        ModelAndView mav = new ModelAndView("students");
        List<Student> listStudent = studentService.findAll();
        mav.addObject("listStudent", listStudent);
        return mav;
    }

    @GetMapping("/initCreate")
    public ModelAndView initCreateStudent() {
        ModelAndView mav = new ModelAndView("newStudent");
        Student studentNew = new Student();
        mav.addObject("studentNew", studentNew);
        return mav;
    }
    @PostMapping("/create")
    public String createStudent(@ModelAttribute("newStudent") Student student){
        boolean result = studentService.create(student);
        if (result){
            return "redirect:findAll";
        }
        return "error";
    }
}
