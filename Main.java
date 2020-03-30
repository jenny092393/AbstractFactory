import java.util.ArrayList;
class Main {
    
    public static void main(String args[]){
        ClienteMenor juan = new ClienteMenor();
        juan.saludar();

        juan.setId(1);
        juan.setNombre("Juan");
        juan.setApellido("García");
        juan.setGenero("Masculino");
        juan.setFechaNacimiento("23/11/1999");
        juan.setEstadocivil("Soltero");

        ClienteMenor pedro = new ClienteMenor();
        pedro.setId(2);
        pedro.setNombre("pedro");
        pedro.setApellido("García");
        pedro.setGenero("Masculino");
        pedro.setFechaNacimiento("23/11/1999");
        pedro.setEstadocivil("Soltero");

        ClienteMayor ana = new ClienteMayor();
        ana.setId(3);
        ana.setNombre("ana");
        ana.setApellido("García");
        ana.setGenero("femenino");
        ana.setFechaNacimiento("23/11/1999");
        ana.setEstadocivil("Soltero");

        TipoItem type = new TipoLegal();
        type.setDescripcion("zapatos");
        type.setIdDescripcion(1);
        System.out.println(type.printInfo());
        System.out.println("------------------");


        Item item1 = new ItemLocal();
        item1.setId(1);
        item1.setDescripcion("nike 3033");
        item1.setValorUnidad(4000.0);
        item1.setTipoItem(type);
        System.out.println(item1.printInfo());

        ArrayList <Item> items = new ArrayList<>();
        items.add(item1);

        

        Factura factura1 = new FacturaPagada();
        factura1.setNroFactura(1);
        factura1.setFechaFactura("20/01/2000");
        factura1.setCliente(juan);
        factura1.setTotalFactura(3000.0);
        factura1.setEstado("pagado");
        factura1.setItems(items);
        System.out.println(factura1.printInfo());
        System.out.println("------------------");

        

        ClienteDaoImpl clienteDao = new ClienteDaoImpl();
        clienteDao.addCliente(juan);
        clienteDao.addCliente(pedro);
        clienteDao.addCliente(ana);
        clienteDao.printClientes();
        System.out.println("------------------");
        clienteDao.delCliente(2);
        clienteDao.printClientes();
        System.out.println("------------------");
        clienteDao.updateCliente(3,pedro);
        clienteDao.printClientes();

        //-------------------TipoItemDao--------------------------

        TipoItem type1 = new TipoLegal();
        type1.setDescripcion("celular");
        type1.setIdDescripcion(2);
        System.out.println(type.printInfo());
        System.out.println("------------------");

        TipoItem type2 = new TipoLegal();
        type2.setDescripcion("lavadora");
        type2.setIdDescripcion(3);
        System.out.println(type.printInfo());
        System.out.println("------------------");

        TipoItemDaoImpl tipoItemDao = new TipoItemDaoImpl();
        tipoItemDao.addTipoItem(type);
        tipoItemDao.addTipoItem(type1);
        tipoItemDao.addTipoItem(type2);
        tipoItemDao.printTipoItem();
        System.out.println("----------------");
        tipoItemDao.delTipoItem(2);
        tipoItemDao.printTipoItem();
        System.out.println("----------------");
        tipoItemDao.updateTipoItem(3,type1);
        tipoItemDao.printTipoItem();
        System.out.println("----------------");


        //-----------------Item-------------------------------
        


        //-----------------FacturasDao------------------------

        
        
        System.out.println("--------------Fabricas---------");
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

    }
}