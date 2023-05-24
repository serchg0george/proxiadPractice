package bg.proxiad.practice.spring.szavada.models;

public class Furniture {

    Long id;
    Double price;
    String type;

    public Furniture() {

    }

    public Furniture(Long id, Double price, String type) {

        super();
        this.id = id;
        this.price = price;
        this.type = type;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
