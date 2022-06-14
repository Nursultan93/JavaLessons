package inter;

public interface ColQuslari {
   boolean etyeyendirmi = true;

   void yemekYe();


   private void name(){
       System.out.println();
   }

   default String salamla(){
       return "Salam";
   }

}
