import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    //ins
    private Scanner myScan = new Scanner(System.in);
    private Roster roster = new Roster();

    //methods
    public void displayMenu(){
        while(true){
            String selection;
            System.out.printf("\n%s MENU %s\n","*".repeat(10),"x".repeat(10));
            System.out.print("PLEASE MAKE A SELECTION: \n"+
                    "1) Add a Samurai Fighter\n"+
                    "2) Remove a Samurai Fighter\n"+
                    "3) Display Samurai Fighter Info\n"+
                    "4) Display all Samurai Fighter Info\n"+
                    "5) Exit from Samurai Fighters\n"+
                    ">> "
                    );
            selection = myScan.nextLine();
            if(selection.equals("1")){
                //create samurai
                createSamurai();
            }else if (selection.equals("2")){
                //remove samurai
                deleteSamurai();
            }else if (selection.equals("3")){
                //display samurai
                displaySamurai();
            }else if (selection.equals("4")){
                //display all
                displayAllSamurai();
            }else if (selection.equals("5")){
                //exit
                System.out.println(" You Have committed Seppuku..... ");
                break;
            }else {
                System.out.println("invalid Entry Try Again");
            }
        }

    }private void displayAllSamurai(){
        ArrayList<Samurai> samuraiArrayList= roster.getSamuraiArrayList();
        for (int i = 0; i < samuraiArrayList.size(); i++){
            System.out.printf("%d. %s\n\n",i + 1,samuraiArrayList.get(i));
        }
    }
    private void displaySamurai(){
        //variable
        String name;
        Samurai samurai;
        System.out.println("Enter the Samurai name to find in the Roster!");
        name = myScan.nextLine();
        //instance
        samurai=roster.getSamurai(name);
        if (samurai == null){
            System.out.println("The Fighter can not be found!!!");
        }else{
            System.out.println(samurai.toString());
        }
    }
    //deletion
    private void deleteSamurai() {
        Samurai samurai;
        String name;
        System.out.print("Enter the name of the Fighter you want to commit Seppuku:  ");
        name = myScan.nextLine();
        //
        samurai = roster.getSamurai(name);
        if (samurai == null) {
            System.out.println("The Samurai can not be found!!!");
        } else {
            roster.removeSamurai(samurai);
            //removes
            System.out.printf("%s Removed from the Roster\n", name);

        }
    }
    private void createSamurai(){
        String name;
        int hp;
        Samurai samurai;
        String specialName;
        int specialPower;
        String specialElement;
        SpecialTech specialTech;
        //prompting
        System.out.println("Enter Samurai name: ");
        name = myScan.nextLine();
        System.out.println("Enter the HP:");
        hp = Integer.parseInt(myScan.nextLine());
        //construcor
        samurai = new Samurai(name,hp);
        System.out.printf("Enter Moves for %s,\n",name);
        while(true) {
            System.out.println("\tEnter a Move name or Q if finished:  ".toLowerCase());
            specialName = myScan.nextLine();
            if (specialName.equals("Q")) {
                break;
            }
            //promt input
            System.out.print("\t Enter Move's Power: ");
            specialPower = Integer.parseInt(myScan.nextLine());
            System.out.print("\t Enter move's element: ");
            specialElement = myScan.nextLine();
            specialTech = new SpecialTech(specialName,specialPower,specialElement);
            //add
            samurai.addSpecTech(specialTech);
        }
        roster.addSamurai(samurai);
        System.out.printf("%s Fighter to the Roster\n\n",name);
    }
}
