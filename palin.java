package palin;
import java.util.*;

public class palin {
	public static void test(String s){
        s = s.toLowerCase();
        int i = 0;
        int j = s.length() - 1; 
        while(i<j){
        if(s.charAt(i) != s.charAt(j)){
            System.out.println("Not Palin");
            return;
        }
        i++;
        j--;
        }
        System.out.println("Is Palin");
        return;
}
public static void main(String[] args) {
        String s = "aaabbbAAA";
        s = s.toLowerCase();
        System.out.println(s);
        test(s);
}
}
