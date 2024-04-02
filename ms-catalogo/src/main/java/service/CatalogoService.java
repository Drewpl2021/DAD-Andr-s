package service;

import entity.Catalogo;

import java.util.List;
import java.util.Optional;

public interface CatalogoService {
    public List<Catalogo> listar();
    public Catalogo guardar(Catalogo Catalogo);
    public Catalogo actualizar(Catalogo Catalogo);
    public Optional<Catalogo> listarPorId(Integer id);
    public void eliminarPorId(Integer id);
}
