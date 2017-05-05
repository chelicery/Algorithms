public class multiplicationTable {

    public static void main(String[] args) {
//        //tabliczka mnożenia
//        for(int i = 1; i <= 9; i++){
//            for(int j = 1; j <= 9; j++){
//                System.out.print(i * j + "\t");
//            }
//            System.out.println("\n");
//        }
        //tabliczka mnozenia z wykorzystaniem tablic wielowymiarowych
        int[][] multiplicationTable = new int[10][10];

        for(int column = 0; column < multiplicationTable.length; column++){
            for(int row = 0; row < multiplicationTable.length; row++) {
                multiplicationTable[column][row] = (column + 1) * (row + 1);

            }
        }

        for(int column = 0; column < multiplicationTable.length; column++){
            for(int row = 0; row < multiplicationTable.length; row++){
                System.out.print(multiplicationTable[column][row] + "\t");
            }
            System.out.println();
        }

    }
}
