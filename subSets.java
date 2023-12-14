import java.util.ArrayList;
import java.util.Arrays;


public class subSets {
    static void subStrings(String p,String unp){
        if(unp.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = unp.charAt(0);

        subStrings(p+ch,unp.substring(1));
        subStrings(p,unp.substring(1));

    }

    static ArrayList<String> subStringsRtrn(String p, String unp){
        if(unp.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = unp.charAt(0);

        ArrayList<String > left = subStringsRtrn(p+ch,unp.substring(1));
        ArrayList<String > right=  subStringsRtrn(p,unp.substring(1));
        left.addAll(right);
        return left;
    }
    public static void main(String[] args) {
        System.out.println(subStringsRtrn("","xyz"));

    }
}
