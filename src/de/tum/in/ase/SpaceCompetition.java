package de.tum.in.ase;


public class SpaceCompetition {
    public static void main(String[] args) {
        //TODO: 1. Print the welcome message
        System.out.println("Welcome Martians, We are Eran and Jasper from Earth!\n");
        //TODO: 2. Ask the name of the first choice and print it on the console
        //You can uncomment the following line and store each user input into a variable
        //Scanner in = new Scanner(System.in);
        System.out.print("What is your first choice?");
        String input1 = "parkrun";
        System.out.println("First choice: " + input1);
        //TODO: 3. Ask the name of the second choice and print it on the console
        System.out.print("What is your second choice?");
        String input2 = "swimming";
        System.out.println("Second choice: " + input2);
        //TODO: 4. Ask the name of the third choice and print it on the console
        System.out.print("What is your third choice?");
        String input3 = "pole vault";
        System.out.println("Third choice: " + input3);
        //TODO: 5. Print out the order in which Eran and Jasper will compete for the competition
        System.out.println("Jasper and Eran will start with " + input1 + ", continue with " + input2 + ", and end with " + input3 + ".");
        //Jasper and Eran will start with parkrun, continue with swimming, and end with pole vault.
        //TODO: 6. Print the goodbye message
        System.out.println("We were pleased to be part of your Martian competition.\nWe will come again next year!");
    }
}
