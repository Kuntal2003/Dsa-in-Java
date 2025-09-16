import java.util.ArrayList;
import java.util.Arrays;

public class arraylist {
    public static void main(String[] args){
        ArrayList<String> name = new ArrayList<>();
        name.add("Kunal");
        name.add("Debi");
        name.add("anna");
        name.add("Kuntal");
        name.add("Indrani");
        String name1 =  name.get(2);
        System.out.println(name);
        System.out.println(name1);
        name.set(1,"Besti");
        System.out.println(name);
        int lastIndex = name.size()-1;
        name.remove(lastIndex);
        System.out.println(name);
        System.out.println(name.size());
        for(String i : name){
            System.out.println(i);
        }
        if(name.contains("rahul")){
            System.out.println("Found");
        }else{
            System.out.println("Not Found");
        }
        System.out.println(name.indexOf("Besti"));
        System.out.println(name);
        String[] arrname = new String[name.size()];
        int i = 0;
        for(String x : name){
            arrname[i] = x;
            i++;
        }
        System.out.println(Arrays.toString(arrname));
    }
}
