package entitie;

public class Product {

    private String name;
    private Double price;
    private Integer quantity;

    public Product() {
    }

    public Product(String nome, Double price, Integer quantity) {
        this.name = nome;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQte() {
        return quantity;
    }

    public void setQte(Integer quantity) {
        this.quantity = quantity;
    }

    public double total() {
        return price * quantity;

    }

}
