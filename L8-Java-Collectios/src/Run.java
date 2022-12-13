import sets.Sets;

public class Run{


    public static void main(String[] args) {

       Drawable d = (color) -> color;
       System.out.println(d.draw("Blue"));

       CalculateAdd c = (a, b) -> a+b;

        System.out.println(c.add(2, 5));
    }
}

@FunctionalInterface
interface Drawable {
    String draw(String color);
}

@FunctionalInterface
interface CalculateAdd{
    int add(int a, int b);
}

