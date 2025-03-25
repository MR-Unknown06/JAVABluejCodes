import java.util.Scanner;

/**
 * Write a description of class percent here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class percent
{
     public static void main(String[] args) {
       
        float markedPrice, sellingPrice;
        
        
        char category;
        
       
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("Enter the marked price of the item: ");
        markedPrice = scanner.nextFloat();
        
        
        System.out.print("Enter the category of the item (A/B/C/D): ");
        category = scanner.next().charAt(0);
        
        
        if (category == 'A' || category == 'a') {
            sellingPrice = markedPrice - (markedPrice * 0.60f); 
        } 
        else if (category == 'B' || category == 'b') {
            sellingPrice = markedPrice - (markedPrice * 0.40f); 
        }
        else if (category == 'C' || category == 'c') {
            sellingPrice = markedPrice - (markedPrice * 0.20f);
        }
        else if (category == 'D' || category == 'd') {
            sellingPrice = markedPrice - (markedPrice * 0.10f); 
        }
        else {
            System.out.println("Invalid category entered. No discount applied.");
            sellingPrice = markedPrice;
        }
        
        
        System.out.printf("Selling Price: %.2f%n", sellingPrice);
        
        
        scanner.close();
    }
}