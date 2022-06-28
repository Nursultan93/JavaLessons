package repeat_oop.class_inheritasce;

public class Car {
    public int tekerSayi;
    public int qapiSayi;
    public String model;

    public void sur(){
        System.out.println("Car surulur");
    }

    public int getTekerSayi(){
        this.tekerSayi = 4;

        return tekerSayi;
    }
}
