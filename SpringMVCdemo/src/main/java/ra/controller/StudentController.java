package ra.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
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
    public String initCreate(Model model) {
        Student stNew = new Student();
        model.addAttribute("stNew", stNew);
        return "studentNew";
    }

    @PostMapping("create")
    public String createStudent(@ModelAttribute("stNew") Student stNew) {
        boolean result = studentServiceIMPL.save(stNew);
        if (result) {
            return "redirect:getAll";
        } else {
            return "error";
        }
    }

    @GetMapping("initUpdate")
    public String initUpdate(Model model, int id) {
        Student stUpdate = studentServiceIMPL.findById(id);
        model.addAttribute("stUpdate", stUpdate);
        return "studentUpdate";
    }

    @PostMapping("update")
    public String updateStudent(Student stUpdate){
        boolean result = studentServiceIMPL.update(stUpdate);
        if (result){
            return "redirect:getAll";
        }else{
            return "error";
        }
    }
    @GetMapping("delete")
    public String deleteStudent(int id){
        boolean result = studentServiceIMPL.delete(id);
        if (result){
            return "redirect:getAll";
        }else {
            return "error";
        }
    }
}
