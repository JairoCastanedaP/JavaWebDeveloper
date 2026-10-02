package co.edu.java.core.RecordClassGetterSetter;

public class Product {

    private final Double PRECIO_COMPRA_MINIMO=0.00;
    private final Double PRECIO_COMPRA_MAXIMO=1000000.00;
    private String code;
    private String nombre;
    private String description;
    private Double SellingPrice;
    private Double BuyingPrice;

    public Product(){
    }
    public void setCode(String code){
        this.code=code;
    }
    public String getCode(){
        return code;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public Double getSellingPrice() {
        return SellingPrice;
    }

    public void setSellingPrice(Double sellingPrice) {
        SellingPrice = sellingPrice;
        if(sellingPrice < PRECIO_COMPRA_MINIMO){
            throw new IllegalArgumentException("El precio de compra no puede ser negativo");
        }
        if(sellingPrice > PRECIO_COMPRA_MAXIMO){
            throw new IllegalArgumentException("El precio de compra no puede ser mayor a 1.000.000");
        }
    }

    public Double getBuyingPrice() {
        return BuyingPrice;
    }

    public void setBuyingPrice(Double buyingPrice) {
        BuyingPrice = buyingPrice;
    }

    @Override
    public String toString() {
        return "Product{" +
                "code='" + code + '\'' +
                ", nombre='" + nombre + '\'' +
                ", description='" + description + '\'' +
                ", SellingPrice=" + SellingPrice +
                ", BuyingPrice=" + BuyingPrice +
                '}';
    }
}
