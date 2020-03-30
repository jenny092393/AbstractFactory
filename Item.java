public abstract class Item {
    private TipoItem tipoItem;
    private int id;
    private String Descripcion;
    private double valorUnidad;

    
    public Item(TipoItem tipoItem, int id,
         double valorUnidad){

        this.tipoItem = tipoItem;
        this.id = id;
        this.valorUnidad = valorUnidad;

    }

    public Item(){
        
    }

    public TipoItem getTipoItem(){
        return tipoItem;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public double getValorUnidad(){
        return valorUnidad;
    }

    public void setValorUnidad(double valorUnidad){
        this.valorUnidad = valorUnidad;
    }

    public void consultarEstado(){
        System.out.println("revisar disponibilidad");
    }
}