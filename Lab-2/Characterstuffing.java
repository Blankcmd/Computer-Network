import java.util.Scanner;
public class CharacterStuffing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string data: ");
        String data = sc.nextLine();
       	StringBuilder result = new StringBuilder();
        result.append("DLE STX ");
        for (int i = 0; i < data.length(); i++) {
            char ch = data.charAt(i);
            if (ch == 'D' && i + 2 < data.length() && 
                data.charAt(i + 1) == 'L' && data.charAt(i + 2) == 'E') {
                result.append("DLE "); 
            }
            result.append(ch);
        }
        result.append(" DLE ETX");

        System.out.println("Stuffed Data:" + result);
    }
}
