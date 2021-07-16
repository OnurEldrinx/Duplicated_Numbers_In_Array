import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){

        int[] list = {3, 7, 3, 3, 2, 9, 10, 21, 1, 33, 9, 1};

        int duplicated;
        ArrayList<Integer> duplicatedNumbers = new ArrayList<>();



        for (int i = 0;i< list.length;i++){

            duplicated = list[i];

            for (int j=i+1;j<list.length;j++) {

                if (duplicated == list[j] && !(duplicatedNumbers.contains(duplicated))){

                    duplicatedNumbers.add(list[j]);


                }

            }

        }

        System.out.print("\nDuplicated Numbers : ");

        System.out.println(Arrays.toString(duplicatedNumbers.toArray()));









    }
}
