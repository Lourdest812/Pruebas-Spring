package com.unla.grupo12.services;
import com.unla.grupo12.entities.Dispositivo;
import com.unla.grupo12.models.DispositivoModel;

import java.util.List;

public interface IDispositivoService {
    public List<Dispositivo> getAll();

    public DispositivoModel insertOrUpdate(DispositivoModel dispositivoModel);
    
    public boolean remove(int id);
}
