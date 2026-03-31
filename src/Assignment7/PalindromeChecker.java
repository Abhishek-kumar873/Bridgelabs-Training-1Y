package Assignment7;
class PalindromeChecker {
    String text;
    PalindromeChecker(String text) {
        this.text = text;
    }
    boolean isPalindrome() {
        String reversed = new StringBuilder(text).reverse().toString();
        return text.equalsIgnoreCase(reversed);
    }
    void display() {
        if (isPalindrome())
            System.out.println(text + " is a Palindrome");
        else
            System.out.println(text + " is NOT a Palindrome");
    }

    public static void main(String[] args) {
        PalindromeChecker obj = new PalindromeChecker("madam");
        obj.display();
    }
}