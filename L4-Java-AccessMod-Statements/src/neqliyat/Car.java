package neqliyat;

public class Car {
    private String model;
    private Integer year;
    private String color;
    private boolean isSedan;

    public Car(String model, Integer year, String color, boolean isSedan){
        this.model = model;
        this.year = year;
        this.color = color;
        this.isSedan = isSedan;
    }


    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return this.model;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getYear() {
        return this.year;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public void setSedan(boolean isSedan) {
        this.isSedan = isSedan;
    }

    public boolean isSedan(){
        return this.isSedan;
    }
}
