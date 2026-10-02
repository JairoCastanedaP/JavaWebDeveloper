package co.edu.java.core.RecordClassGetterSetter;

public class AppProducto {

    public static void main(String []args){
    Product product= new Product();
    product.setCode("P009");
    System.out.println("Código producto:"+ product.getCode() );
    product.setNombre("Product1");
    System.out.println("NOmbre producto:"+ product.getNombre());


    System.out.println(product.toString());

    Product[] products;

    }

}
