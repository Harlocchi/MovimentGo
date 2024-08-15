package com.uenp.demo.Services;

import com.uenp.demo.Models.Entity.Instituition;
import com.uenp.demo.Repositories.InstituitionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstituitionService {

    @Autowired
    private InstituitionRepository instituitionRepository;



    public Instituition createInstituition(Instituition instituition) {
        return instituitionRepository.save(instituition);
    }

    public Instituition getInstituitionById(String id) {
        return instituitionRepository.findById(id).orElseThrow(() -> new RuntimeException("Instituition not found"));
    }

    public List<Instituition> getAllInstituitions() {
        return instituitionRepository.findAll();
    }

    public Instituition updateInstituition(String id, Instituition instituitionDetails) {
        Instituition existingInstituition = getInstituitionById(id);
        existingInstituition.setName(instituitionDetails.getName());
        existingInstituition.setCity(instituitionDetails.getCity());
        existingInstituition.setPhone(instituitionDetails.getPhone());
        return instituitionRepository.save(existingInstituition);
    }

    public void deleteInstituition(String id) {
        instituitionRepository.deleteById(id);
    }

}
