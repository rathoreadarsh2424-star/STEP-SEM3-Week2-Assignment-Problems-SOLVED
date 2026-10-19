import java.util.Scanner;

public class Problem3ProductInventoryCSVParser {
    static void parseInventoryRecord(String csvLine) {
        String[] fields = csvLine.split(",", -1);
        if (fields.length != 3) {
            System.out.println("Invalid Record");
            return;
        }
        String product = fields[0].trim();
        String sku = fields[1].trim();
        String quantity = fields[2].trim();

        if (product.isEmpty() || sku.isEmpty() || quantity.isEmpty()) {
            System.out.println("Invalid Record");
            return;
        }
        System.out.printf("Product: %s | SKU: %s | Qty: %s%n", product, sku, quantity);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter inventory CSV (ProductName,SKU,Quantity): ");
        parseInventoryRecord(sc.nextLine());
        sc.close();
    }
}
