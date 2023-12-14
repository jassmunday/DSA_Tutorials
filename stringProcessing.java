public class stringProcessing {
    static void process(String prcsd ,String unprcsd){
        if(unprcsd.isEmpty()){
            System.out.println(prcsd);
            return;

        }
        char chr = unprcsd.charAt(0);

        if(chr == 'a'){
            process(prcsd,unprcsd.substring(1));
        }
        else{
            process(prcsd+chr,unprcsd.substring(1));
        }

    }
    public static void main(String[] args) {
        process("","bcdaadh");
    }
}
