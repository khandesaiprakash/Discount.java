import java.util.Scanner;

public class discount
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the item1:");
        int item1 = sc.nextInt();
        System.out.println("Enter the item1:");
        int item2 = sc.nextInt();

        // Input discount percentage
        System.out.println("Enter the discount:");
        int discountPercentage = sc.nextInt();

        // Calculate total amount
        double totalAmount = item1 + item2;

        // Calculate discounted price
        double discountAmount = totalAmount * (discountPercentage / 100.0);
        double discountedPrice = totalAmount - discountAmount;

        // Calculate amount saved
        double amountSaved = discountAmount;

        // Output results
        System.out.println("Total amount: " + totalAmount);
        System.out.println("Discounted price: " + discountedPrice);
        System.out.println("Amount saved: " + amountSaved);
    }
}
