import java.util.Scanner;

/**
 * Write a description of class switchpercnet here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class switchpercnet
{
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the marked price of the item: ");
        float markedPrice = scanner.nextFloat();

        
        System.out.print("Enter the category (A, B, C, or D): ");
        char category = scanner.next().charAt(0);

        float discount = 0;

        
        switch (Character.toUpperCase(category)) {
            case 'A':
                discount = 0.60f;
                break;
            case 'B':
                discount = 0.40f; 
                break;
            case 'C':
                discount = 0.20f; 
                break;
            case 'D':
                discount = 0.10f; 
                break;
            default:
                System.out.println("Invalid category entered. No discount applied.");
                discount = 0;
        }
        float sellingPrice = markedPrice - (markedPrice * discount);
        System.out.println("\nItem Details:");
        System.out.println("Marked Price: ₹" + markedPrice);
        System.out.println("Category: " + Character.toUpperCase(category));
        System.out.println("Discount Applied: " + (discount * 100) + "%");
        System.out.println("Selling Price: ₹" + sellingPrice);

    }
}