package polimorfizim;

public class Car {
    private String model;
    private String color;
    private boolean isKupe;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isKupe() {
        return isKupe;
    }

    public void setKupe(boolean kupe) {
        isKupe = kupe;
    }

    public void hereketEt(){
        System.out.println(model + " hereket edir...");
    }
}
