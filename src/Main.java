public class Main {
    public static void main(String[] args)
    {
        System.out.println(NumberPalindrome.isPalindrome(1331));
        System.out.println(NumberPalindrome.isPalindrome(-1331));
        System.out.println(NumberPalindrome.isPalindrome(13331));
        System.out.println(NumberPalindrome.isPalindrome(11331));
    }

    public static class NumberPalindrome
    {
        public static boolean isPalindrome (int number)
        {
            int remainder;
            int reverse = 0;
            int iNumber = number;

            while (iNumber != 0)
            {
                remainder = iNumber % 10;
                reverse = (reverse * 10) + remainder;
                iNumber = iNumber / 10;
            }

            System.out.println("Reversed number: " + reverse);

            if (number == reverse)
            {
                return true;
            }
            return false;
        }
    }
}