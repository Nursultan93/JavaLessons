package src.varables;

public class Car {

    private String model;
    private int qapiSayi;
    private double matorGucu;
    private int oturacaqSayi;

    public Car(String model, int qapiSayi, double motorGucu, int oturacaqSayi) {
        this.model = model;
        this.matorGucu = motorGucu;
        this.qapiSayi = qapiSayi;
        this.oturacaqSayi = oturacaqSayi;
    }

    public Car(){}


    public void setModel(String model) {
        this.model = model;
    }

    public void setQapiSayi(int qapiSayi) {
        this.qapiSayi = qapiSayi;
    }

    public void setMatorGucu(double motorGucu){
        this.matorGucu = motorGucu;
    }

    public void setOturacaqSayi(int oturacaqSayi) {
        this.oturacaqSayi = oturacaqSayi;
    }

    public String getModel() {
        return this.model;
    }

    public int getQapiSayi(){
        return this.qapiSayi;
    }

    public double getMatorGucu(){
        return this.matorGucu;
    }

    public int getOturacaqSayi(){
        return this.oturacaqSayi;
    }
}
