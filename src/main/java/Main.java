import java.util.*;

public class Main {
    public static List<Integer> quantity = new ArrayList<>();
    public static List<Integer> price = new ArrayList<>();
    public static ResourceBundle rb;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Language: ");
        System.out.println("1. English ");
        System.out.println("2. Finnish ");
        System.out.println("3. Swedish ");
        System.out.println("4. Japanese ");
        int lang = sc.nextInt();
        if (lang == 1) {
            Locale myLocale = new Locale("en", "US");
            rb = ResourceBundle.getBundle("MessagesBundle", myLocale);
        } else if (lang == 2) {
            Locale myLocale = new Locale("fi", "FI");
            rb = ResourceBundle.getBundle("MessagesBundle", myLocale);
        } else if (lang == 3) {
            Locale myLocale = new Locale("sv", "SE");
            rb = ResourceBundle.getBundle("MessagesBundle", myLocale);
        } else if (lang == 4) {
            Locale myLocale = new Locale("ja", "JP");
            rb = ResourceBundle.getBundle("MessagesBundle", myLocale);
        } else {
            Locale myLocale = new Locale("en", "US");
            rb = ResourceBundle.getBundle("MessagesBundle", myLocale);
        }

        String m = rb.getString("first");
        String m1 = rb.getString("price");
        String m2 = rb.getString("quantity");
        String m3 = rb.getString("total");
        System.out.println(m);
        int items = sc.nextInt();
        for (int i=0;i<items;i++) {
            System.out.println(m1+ " "+ (i+1));
            int price1 = sc.nextInt();
            System.out.println(m2 + " " + (i+1));
            int quantity1 = sc.nextInt();
            quantity.add(price1);
            price.add(quantity1);
        }
        System.out.println("______________________");
        System.out.println(m3 + " " +calculateTotal(price, quantity));

    }

    public static double calculateTotal(List<Integer> price, List<Integer> quantity) {
        double total = 0;
        for (int i = 0; i < quantity.size(); i++) {
            total += quantity.get(i) * price.get(i);
        }
        return total;
    }
}
