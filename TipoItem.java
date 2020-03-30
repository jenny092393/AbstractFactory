public abstract class TipoItem {
    private int idDescripcion;
    private String descripcion;

    
    public TipoItem(int idDescripcion, String descripcion){
        this.idDescripcion = idDescripcion;
        this.descripcion = descripcion;
    }

    public TipoItem(){
        
    }

    public int getIdDescription(){
        return idDescripcion;
    }

    private void setIdDescripcion(int idDescripcion){
        this.idDescripcion = idDescripcion;
    }

    public String getDescripcion(){
        return descripcion;
    }

    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }

    public void validarLegaliad(){
        System.out.println("Hola soy un ubjeto de dudosa procedencia ");
    }
    
}