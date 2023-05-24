package bg.proxiad.practice.spring.szavada.models;

import java.util.List;

public class Room {

    private Long id;
    List<Furniture> furniture;
    List<ElectricEquipment> electricEquipment;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Furniture> getFurniture() {
        return furniture;
    }

    public void setFurniture(List<Furniture> furniture) {
        this.furniture = furniture;
    }

    public List<ElectricEquipment> getElectricEquipment() {
        return electricEquipment;
    }

    public void setElectricEquipment(List<ElectricEquipment> electricEquipment) {
        this.electricEquipment = electricEquipment;
    }

}
