package ra.model.daoIMPL;

import org.springframework.stereotype.Repository;
import ra.model.dao.IStudentDAO;
import ra.model.entity.Student;
import ra.model.util.ConnectionDB;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@Repository // để đăng kí cho container khi bắt đầu chạy
public class StudentDAOIMPL implements IStudentDAO {
    @Override
    public List<Student> findAll() {
        Connection conn = null;
        CallableStatement callSt = null;
        List<Student> studentList = null;
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call getAllStudent()}");
            ResultSet rs = callSt.executeQuery();
            studentList = new ArrayList<>();
            while (rs.next()) {
                Student student = new Student();
                student.setId(rs.getInt("id"));
                student.setName(rs.getString("name"));
                student.setAge(rs.getInt("age"));
                student.setAddress(rs.getString("address"));
                student.setbirtDate(rs.getDate("birthDate"));
                student.setStatus(rs.getBoolean("status"));
                studentList.add(student);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return studentList;
    }

    @Override
    public Student findById(int id) {
        Connection conn = null;
        CallableStatement callSt = null;
        Student student = null;
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call getStudentById(?)}");
            callSt.setInt(1, id);
            ResultSet rs = callSt.executeQuery();
            student = new Student();
            if (rs.next()) {
                student.setId(rs.getInt("id"));
                student.setName(rs.getString("name"));
                student.setAge(rs.getInt("age"));
                student.setAddress(rs.getString("address"));
                student.setbirtDate(rs.getDate("birthDate"));
                student.setStatus(rs.getBoolean("status"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return student;
    }

    @Override
    public boolean save(Student st) {
        Connection conn = null;
        CallableStatement callSt = null;
        boolean result = false;
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call insertStudent(?,?,?,?,?,?)}");
            callSt.setString(1, st.getName());
            callSt.setInt(2, st.getAge());
            callSt.setBoolean(3, st.isSex());
            callSt.setString(4, st.getAddress());
            callSt.setDate(5, new Date(st.getbirtDate().getTime()));
            callSt.setBoolean(6, st.isStatus());
            callSt.executeUpdate();
            result = true;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return result;
    }

    @Override
    public boolean update(Student st) {
        Connection conn = null;
        CallableStatement callSt = null;
        boolean result = false;
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call updateStudent(?,?,?,?,?,?,?)}");
            callSt.setInt(1,st.getId());
            callSt.setString(2, st.getName());
            callSt.setInt(3, st.getAge());
            callSt.setBoolean(4, st.isSex());
            callSt.setString(5, st.getAddress());
            callSt.setDate(6, new Date(st.getbirtDate().getTime()));
            callSt.setBoolean(7, st.isStatus());
            callSt.executeUpdate();
            result = true;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return result;

    }

    @Override
    public boolean delete(int id) {
        Connection conn = null;
        CallableStatement callSt = null;
        boolean result = false;
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call deleteStudent(?)}");
            callSt.setInt(1,id);
            callSt.executeUpdate();
            result = true;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return result;
    }
}
