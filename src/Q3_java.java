// Question 3 - String Manipulation
// Topic: Name Formatting Utility
//
// Task 1:
// Write a method called formatName(firstName, lastName) that accepts two Strings
// and returns a formatted String in this format: "lastName, firstName"
// Example: formatName("John", "Smith") → "Smith, John"
//
// Task 2:
// Write a method called formatInitials(firstName, lastName) that returns the
// initials of the person as a String in uppercase.
// Example: formatInitials("john", "smith") → "J.S."
// Note: your method should handle inputs in any case (upper, lower, or mixed)
// and always produce properly capitalised output.

public class Q3_java {

    public static String formatName(String firstName, String lastName) {
        // Add your code here
         return lastName + ", " + firstName;
    }

    public static String formatInitials(String firstName, String lastName) {
        // Add your code here
    if (firstName == null || lastName == null || 
        firstName.isEmpty() || lastName.isEmpty()) {
        return "Either firstName or lastName is empty.";
    }

    char firstInitial = Character.toUpperCase(firstName.charAt(0));
    char lastInitial = Character.toUpperCase(lastName.charAt(0));

    return firstInitial + "." + lastInitial + ".";

    }

    public static void main(String[] args) {
         Q3_java name = new Q3_java();

        System.out.println(name.formatName("Alice", "Tan"));    //→ Expected: "Tan, Alice"
        System.out.println(name.formatName("bob", "lim"));      //→ Expected: "Lim, Bob"
        System.out.println(name.formatInitials("Alice","Tan")); //→ Expected: "A.T."
        System.out.println(name.formatInitials("bob","lim"));   //→ Expected: "B.L."
        System.out.println(name.formatInitials("","lim"));   
        System.out.println(name.formatInitials("ABC","")); 
    }
}
