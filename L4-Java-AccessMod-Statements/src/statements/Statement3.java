package statements;

public class Statement3 {
    public static void main(String[] args) {
        int[] massiv = new int[]{3,6,7,9,3,6,8,3,67,42,667,9};


        for (int reqem : massiv){
            if (reqem == 67)
                continue;
            System.out.println(reqem);
        }
    }
}
