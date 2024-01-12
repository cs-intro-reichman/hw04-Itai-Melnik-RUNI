public class StringOps {
    ////////////////////////////////////////////////////////////
    ////// ///////
    ////// Reminder: ///////
    ////// allowed methods ///////
    ////// ///////
    ////// 1.charAt(int index) ///////
    ////// 2.length() ///////
    ////// 3.substring(int start) ///////
    ////// 4.substring(int start,int ends) ///////
    ////// 5.indexOf(String str) ///////
    ////// ///////
    ////// The rest are not allowed ! ///////
    ////// if you want to use a different ///////
    ////// method, and you can implement ///////
    ////// it using material from the course ///////
    ////// you need to implement a version of ///////
    ////// the function by yourself. ///////
    ////// ///////
    ////// see example for substring ///////
    ////// in Recitation 3 question 5 ///////
    ////// ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        System.out.println(camelCase("hello World"));
        allIndexOf("MMMM", 'M');
    }

    public static String capVowelsLowRest(String string) {
        // Write your code here:
        String newString = "";

        for (int i = 0; i < string.length(); i++) {

            if ((string.charAt(i) == 'A' || string.charAt(i) == 'E' || string.charAt(i) == 'I'
                    || string.charAt(i) == 'O' || string.charAt(i) == 'U')) {
                newString = newString + string.charAt(i);
            } else if (string.charAt(i) == 'a' || string.charAt(i) == 'e' || string.charAt(i) == 'i'
                    || string.charAt(i) == 'o' || string.charAt(i) == 'u') {
                newString = newString + (char) (string.charAt(i) - 32);
            } else if (string.charAt(i) >= 65 && string.charAt(i) <= 90) {
                newString = newString + (char) (string.charAt(i) + 32);

            } else {
                newString = newString + string.charAt(i);
            }

        }
        return newString;
    }

    public static String camelCase(String string) {
        // Write your code here:
        String newString = "";
        String outpuString;
        boolean spaceBefore = false;

        for (int i = 0; i < string.length(); i++) {

            if (spaceBefore) {
                if ((string.charAt(i) >= 97 &&
                        string.charAt(i) <= 122)) {
                    newString = newString + (char) (string.charAt(i) - 32);
                    spaceBefore = false;
                } else if (string.charAt(i) >= 65 &&
                        string.charAt(i) <= 90) {
                    newString = newString + string.charAt(i);
                    spaceBefore = false;
                } else if (string.charAt(i) == 32) {
                    spaceBefore = true;
                }

            } else if (string.charAt(i) != 32 && (string.charAt(i) >= 65 && string.charAt(i) <= 90)) {

                newString = newString + (char) (string.charAt(i) + 32);
                spaceBefore = false;

            } else if (string.charAt(i) == 32) {
                spaceBefore = true;

            } else {
                newString = newString + string.charAt(i);
                spaceBefore = false;
            }
        }

        /*
         * copyString = newString;
         * 
         * for (int i = 0; i < copyString.length(); i++) {
         * if (copyString.charAt(i) == 32) {
         * copyString = copyString.substring(copyString.indexOf(' ') + 1);
         * spaceBefore = true;
         * } else if (spaceBefore) {
         * newString = newString + (char) (newString.charAt(i) - 32);
         * 
         * spaceBefore = false;
         * } else {
         * newString = newString + newString.charAt(i);
         * spaceBefore = false;
         * }
         * 
         * }
         */

        return newString;
    }

    public static int[] allIndexOf(String string, char chr) {
        // Write your code here:
        int size = 0;
        String copyString = string;

        for (int i = 0; i < string.length(); i++) {

            if (copyString.indexOf(chr) != -1) {
                size++;

                copyString = copyString.substring(copyString.indexOf(chr) + 1);
            }

        }

        int[] arrIndex = new int[size];
        int index = 0;

        for (int i = 0; i < string.length(); i++) {

            if (chr == string.charAt(i)) {

                arrIndex[index++] = i;

            }

        }

        return arrIndex;
    }
}
