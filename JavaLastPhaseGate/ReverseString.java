public class ReverseString {

    public static String checkForReverse(String str) {

        String[] words = str.split(" ");

         System.out.println(words);

        String storeRverseWords = "";

        for (String j : words) {

            String reversal = "";

            for (int i = j.length() - 1; i >= 0; i--) {

                reversal += j.charAt(i);
            }
            storeRverseWords += reversal + " ";
        }

        return storeRverseWords;
    }


    public static void main(String[] args) {

        String str = "how are you";

        System.out.println(checkForReverse(str));
    }
}

