import java.util.Scanner;
public class FossilClassification {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Fossil Age: ");
        int age = scanner.nextInt();
        if(age <= 252000000 && age >= 202000000){
            System.out.println("It was fossilized during the Triassic Peroid.");
        }
        else if (age <= 201999999 && age >= 145000000) {
            System.out.println("It was fossilized during the Jurassic Peroid.");
        }
        else if(age <= 144999999 && age >= 66000000){
            System.out.println("It was fossilized during the Cretaceous Peroid.");
        }
        else{
            System.out.println("We couldn't find the fossilized peroid.");
        }
    }
}
