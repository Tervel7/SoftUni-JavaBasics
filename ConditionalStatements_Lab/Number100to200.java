package ConditionalStatements_Lab;

import java.util.Scanner;

public class Number100to200 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if(num<100)
            System.out.println("Less than 100");
        else if (num>=100 && num<=200)
            System.out.println("Between 100 and 200");
        else
            System.out.println("Greater than 200");
    }
}
