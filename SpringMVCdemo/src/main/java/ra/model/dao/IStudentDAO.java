package ra.model.dao;

import ra.model.entity.Student;

import java.util.List;

public interface IStudentDAO {
    List<Student> findAll();
    Student findById(int id);
    boolean save(Student st);
    boolean update(Student st);
    boolean delete(int id);
}
