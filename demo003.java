public class demo003 {

    public static void main(String[] args) {
        // Declare and initialize three numbers
        int num1 = 10;
        int num2 = 25;
        int num3 = 15;

        // Compare the three numbers and find the greatest
        if (num1 >= num2 && num1 >= num3) {
            System.out.println(num1 + " is the greatest.");
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println(num2 + " is the greatest.");
        } else {
            System.out.println(num3 + " is the greatest.");
        }
    }
}