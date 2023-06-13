package com.unla.grupo12.services;
import java.util.List;
import com.unla.grupo12.entities.Degree;
import com.unla.grupo12.models.DegreeModel;

public interface IDegreeService {

    public List<Degree> getAll();

    public DegreeModel insertOrUpdate(DegreeModel degreeModel);
    
    public boolean remove(int id);
}
