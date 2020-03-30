class Main {
    
    public static void main(String args[]){
        ClienteMenor juan = new ClienteMenor();
        juan.saludar();

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

    }
}