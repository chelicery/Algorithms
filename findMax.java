    public class findMax.java {
        public static void main(String[] args) {

            int[] array = {1, 3, 46, 8, 4, 9, 7, 2};

            System.out.println(findMax(array));
        }

        public static int findMax(int[] array){
            int biggest = array[0];
            for(int i = 0; i < array.length; i++){
                if(biggest > array[i]){
                    System.out.println("WERI GUD");
                    continue;
                } else {
                    biggest = array[i];
                }
            }
            return biggest;
        }
    }
