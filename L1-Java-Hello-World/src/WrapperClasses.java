import java.util.Locale;

public class WrapperClasses {

    public static void main(String[] args) {
        String srt = "Salam men ProgramlAma oyrenirem!";

        System.out.println(srt.length());

        System.out.println(srt.isEmpty());

        System.out.println(srt.isBlank());

        System.out.println(srt.toLowerCase());

        System.out.println(srt.toUpperCase());

        System.out.println(srt.concat(" Menim admin Elcindir"));

        System.out.println(srt.indexOf('!'));

        System.out.println(srt.startsWith("Salams"));

        System.out.println(srt.replace('a', 'e'));

        System.out.println(srt.replace("Salam", "Salamlar"));

        System.out.println(srt.contains("men"));



        Integer i = 34;

        byte i1 = i.byteValue();





        System.out.println(i.compareTo(23));  // i == 56



    }
}
