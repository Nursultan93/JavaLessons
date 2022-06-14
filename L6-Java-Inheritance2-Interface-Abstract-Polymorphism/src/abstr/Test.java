package abstr;


import java.time.LocalDate;

public class Test {

    public static void main(String[] args) {

        Language[] languages = new Language[4];

        Java java = new Java();
        java.createdDate = LocalDate.of(1999, 01, 01);

        CSharp cSharp = new CSharp();
        cSharp.createdDate = LocalDate.of(2000, 01, 01);

        Php php = new Php();
        php.createdDate = LocalDate.of(2003, 01, 01);

        CPlusPlus cpp = new CPlusPlus();
        cpp.createdDate = LocalDate.of(1980, 01, 01);


        // Java is a Language

//        Java j = new Java();
//        j.getSpecify();

        CSharp c = new CSharp();
        c.getSpecify();

//        languages[0] = java;
//        languages[1] = php;
//        languages[2] = cSharp;
//        languages[3] = cpp;
//
//        for(Language l : languages){
//            System.out.println("Create Date: "+l.createdDate);
//            System.out.println(l.getName());
//        }


    }
}
