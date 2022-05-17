public class Hesablayici {

    int a = 5;
    int b = 3;
    int netice = 0;

    public static void main(String[] args) {
        Hesablayici hesablayici = new Hesablayici();

        hesablayici.netice = hesablayici.a + hesablayici.b; // 8

        System.out.println("toplama: "+hesablayici.netice);


        hesablayici.netice = hesablayici.a - hesablayici.b;

        System.out.println("cixma: "+hesablayici.netice);

        hesablayici.netice = hesablayici.a * hesablayici.b;

        System.out.println("vurma: "+hesablayici.netice);

        hesablayici.netice = hesablayici.a / hesablayici.b;

        System.out.println("bolme: "+hesablayici.netice);


        int d = 1;

        System.out.println(d);

    }
}
