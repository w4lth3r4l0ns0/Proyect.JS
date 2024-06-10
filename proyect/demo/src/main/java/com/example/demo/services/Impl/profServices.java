package com.example.demo.services.Impl;

import com.example.demo.modelo.profesores;
import com.example.demo.repository.IProfRepository;
import com.example.demo.services.IProfServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class profServices implements IProfServices {
    IProfRepository _profRepository;

    @Autowired
    public profServices(IProfRepository profRepository) {
        _profRepository = profRepository;
    }
    @Override
    public List<profesores> GetAllProfs(){
        return _profRepository.findAll();
    }
    @Override
    public profesores SaveProf(profesores entity){
        return null;
    }
    @Override
    public profesores FindProfById(int id){
        Optional<profesores> prof = _profRepository.findById(id);
        if(prof.isPresent())
            return prof.get();
        else
            return new profesores();
    }
    @Override
    public List<profesores> SearchProfs(String name){
        return null;
    }

    @Override
    public void DeleteProf(int id) {
        _profRepository.deleteById(id);
    }

    @Override
    public profesores UpdateProf(profesores entity) {
        Optional<profesores> Prof = _profRepository.findById(entity.getId());
        if (Prof.isPresent()) {
            return _profRepository.save(entity);
        } else {
            return new profesores();
        }
    }
}
