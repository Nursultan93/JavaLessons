package inheritance;

public class Cat extends Animal{

    public void sicanYaxala(){
        System.out.println("Pisik sican yaxaladi");
    }


    @Override
    public void run(){
        System.out.println("Pisik Yataqdan durdu");
        System.out.println("Pisik sican yaxamaga qacdi");
        sicanYaxala();
    }

}
