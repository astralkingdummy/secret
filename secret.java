import java.util.Scanner;

class MakeQuestion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String question;
        String answer;

        System.out.println("Enter a question:");
        question = scan.nextLine();

        System.out.println("Enter the answer:");
        answer = scan.nextLine();

        System.out.println("\n{\n    [\"Question\"] = \"" + question + "\",");
        System.out.println("    [\"Answer\"] = \"" + answer + "\",");
        System.out.println("},");
    }
}