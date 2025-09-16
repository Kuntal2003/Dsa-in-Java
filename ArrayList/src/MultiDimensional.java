import java.util.ArrayList;
import java.util.Objects;

public class MultiDimensional {
    public static void main(String[] args){
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        for(int i=0;i<3;i++){
            matrix.add(new ArrayList<>());
        }
        int number = 1;
        for(int i = 0;i<3;i++){
            for(int j=0;j<3;j++){
                matrix.get(i).add(j,number);
                number++;
            }
        }
        System.out.println(matrix);
        System.out.println(matrix.get(1).get(0));
        matrix.get(0).set(0,100);
        System.out.println(matrix);
        for(ArrayList<Integer> i : matrix){
            System.out.println(i);
        }
        int num = 10;
        for(ArrayList<Integer> i :matrix){
            for(int j : i){
                if(j==num){
                    System.out.println(num + " is present");
                    System.exit(1);
                }
            }
        }
        System.out.println(num+" is not present");
    }
}
