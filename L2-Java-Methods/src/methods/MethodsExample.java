package src.methods;

public class MethodsExample {



    public int getMaxElementInArray(int [] array) {

        int maxValue = array[0];

        for (int i=1; i<array.length; i++){

            if (array[i] > maxValue){
                maxValue = array[i];
            }

        }
        return maxValue;
    }


    public int getMinElementInArray(int [] array){

        int minValue = array[0];

        for (int i=1; i<array.length; i++){
            if (array[i]<minValue){
                minValue= array[i];
            }
        }

        return minValue;
    }

}
