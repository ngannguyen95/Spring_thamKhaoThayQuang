package ra.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import ra.model.entity.Student;
import ra.model.serviceIMPL.StudentServiceIMPL;

import java.util.List;

@Controller
// map controller vơí đường dẫn
@RequestMapping("studentController")
public class StudentController {
    @Autowired

    private StudentServiceIMPL studentServiceIMPL;

    @RequestMapping("hello123")
    public String helloJava8() {
        return "hello";
    }

    @RequestMapping(value = "getAll")
    public ModelAndView getAllStudent() {
        ModelAndView mav = new ModelAndView("students");
        List<Student> studentList = studentServiceIMPL.findAll();
        mav.addObject("liststudent", studentList);
        return mav;
    }

    @GetMapping("initCreate")
    public String initCreate(ModelMap ma) {
        Student stNew = new Student();
        ma.addAttribute("stNew", stNew);
        return "studentNew";
    }
    @PostMapping("create")
    public String createStudent(@ModelAttribute("stnew") Student stNew){
       boolean result =studentServiceIMPL.save(stNew);
       if (result){
           return "redirect:getAll";
       }else {
           return "error";
       }
    }
}
