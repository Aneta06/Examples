public class FceForReturn {

    public static void main(String[] args) {

        int result2 = addThese(3, 5);               //4. fce, slovo result2 si vymyslim,  vytiskne 8

        System.out.println(result2);

        System.out.println(addThese(3, 5));        // 4 .fce muzu vytisknout rovnou takhle a nemusim davat promennou

        //!!!!!!! ALE POZOR KDYZ ROVNOU TISKNU TAK SE MI HODNOTA NIKAM NEULOZI!!!!!!
    }

    // value-returning, parameterized

    public static int addThese(int num1, int num2) {       // 4. fce addThese je nazev fce co si vymyslim
                                                          // ( num1 a num2 jsou od int nazvy promenny ktery si vymyslim)

        return num1 + num2; // vrat

    }
}
