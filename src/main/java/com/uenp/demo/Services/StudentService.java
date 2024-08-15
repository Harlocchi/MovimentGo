package com.uenp.demo.Services;

import com.uenp.demo.Models.Entity.Student;
import com.uenp.demo.Repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    public Student getStudentById(String id) {
        return studentRepository.findById(id).orElseThrow(() -> new RuntimeException("Student not found"));
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student updateStudent(String id, Student studentDetails) {
        Student existingStudent = getStudentById(id);
        existingStudent.setName(studentDetails.getName());
        existingStudent.setCity(studentDetails.getCity());
        existingStudent.setBirthday(studentDetails.getBirthday());
        existingStudent.setGender(studentDetails.getGender());
        existingStudent.setIntituitionId(studentDetails.getIntituitionId());
        existingStudent.setClassroom(studentDetails.getClassroom());
        return studentRepository.save(existingStudent);
    }

    public void deleteStudent(String id) {
        studentRepository.deleteById(id);
    }

}
