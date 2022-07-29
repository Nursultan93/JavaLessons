package inner;

public class Xarici {


    static class InnerClass{

        public void print(){
            System.out.println("Men daxili InnerClassindan gelirem");
        }
    }

    public static void main(String[] args) {
        Novbeti n = new Novbeti();
        //n.salam();

        Xarici.InnerClass xi = new Xarici.InnerClass();
        xi.print();
    }

}

class Novbeti{

    public void salam(){
        System.out.println("Men Novbeti classindan gelirem");
    }
}
