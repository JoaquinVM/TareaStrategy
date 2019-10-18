import java.util.ArrayList;
import java.util.List;

public class Context {

    private AlgoritmoBusqueda strategy;
    private List<Celular> celulares;

    public Context(){
        celulares = new ArrayList<>();
        defineBusquedaSimple();
    }

    public AlgoritmoBusqueda getStrategy(){
        return strategy;
    }

    public void setStrategy(AlgoritmoBusqueda strategy){
        this.strategy = strategy;
    }

    public void addCelular(Celular celular){
        celulares.add(celular);
        if(celulares.size() <= 5){
            defineBusquedaSimple();
        }else{
            defineBusquedaCompleja();
        }
    }


    public void defineBusquedaSimple(){
        this.strategy = new BusquedaSimple();
    }

    public void defineBusquedaCompleja(){
        this.strategy = new BusquedaCompleja();
    }

    public void buscarPorModelo(String modelo){
        strategy.buscarPorModelo(celulares, modelo);
    }

    public void buscarPorPrecio(int precio){
        strategy.buscarPorPrecio(celulares, precio);
    }

}
