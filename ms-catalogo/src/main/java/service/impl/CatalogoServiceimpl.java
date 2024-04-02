package service.impl;

import entity.Catalogo;
import org.springframework.stereotype.Service;
import service.CatalogoService;

import java.util.List;
import java.util.Optional;

@Service
public class CatalogoServiceimpl implements CatalogoService {

    @Override
    public List<Catalogo> listar() {
        return null;
    }

    @Override
    public Catalogo guardar(Catalogo Catalogo) {
        return null;
    }

    @Override
    public Catalogo actualizar(Catalogo Catalogo) {
        return null;
    }

    @Override
    public Optional<Catalogo> listarPorId(Integer id) {
        return Optional.empty();
    }

    @Override
    public void eliminarPorId(Integer id) {

    }
}
