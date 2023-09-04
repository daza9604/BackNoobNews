package pe.edu.upc.aaw.demo01.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.demo01.entities.Interaccion;
import pe.edu.upc.aaw.demo01.entities.Publicacion;
import pe.edu.upc.aaw.demo01.repositories.IInterfaceRepository;
import pe.edu.upc.aaw.demo01.servicesinterfaces.IInteraccionService;

import java.util.List;

@Service
public class InteraccionServiceImplement implements IInteraccionService {

    @Autowired
    private IInterfaceRepository intR;

    @Override
    public void insert(Interaccion interaccion) {
        intR.save(interaccion);
    }

    @Override
    public List<Interaccion> findByIdNews(Publicacion news) {
        return null;
    }
}