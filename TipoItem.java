class TipoItem {
    private int idDescripcion;
    private String descripcion;

    public TipoItem(int idDescripcion, String descripcion){
        this.idDescripcion = idDescripcion;
        this.descripcion = descripcion;
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
    
}