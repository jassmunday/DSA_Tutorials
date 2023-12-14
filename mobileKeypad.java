public class mobileKeypad {
    static void keypad(String p ,String unp){
        if(unp.isEmpty()){
            System.out.println(p);
            return;
        }
        int  digit = unp.charAt(0)-'0';// it will convert string number into integer value
        for (int i = (digit-1)*3; i <digit*3 ; i++) {
            char ch = (char)('a'+i);
            keypad(p+ch,unp.substring(1));

        }
    }

}
