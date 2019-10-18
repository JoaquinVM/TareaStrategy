public class Client {
    public static void main(String[] args){
        Context context = new Context();

        Celular cel1 = new Celular("Modelo1", "Marca1", "Gama1", 100);
        Celular cel2 = new Celular("Modelo2", "Marca2", "Gama2", 200);
        Celular cel3 = new Celular("Modelo3", "Marca3", "Gama3", 300);
        Celular cel4 = new Celular("Modelo4", "Marca4", "Gama4", 400);
        Celular cel5 = new Celular("Modelo5", "Marca5", "Gama5", 500);
        Celular cel6 = new Celular("Modelo6", "Marca6", "Gama6", 600);

        context.addCelular(cel1);
        context.addCelular(cel2);
        context.addCelular(cel3);
        context.addCelular(cel4);
        context.addCelular(cel5);

        context.buscarPorModelo("Modelo4");
        context.buscarPorPrecio(300);

        System.out.println();

        context.addCelular(cel6);
        context.buscarPorModelo("Modelo6");
        context.buscarPorPrecio(200);
    }
}
