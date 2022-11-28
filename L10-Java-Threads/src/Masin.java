public class Masin {

    //1. fieldler
    String model;
    String reng;
    int il;



    //2. Constructor
    public Masin(){}

    public Masin(String model, String reng, int il){
        this.model = model;
        this.reng = reng;
        this.il = il;
    }

    //3. metodlar
    public void sur(){
        System.out.println("Masin hereket edir " +model);
    }


    public static void main(String[] args) {
        
    }


}
