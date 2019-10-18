import java.util.List;

public class BusquedaSimple implements AlgoritmoBusqueda {

    @Override
    public void buscarPorPrecio(List<Celular> celulares, int precio) {
        System.out.println("Busqueda Simple");
        for(Celular c : celulares){
            if(c.getPrecio() == precio){
                System.out.printf("Se encontro celular con PRECIO: %d , modelo: %s, gama: %s, marca: %s\n",
                        c.getPrecio(), c.getModelo(), c.getGama(), c.getMarca());
            }
        }
    }

    @Override
    public void buscarPorModelo(List<Celular> celulares, String modelo) {
        System.out.println("Busqueda Simple");
        for(Celular c : celulares){
            if(modelo.equals(c.getModelo())){
                System.out.printf("Se encontro celular con MODELO: %s , precio: %d, gama: %s, marca: %s\n",
                        c.getModelo(), c.getPrecio(), c.getGama(), c.getMarca());
            }
        }
    }
}
