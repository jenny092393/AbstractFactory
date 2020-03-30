import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

class Main2 {
    
    public static void main2(String args[]) throws IOException{
        FactoryProvider provider = new FactoryProvider();
        AbstractFactory factoryFacturas = provider.getFactory("facturaFactory");
        AbstractFactory factoryClientes = provider.getFactory("clienteFactory");
        AbstractFactory factoryItems = provider.getFactory("itemFactory");

        FacturaDaoImpl facturaDao = new FacturaDaoImpl();
        ClienteDaoImpl clienteDao = new ClienteDaoImpl();
        ItemDaoImpl itemDao = new ItemDaoImpl();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Bienvenido a la tienda, eres usuario (u) o administrador (a)? u/a");
        String res = br.readLine();
        while(true){
            if(res.equals("u") || res.equals("a")){
                break;
            }
            System.out.println("Entrada incorrecta, ingrese u/a");
            res = br.readLine();
        }

        if(res.equals("u")){

            System.out.println("Hola Usuario, a continuación te mostraré los items que tenemos en venta: \n");
            
            //imprimir todos los items del daoItem (debe mostrarse el idItem)
            //daoItem.printItems();

            System.out.println("\n Por favor, digita el id del item que deseas comprar");
            int resU = Integer.parseInt( br.readLine() );

            while(true){

                /*Item items = daoItem.items;
                for(Item item: items){
                    if( resU == item.getId() ){

                    }
                }*/
            }

        }else{
            System.out.println("Hola Administrador, qué deseas hacer?");
            System.out.println("Crear una factura nueva. (c)");
            System.out.println("Ver historial de facturas. (r)");
            System.out.println("Actualizar una factura. (u)");
            System.out.println("Borrar una factura. (d)");

            String resA = br.readLine();

            if(resA.equals("c")){

                System.out.println("Ha seleccionado crear factura nueva");
                System.out.println("Qué tipo de factura desea crear, factura Vencida o Pagada? (v/p)");

                String tipoFactura = br.readLine();

                if(tipoFactura.equals("v")){

                    Factura newFactura = factoryFacturas.getFactura("facturaVencida")

                }else{

                    System.out.println("Por defecto, factura Pagada.");
                    Factura newFactura = factoryFacturas.getFactura("facturaPagada");

                }

                /*
                private int nroFactura;

                private String fechaFactura;
                            private Cliente cliente;
                private double totalFactura;
                private String estado;
                    private ArrayList <Item> items;
                */

                Random  rnd = new Random();
                int nroFactura = (int) (rnd.nextDouble() * 100 + 20);

                System.out.println("ingrese la fecha de la factura:");
                String fecha = br.readLine();

                System.out.println("ingrese el total:");
                Double total = Double.parseDouble( br.readLine() );

                System.out.println("ingrese el estado:");
                String estado = br.readLine();
                
                System.out.println("Ahora, su cliente. El es de tipo Mayor o Menor? (m/n)");
                String tipoCliente = br.readLine();
                if(tipoCliente.equals("m") ){
                    Cliente cliente = factoryClientes.getCliente("clienteMayor");
                }else{
                    Cliente cliente = factoryClientes.getCliente("clienteMenor");
                }

                System.out.println("Ahora, empecemos a agregar los items que su cliente ha comprado:");

                while(true){
                    System.out.println("A continuación, se mostrarán los items en venta:");
                    itemDao.printItem();

                    System.out.println("\n Escriba el id del item que desea incluir en la factura");
                    
                }

            }else if(resA.equals("r")){

                System.out.println("Imprimiendo facturas...");
                System.out.println();

                //imprimir todas las facturas del daoFacturas
                facturaDao.printFacturas();
                System.out.println();

            }else if(resA.equals("u")){
                facturaDao.printFacturas();
                System.out.println();
                System.out.println("Perfecto empecemos, ingresa el Nro de la factura a editar:");

                int nroFactura = Integer.parseInt( br.readLine() );

                Factura newFactura = factoryFacturas.getFactura("facturaVencida");
                
                for(Factura factura: facturaDao.facturas){
                    if( factura.getNroFactura() == nroFactura ){
                        newFactura = factura; 
                    }
                }

                System.out.println("Qué aspecto de la factura deseas cambiar?");
                System.out.println("fecha de la factura? (f)");
                System.out.println("total factura? (t)");
                System.out.println("estado de la factura? (e)");

                String aspecto = br.readLine();

                if( aspecto.equals("f") ){
                    
                    System.out.println("ingrese la nueva fecha:");
                    
                    String newFecha = br.readLine();
                    newFactura.setFechaFactura(newFecha);

                    System.out.println("Fecha modificada exitosamente.\n");

                }else if( aspecto.equals("t") ){

                    System.out.println("ingrese el nuevo total:");
                    
                    Double newTotal = Double.parseDouble( br.readLine() );
                    newFactura.setTotalFactura(newTotal);

                    System.out.println("Total modificado exitosamente.\n");

                }else if( aspecto.equals("e") ){
                    System.out.println("ingrese el nuevo estado:");
                    
                    String newEstado = br.readLine();
                    newFactura.setEstado(newEstado);

                    System.out.println("Estado modificado exitosamente.\n");
                }else{
                    System.out.println("No se realizará ningún cambio.");
                }

                facturaDao.updateFactura(nroFactura, newFactura);

            }else if(resA.equals("d")){

                facturaDao.printFacturas();
                System.out.println();

                System.out.println("Por favor ingresa el nro de factura que deseas eliminar.");

                int nroFactura = Integer.parseInt( br.readLine() );
                facturaDao.delFactura(nroFactura);

                System.out.println("Factura eliminada exitosamente.\n");

            }else{
                System.out.println("Has sido detectado como Hacker, el sistema se apagará enseguida.");
            }
        }

        

    }
}
