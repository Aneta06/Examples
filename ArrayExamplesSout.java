import java.util.Arrays;

public class ArrayExamplesSout {

    public static void main(String[] args) {


     //   int[] mujArray = new int[4];                        // Prazdný array o velikosti 4
      //  int[] mujArray2 = new int[]{1, 2, 5, 6};

        //zapisu i takhle

        int [] mujArray = {1, 2, 5, 6};



        // tohle mi udava adresu kde array je, nekde v pocitaci
        //System.out.println(mujArray);

        // tohle mi udava velikost Array, ze tam jsou dve hodnoty
        // System.out.println(mujArray.length);


        //  tohle mi to vytiskne vedle sebe a za poslední mi to nedá čárku
//        for (int i = 0; i < mujArray.length; i++){
//            if (mujArray.length - 1 > i) {
//                System.out.print(mujArray[i] + ", ");
//            } else {
//                System.out.println(mujArray[i]);
//            }
//    }

                //tohle mi prevede array aby mi to vytisklo seznam hranatych zavorkach
                 System.out.println(Arrays.toString(mujArray));
           //

       // }


    }


}
