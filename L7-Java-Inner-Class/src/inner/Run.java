package inner;

public class Run {
    public static void main(String[] args) {

        Outer outer = new Outer();

        Outer.NonStaticInnerClass nonStaticInnerClass = outer.new NonStaticInnerClass();
        nonStaticInnerClass.print();

        Outer.NonStaticInnerClass nonStaticInnerClass1 = new Outer().new NonStaticInnerClass();


        Outer.StaticInnerClass staticInnerClass = new Outer.StaticInnerClass();

        staticInnerClass.print();


        Animal animal = new Animal();


    }
}
