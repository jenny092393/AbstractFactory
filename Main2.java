import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

class Main2 {
    
    public static void main2(String args[]) throws IOException{
        FactoryProvider provider = new FactoryProvider();
        AbstractFactory factoryFacturas = provider.getFactory("facturaFactory");

        FacturaDaoImpl facturaDao = new FacturaDaoImpl();

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
            System.out.println("Ver historial de facturas. (r)");
            System.out.println("Actualizar una factura. (u)");
            System.out.println("Borrar una factura. (d)");

            String resA = br.readLine();

            if(resA.equals("r")){

                System.out.println("Imprimiendo facturas...");
                System.out.println();

                //imprimir todas las facturas del daoFacturas
                facturaDao.printFacturas();
                System.out.println();

            }else if(resA.equals("u")){
                /*
                private int nroFactura;

                private String fechaFactura;
                private Cliente cliente;
                private double totalFactura;
                private String estado;
                private ArrayList <Item> items;
                */

                /*
                Random  rnd = new Random();
                int nroFactura = (int) (rnd.nextDouble() * 100 + 20);
                */
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
                    
                    String newFecha = br.readLine();
                    newFactura.setFechaFactura(newFecha);

                    System.out.println("Fecha modificada exitosamente.\n");

                }else if( aspecto.equals("e") ){

                }else{
                    System.out.println("No se realizará ningún cambio.");
                }

                facturaDao.updateFactura(nroFactura, newFactura);

            }else{
                System.out.println("Has sido detectado como Hacker, el sistema se apagará enseguida.");
            }
        }

        /*
        ClienteMenor juan = new ClienteMenor();
        juan.saludar();

        juan.setId(1);
        juan.setNombre("Juan");
        juan.setApellido("García");
        juan.setGenero("Masculino");
        juan.setFechaNacimiento("23/11/1999");
        juan.setEstadocivil("Soltero");

        ClienteDaoImpl clienteDao = new ClienteDaoImpl();
        clienteDao.addCliente(juan);
        clienteDao.printClientes();

        ClienteMayor pedro = new ClienteMayor();
        pedro.saludar();
        
        
        
        FactoryProvider provider = new FactoryProvider();

        AbstractFactory factory = provider.getFactory("clienteFactory");
        Cliente cliente = factory.getCliente("clienteMenor");
        
        
        cliente.saludar();


        factory = provider.getFactory("facturaFactory");
        Factura factura =factory.getFactura("facturaVencida");
        factura.validarEstado();

        factory = provider.getFactory("itemFactory");
        Item item = factory.getItem("itemLocal");
        item.consultarEstado();

        factory = provider.getFactory("tipoFactory");
        TipoItem tipoItem = factory.getTypeItem("tipoIlegal");
        tipoItem.validarLegaliad();
        */

    }
}
