
public class Activity12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addable ad1 = (num1, num2) -> num1 + num2;

        // Lambda expression with a body
        Addable ad2 = (num1, num2) -> {
            return num1 + num2;
        };

        // Test the lambda expressions
        int result1 = ad1.add(10, 20);
        int result2 = ad2.add(30, 40);

        // Print the results
        System.out.println("Result from ad1: " + result1);
        System.out.println("Result from ad2: " + result2);

	}

}
