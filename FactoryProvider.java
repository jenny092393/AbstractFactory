class FactoryProvider {
    public  AbstractFactory getFactory(String factoryType){


        if(factoryType.equalsIgnoreCase("clienteFactory")){
            return new ClienteFactory();

        }else if (factoryType.equalsIgnoreCase("facturaFactory")){
            return new FacturaFactory();

        }
        

        System.out.println("No se encuentra el objeto a fabricar");
        return null;


    }
}