/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl_daopattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alexa
 */
public class StudentDAOImpl implements StudentDAO {

    List<Student> students;
    
    public StudentDAOImpl(){
        students = new ArrayList<Student>();
        students.add(new Student("Andre", 0));
        students.add(new Student("Mario", 1));
        students.add(new Student("Ifan", 2));
    }
    
    @Override
    public List<Student> getAllStudents() {
        return students;
    }

    @Override
    public Student getStudent(int rollNo) {
        return students.get(rollNo);
    }

    @Override
    public void updateStudent(Student student) {
        students.get(student.getRollNo())
                .setName(student.getName());
        System.out.println("Siswa berubah jadi Power Ranger!");
    }

    @Override
    public void deleteStudent(Student student) {
        students.remove(student.getRollNo());
        System.out.println("Siswa Terhapus!");
    }
    
}
