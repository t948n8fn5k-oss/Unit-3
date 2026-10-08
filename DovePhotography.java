import java.util.Scanner;
public class DovePhotography {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Is the bird a dove? ");
        String dove = scanner.next();
        System.out.println("What family is it? ");
        String family = scanner.next();
        System.out.println("What feather color does it have? ");
        String featherColor = scanner.next();
        System.out.println("What eye color does it have? ");
        String eyeColor = scanner.next();
        if (dove.equals("yes")) {
            System.out.println("Dove! Take Pictures!");
            if(family.equals("columbidae")){
                if (featherColor.equals("orange")) {
                    if (eyeColor.equals("blue")) {
                        System.out.println("Cooler dove!! Take many pictures!!");
                    }
                }
            }
        }
        else{
            System.out.print("Meh bird... let's find a different one.");
        }

    }
}
