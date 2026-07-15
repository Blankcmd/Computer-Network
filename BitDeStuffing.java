import java.util.Scanner;

public class BitDeStuffing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter stuffed bits: ");
        String stuffed = sc.nextLine();

        StringBuilder result = new StringBuilder();
        int count = 0;

        for (int i = 0; i < stuffed.length(); i++) {
            char bit = stuffed.charAt(i);
            result.append(bit);

            if (bit == '1') {
                count++;
                if (count == 5) {
                    i++;        // Skip the stuffed 0
                    count = 0;
                }
            } else {
                count = 0;
            }
        }

        System.out.println("Original bits: " + result);
    }
}
