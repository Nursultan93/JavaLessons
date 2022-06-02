package inheritance;

public class Dog extends Animal{
    //Dog is a Animal -> It bir heyvandir

    public void eviQoru(){
        System.out.println("It evi qoruyur");
    }

    @Override
    public void run() {
        System.out.println("It ayaga qalxdi");
        System.out.println("It qacdi");
    }
}
