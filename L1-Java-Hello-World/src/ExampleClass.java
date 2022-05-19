public class ExampleClass {

    String name;
    Integer yasi;

    public ExampleClass(String ad) {
        name = ad;

        System.out.println(name);
    }

    public ExampleClass(Integer yas) {
        yasi = yas;

        System.out.println(yasi);
    }


    public ExampleClass(String ad, Integer yas) {
        name = ad;
        yasi = yas;

        System.out.println(name + yasi);
    }

    public ExampleClass() {
        System.out.println("default contr");
    }

    //overload constructor

    public static void main(String[] args) {

        ExampleClass ec = new ExampleClass("Famil");
    }
}
