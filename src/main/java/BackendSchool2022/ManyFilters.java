package BackendSchool2022;

import org.json.simple.JSONArray;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ManyFilters {

    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd.MM.yyyy");

    record Product(int id, String name, int price, LocalDate date) {
        @Override
        public String toString() {
            return "{id: " + id + ", name: " + name + ", price: " + price + ", date: " + date.format(FORMATTER) + "}";
        }
    }

    static void getFiltered(List<String[]> filters, List<Product> products) {
        String nameFilter = filters.get(0)[1];
        int lowestPrice = Integer.parseInt(filters.get(1)[1]);
        int highestPrice = Integer.parseInt(filters.get(2)[1]);
        LocalDate dateAfter = LocalDate.parse(filters.get(3)[1], FORMATTER);
        LocalDate dateBefore = LocalDate.parse(filters.get(4)[1], FORMATTER);
        products.sort(Comparator.comparingInt(Product::id));
        List<Product> ans = products.stream()
                .filter(p -> p.name.contains(nameFilter))
                .filter(p -> p.price > lowestPrice)
                .filter(p -> p.price < highestPrice)
                .filter(p -> p.date.isAfter(dateAfter))
                .filter(p -> p.date.isBefore(dateBefore))
                .toList();
        JSONArray arr = new JSONArray();
        for (Product p : ans) {
            arr.add(p);
        }
        System.out.println(arr);
    }

    public static void main(String[] args) {
        List<String[]> filters = new ArrayList<>();
        filters.add(new String[]{"name", "notebook"});
        filters.add(new String[]{"price_lower", "2000"});
        filters.add(new String[]{"price_higher", "2400"});
        filters.add(new String[]{"after", "12.09.2021"});
        filters.add(new String[]{"before", "12.02.2022"});
        List<Product> products = new ArrayList<>();
        products.add(new Product(10, "notebookooo", 2100, LocalDate.of(2021, 10, 15)));
        products.add(new Product(2, "Dell notebook", 2200, LocalDate.of(2021, 10, 29)));
        getFiltered(filters, products);
    }
}
