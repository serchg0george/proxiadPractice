package bg.proxiad.practice.spring.szavada.models;

public class ElectricEquipment {
    Long id;
    Double price;
    String type;


    public Long getId() {
        return id;
    }

    public Double getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setType(String type) {
        this.type = type;
    }

}
