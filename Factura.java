public abstract class Factura {

    private int nroFactura;
    private String fechaFactura;
    private Cliente cliente;
    private double totalFactura;
    private String estado;
    private Item item;


    
    public Factura( int nroFactura, String fechaFactura,
        Cliente cliente, double totalFactura,
        String estado, Item item){

            this.nroFactura = nroFactura;
            this.fechaFactura = fechaFactura;
            this.cliente = cliente;
            this.totalFactura = totalFactura;
            this.estado = estado;
            this.item = item;

    }

    public Factura(){
        
    }

    public int getNroFactura(){
        return nroFactura;
    }

    public void setNroFactura(int nroFactura){
        this.nroFactura = nroFactura;
    }

    public String getFechaFactura(){
        return fechaFactura;
    }

    public void setFechaFactura(String fechaFactura){
        this.fechaFactura = fechaFactura;
    }

    public Cliente getCliente(){
        return cliente;
    }

    public double getTotalFactura(){
        return totalFactura;
    }

    public String getEstado(){
        return estado;
    }

    public void setEstado(String estado){
        this.estado = estado;
    }

    public Item getItem(){
        return item;
    }

    public void validarEstado(){
        System.out.println("revise el estado de su factura");
    }

}