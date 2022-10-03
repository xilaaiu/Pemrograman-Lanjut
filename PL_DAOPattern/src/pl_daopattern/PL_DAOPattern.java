/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pl_daopattern;

/**
 *
 * @author alexa
 */
public class PL_DAOPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        StudentDAOImpl studentDao = new StudentDAOImpl();
        
        //getAllStudents
        for(Student student : studentDao.getAllStudents()){
            System.out.println("Student : " + student.getName());
        } 
        
        //updateStudents
        Student student = studentDao.getStudent(0);
        student.setName("Andre update");
        studentDao.updateStudent(student);
        
        //getSTudent
        Student student_2 = studentDao.getStudent(0);
        System.out.println("Student Andre berubah menjadi " + student_2.getName());
    }
    
}
