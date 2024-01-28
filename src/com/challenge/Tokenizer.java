import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Solution {





    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        List<String> l = new ArrayList<String>();
        
        Pattern r = Pattern.compile("[A-Za-z]+", Pattern.CASE_INSENSITIVE);

    // Now create matcher object.
        Matcher m = r.matcher(s);
        int i = 0;
        while(m.find()){
            l.add(m.group());
            i++;
        }
        System.out.println(i);
        for(String t : l){
            System.out.println(t);
        }
        scan.close();
    }
    
    
}

