import java.util.Scanner;
public class PolygonIdentification {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Polygon Indentification: ");
        int sides = scanner.nextInt();
        switch (sides) {
            case 3:
                System.out.println("This is a triangle");
                break;
            case 4:
                System.out.println("This is a square");
                break;
            case 5:
                System.out.println("This is a pentagon");
                break;
            case 6:
                System.out.println("This is a hexagon");
                break;
        
            default:
                System.out.println("Figure it out youself you are a math teacher and only have one job so do it");
                break;
        }

    }
}
