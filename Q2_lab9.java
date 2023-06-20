import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str1 = scanner.nextLine();

        System.out.println("Enter another string:");
        String str2 = scanner.nextLine();

        // Change case of the string
        System.out.println("Original string: " + str1);
        String str1Lower = str1.toLowerCase();
        String str1Upper = str1.toUpperCase();
        System.out.println("Lowercase string: " + str1Lower);
        System.out.println("Uppercase string: " + str1Upper);

        // Reverse the string
        System.out.println("Original string: " + str1);
        StringBuilder strrev = new StringBuilder(str1).reverse();
        System.out.println("Reversed string: " + strrev);

        // Compare two strings
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);
        if (str1.equals(str2)) {
            System.out.println("The strings are equal.");
        } else {
            System.out.println("The strings are not equal.");
        }

        // Insert one string into another string
        System.out.println("Original string: " + str1);
        System.out.println("Insertion string: " + str2);
        StringBuilder str1Insert = new StringBuilder(str1);
        str1Insert.insert(str1.length() / 2, str2);
        System.out.println("String after insertion: " + str1Insert);
    }
}
