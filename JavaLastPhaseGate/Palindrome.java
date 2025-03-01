public class Palindrome {
    public static boolean isPalindrome(int num) {
        int inverse = 0;
        int temp = num; 

        while (temp != 0) {
            inverse = (inverse * 10) + (temp % 10);
            temp = temp / 10;
        }

        return inverse == num;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(12121));
    }
}