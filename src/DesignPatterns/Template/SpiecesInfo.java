package DesignPatterns.Template;

import javax.management.relation.RoleInfoNotFoundException;
import java.util.Scanner;

public class SpiecesInfo {

    public static void main(String[] args) throws InfoNotFoundException {
        Scanner sc = new Scanner(System.in);
        boolean proceed = true;
        while (proceed) {
            System.out.println("Enter spieces name: ");
            String name = sc.nextLine();
            GrowthStage obj = null;
            switch (name.toLowerCase()) {
                case "human": {
                    obj = new HumanStages();
                    break;
                }
                case "panda": {
                    obj = new PandaStages();
                    break;
                }
                case "elephant": {
                    obj = new ElephantStages();
                    break;
                }
                default: {
                    throw new InfoNotFoundException(name) ;
                }
            }

            obj.allStages();

            System.out.println("To Exit the program, enter 'q' to quit, Else press enter to continue");
            proceed = sc.nextLine().equals("q")?false:true;
        }
    }
}
