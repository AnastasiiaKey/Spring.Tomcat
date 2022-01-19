package web.model;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private String model;
    private String owner;
    private int number;

    public Car(String model, String owner, int number) {
        this.model = model;
        this.owner = owner;
        this.number = number;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
