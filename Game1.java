import java.util.Scanner;

class Game1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (;;) { // infinite loop
            System.out.println("\n      WELCOME     \n");
            System.out.println("1. STONE  \n2. PAPER  \n3. SCISSOR");
            System.out.print("Enter your option: ");
            int userOption = sc.nextInt();

            if (userOption < 1 || userOption > 3) {
                System.out.println("\nINVALID OPTION\n");
                continue;
            }

            // User choice
            String userResp = "";
            if (userOption == 1) userResp = "STONE";
            else if (userOption == 2) userResp = "PAPER";
            else userResp = "SCISSOR";

            // Bot choice
            int botOption = (int)(Math.random() * 3) + 1;
            String botResp = "";
            if (botOption == 1) botResp = "STONE";
            else if (botOption == 2) botResp = "PAPER";
            else botResp = "SCISSOR";

            System.out.printf("%n%10s %-10s%n", "USER", "BOT");
            System.out.printf("%10s %-10s%n%n", userResp, botResp);

            // Winner logic
            if ((userResp.equals("STONE") && botResp.equals("SCISSOR")) ||
                (userResp.equals("PAPER") && botResp.equals("STONE")) ||
                (userResp.equals("SCISSOR") && botResp.equals("PAPER"))) {
                System.out.println("\n       USER WINS!        ");
            } else if ((userResp.equals("STONE") && botResp.equals("PAPER")) ||
                       (userResp.equals("PAPER") && botResp.equals("SCISSOR")) ||
                       (userResp.equals("SCISSOR") && botResp.equals("STONE"))) {
                System.out.println("\n       BOT WINS!         \n");
            } else {
                System.out.println("*********  DRAW  *********");
            }
        }
    }
}

