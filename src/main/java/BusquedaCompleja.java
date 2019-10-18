import java.util.List;

public class BusquedaCompleja implements AlgoritmoBusqueda {

    @Override
    public void buscarPorPrecio(List<Celular> celulares, int precio) {
        System.out.println("Busqueda Compleja");

        Celular[] celus = new Celular[celulares.size()];

        for(int i = 0; i < celus.length; i++){
            celus[i] = celulares.get(i);
        }

        int index = celus.length - 1;
        while(index >= 0){
            for(int j = 0; j < index; j++){
                if(celus[j].getPrecio() > celus[j+1].getPrecio()){
                    Celular aux = celus[j];
                    celus[j] = celus[j+1];
                    celus[j+1] = aux;
                }
            }
            index--;
        }

        int n = celus.length;
        int centro;
        int inf = 0;
        int sup = n-1;
        while(inf <= sup){
            centro = (sup+inf)/2;
            if(celus[centro].getPrecio() == precio){
                Celular c = celus[centro];
                System.out.printf("Se encontro celular con PRECIO: %d , modelo: %s, gama: %s, marca: %s\n",
                        c.getPrecio(), c.getModelo(), c.getGama(), c.getMarca());
                break;
            }else if(precio <= celus[centro].getPrecio()) {
                sup = centro-1;
            }else {
                inf = centro+1;
            }
        }
    }

    @Override
    public void buscarPorModelo(List<Celular> celulares, String modelo) {
        System.out.println("Busqueda Compleja");
        for(Celular c : celulares){
            if(modelo.equals(c.getModelo())){
                System.out.printf("Se encontro celular con MODELO: %s , precio: %d, gama: %s, marca: %s\n",
                        c.getModelo(), c.getPrecio(), c.getGama(), c.getMarca());
            }
        }
    }
}
