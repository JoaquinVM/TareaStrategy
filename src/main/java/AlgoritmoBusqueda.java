import java.util.List;

public interface AlgoritmoBusqueda {
    void buscarPorPrecio(List<Celular> celulares, int precio);
    void buscarPorModelo(List<Celular> celulares, String modelo);
}
