package com.Producto.Productos.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Producto.Productos.Modelo.Producto;
import com.Producto.Productos.Repository.RepositoryProducto;

@Service
public class ServiceProducto {
    @Autowired
    private RepositoryProducto repositoryprod;
    public List<Producto> getProductos(){
        return repositoryprod.obteneProductos();
        
    }
    public Producto guardarPro(Producto producto) {
        return repositoryprod.guardar(producto);
    }

    public Producto getProductoid(int id) {
        return repositoryprod.buscarPorId(id);
    }
    public List<Producto> filtraTipo(String tipo){
        return repositoryprod.filtraTipo(tipo);
    }
    public List<Producto>filtraColor(String color ){
        return repositoryprod.filtraColor(color);
    }
    public String eliminarProducto(int id) {
        repositoryprod.eliminar(id);
        return "producto eliminado correctamente";
    }
    public Producto ActualizarPro(Producto pro) {
        return repositoryprod.actualizar(pro);
    }
}
