package srcNumbers;


public class AddWithoutArithmeticOperators {
    public static int add(int a, int b) {
        while (b != 0) {
            int carry = (a & b) << 1;  // Calculate the carry by ANDing a and b, then left-shifting
            a = a ^ b;  // Calculate the sum of a and b without considering the carry
            b = carry;  // Assign the carry to b to repeat the process until there is no carry left
        }
        return a;
    }

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 7;
        
        System.out.println(num1^num2);
        int sum = add(num1, num2);
        
        System.out.println("Sum: " + sum);
    }
}

