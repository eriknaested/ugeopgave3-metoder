import java.util.Scanner;

public class Opgave1 {

    double balance = 0;
    String accountName;

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        balance -= amount;
    }

    void printBalance() {
        System.out.print(accountName + " ");
        System.out.println(balance);
    }

    void main() {
        accountName = "Erik";
        printBalance();
        runDialog();
    }

    void runDialog(){
        Scanner scan = new Scanner(System.in);
        String input = "";

        while (!input.equalsIgnoreCase("q")) {
            //int amount = Integer.parseInt(scan.nextLine());
            try {
                System.out.println("Tast et beløb du vil sætte ind");
                input = scan.nextLine();
                int amount = Integer.parseInt(input);
                deposit(amount);
                printBalance();
            } catch (NumberFormatException e) {
                System.out.println(e);
                System.out.println("kan ikke konvertere til tal");
                printBalance();
            }
        }
    }
}
