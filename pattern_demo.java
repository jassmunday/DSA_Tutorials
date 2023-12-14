public class pattern_demo {


    public static void  main( String[] args){
//        int count =1;
//        for (int i = 1; i <=5 ; i++) {
//            //char alpha = (char) ('a'+(i-1));
//
//            for (int j = 1; j <=5 ; j++) {
//
//                System.out.print(count++ +" ");
//            }
//            System.out.println();
//        }


//        //for character in triangle
//        for (int row = 1; row <=5 ; row++) {
//            char alpha = (char) ('a'+(row-1));
//
//            for (int col = 1; col <=row ; col++) {
//
//                System.out.print(alpha +" ");
//            }
//            System.out.println();
//        }

//        //for * in decreasing triangle
//        for (int row = 5; row >=1 ; row--) {
//            char alpha = (char) ('a'+(row-1));
//
//            for (int col = 1; col <=row ; col++) {
//
//                System.out.print("*" +" ");
//            }
//            System.out.println();
//        }

//        //for  decreasing number triangle
//        // 1 2 3 4 5
//        // 1 2 3 4
//        // 1 2 3
//        // 1 2
//        // 1
//        for (int row = 5; row >=1 ; row--) {
//            char alpha = (char) ('a'+(row-1));
//
//            for (int col = 1; col <=row ; col++) {
//
//                System.out.print(col +" ");
//            }
//            System.out.println();
//        }
        //for printing col starting from 5 and decreasing
        //5
        //54
        //543 and so on
        for (int row = 5; row >=1 ; row--) {

            for (int col = 5; col >=row ; col--) {

                System.out.print(col +" ");
            }
            System.out.println();
        }



    }




}
