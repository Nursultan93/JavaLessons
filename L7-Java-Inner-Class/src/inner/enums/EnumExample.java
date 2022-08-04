package inner.enums;

public class EnumExample {
    enum Season{
        WINTER("Qisda hava soyuq olur"),
        SPRING("Yazda hava isti bezende yagisli olur"),
        SUMMER("Yayda hava isti olur"),
        FALL("Payizda yagisli olur");

        String text;

        Season(String text){
            this.text = text;
        }

    }


    public static void main(String[] args) {

        Season [] seasons = Season.values();

        for (Season s : seasons){
            System.out.println(s.text);
        }
    }
}
