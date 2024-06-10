package com.example.demo.services;

import com.example.demo.modelo.profesores;

import java.util.List;

public interface IProfServices {
    List<profesores> GetAllProfs();
    profesores SaveProf(profesores entity);
    profesores FindProfById(int id);
    List<profesores> SearchProfs(String name);
    profesores UpdateProf(profesores entity);
    void DeleteProf(int id);
}
