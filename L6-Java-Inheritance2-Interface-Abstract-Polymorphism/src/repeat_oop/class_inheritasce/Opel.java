package repeat_oop.class_inheritasce;

public class Opel extends Car{

    public int kilometraj;

    @Override
    public void sur(){

        super.sur();


        this.kilometraj = 1240000;

        System.out.println("Bu masin "+kilometraj+" surulub!");
    }

    @Override
    public int getTekerSayi(){
        this.tekerSayi = 2;

        return tekerSayi;
    }
}
