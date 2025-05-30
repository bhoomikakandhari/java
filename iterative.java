
import java.util.ArrayList;
import java.util.ListIterator;
public class iterative {
    public static void main(String[]args){
        ArrayList<String> str= new ArrayList<>();
         str.add("om");
         str.add("satyam");
         str.add("shivam");
         str.add("sundaram");
        ListIterator<String> it = str.listIterator();
       
        while(it.hasNext()){
            String data = it.next();
            if(data.length()<3){
                it.set("byeee");
            }
            System.out.println(str);
        }
        int count =0;
        while(it.hasPrevious()){
            String prevdata = it.previous();
            count++;
            if(count != str.size()){
                it.set("hello");
            }
            System.out.println(str);

        }


    }
    
}
