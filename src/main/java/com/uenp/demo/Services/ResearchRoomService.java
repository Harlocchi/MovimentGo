package com.uenp.demo.Services;

import com.uenp.demo.Models.Entity.ResearchRoom;
import com.uenp.demo.Models.Entity.Student;
import com.uenp.demo.Models.Entity.StudentMABCtest;
import com.uenp.demo.Models.Entity.User;
import com.uenp.demo.Repositories.ResearchRoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResearchRoomService {

    @Autowired
    private ResearchRoomRepository researchRoomRepository;

    public ResearchRoom addResearchRoom(ResearchRoom rr){
        return researchRoomRepository.save(rr);
    }

    public List<ResearchRoom> findAll(){
        return researchRoomRepository.findAll();
    }

    public ResearchRoom findById(String id){
        return researchRoomRepository.findById(id).orElseThrow(() -> new RuntimeException("ResearchRoom not found"));
    }

    public ResearchRoom updateById(String id, ResearchRoom newUser){
        ResearchRoom rr = researchRoomRepository.findById(id).get();
        rr.setName(newUser.getName());
        rr.setInstituition(newUser.getInstituition());
        return researchRoomRepository.save(rr);
    }

    public void deleteById(String id) {
        researchRoomRepository.deleteById(id);
    }

    public void AddStudent(String rrID,StudentMABCtest student){
        ResearchRoom rrAtual = researchRoomRepository.findById(rrID).get();
        List<StudentMABCtest> atualList = rrAtual.getStudentsMABC();
        atualList.add(student);
        rrAtual.setStudentsMABC(atualList);
        researchRoomRepository.save(rrAtual);
    }

    public void addStudent(String rrID,StudentMABCtest student){
        ResearchRoom rrAtual = researchRoomRepository.findById(rrID).get();
        List<StudentMABCtest> atualList = rrAtual.getStudentsMABC();
        atualList.add(student);
        rrAtual.setStudentsMABC(atualList);
        researchRoomRepository.save(rrAtual);
    }

    public void removeStudent(String rrID,String student){
        ResearchRoom rrAtual = researchRoomRepository.findById(rrID).get();

        //podemos já procurar e remover ao mesmo tempo
        rrAtual.getStudentsMABC().removeIf(s -> s.getId().equals(student));
        /*List<StudentMABCtest> atualList = rrAtual.getStudentsMABC();
        StudentMABCtest studentAtual = atualList.stream()
                .filter(s -> s.getId().equals(student))
                .findFirst()
                .orElse(null);*/
        researchRoomRepository.save(rrAtual);
    }

    public StudentMABCtest getStudent(String studentID, String rrID){
        return findById(rrID).getStudentsMABC().stream()
                .filter(s -> s.getId().equals(studentID))
                .findFirst().orElse(null);
    }

    public StudentMABCtest updateStudent(String rrID ,StudentMABCtest student){
        ResearchRoom rrAtual = researchRoomRepository.findById(rrID).get();
        List<StudentMABCtest> listToModify = rrAtual.getStudentsMABC();

        StudentMABCtest oldStudent = rrAtual.getStudentsMABC().stream()
                .filter(s -> s.getId().equals(student.getId()))
                .findFirst()
                .orElse(null);

        if (oldStudent != null) {
            oldStudent.setMabctest(student.getMabctest());
            listToModify.removeIf(s -> s.getId().equals(oldStudent.getId()));
            listToModify.add(oldStudent);
            rrAtual.setStudentsMABC(listToModify);
        }
        return oldStudent;
    }


}
