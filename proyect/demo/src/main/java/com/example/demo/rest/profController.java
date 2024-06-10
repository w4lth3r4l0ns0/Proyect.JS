package com.example.demo.rest;

import com.example.demo.modelo.profesores;
import com.example.demo.services.IProfServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class profController {
    IProfServices ProfServices;

    @Autowired
    public profController(IProfServices ProfServices){
        this.ProfServices = ProfServices;
    }
    @GetMapping("/profs")
    public List<profesores> getAll(){
        return ProfServices.GetAllProfs();
    }
    @GetMapping("/prof/{id}")
    public profesores getAll(@PathVariable int id){
        return ProfServices.FindProfById(id);
    }
    @PostMapping("/prof")
    public profesores saveProf(@RequestBody profesores entity) {
        return ProfServices.SaveProf(entity);
    }
    @DeleteMapping("/prof/{id}")
    public void deleteProf(@PathVariable int id) {
        ProfServices.DeleteProf(id);
    }

    @PutMapping("/prof")
    public profesores updateProf(@RequestBody profesores entity) {
        return ProfServices.UpdateProf(entity);
    }
}
