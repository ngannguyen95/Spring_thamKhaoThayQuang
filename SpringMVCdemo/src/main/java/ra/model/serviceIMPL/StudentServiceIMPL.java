package ra.model.serviceIMPL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ra.model.dao.IStudentDAO;
import ra.model.entity.Student;
import ra.model.service.IStudentService;

import java.util.List;
@Service
public class StudentServiceIMPL implements IStudentService {
  @Autowired
   private IStudentDAO studentDAO;
    @Override
    public List<Student> findAll() {
        return studentDAO.findAll();
    }

    @Override
    public Student findById(int id) {
        return studentDAO.findById(id);
    }

    @Override
    public boolean save(Student st) {
        return studentDAO.save(st);
    }

    @Override
    public boolean update(Student st) {
        return studentDAO.update(st);
    }

    @Override
    public boolean delete(int id) {
        return studentDAO.delete(id);
    }
}
