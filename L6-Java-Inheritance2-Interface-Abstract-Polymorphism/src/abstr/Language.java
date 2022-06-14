package abstr;

import java.time.LocalDate;

public abstract class Language {

    public LocalDate createdDate;

    public abstract String getName();

    public Language(){

    }

    public void getSpecify() {
        System.out.println("It is a programming language");
    }

}
