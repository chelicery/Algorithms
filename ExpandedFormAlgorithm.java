public class ExpandedFormAlgorithm {
    public static void main(String[] args) {


        System.out.println(ExpandForm(902011));
    }

    public static String ExpandForm(int num) {
        int division = 10;
        int mod;
        int numLength = Integer.toString(num).length();
        String expandendForm = "";
        for(int i = 0; i < numLength; i++){
            mod = num%division;
                division *= 10;
                num -= mod;
                if(mod>0) {
                    expandendForm = " + " + mod + expandendForm;
                }
        }
        return expandendForm.substring(3);
    }
}