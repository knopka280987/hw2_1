import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        var maxim =
                new Human("Maxim", LocalDate.of(1987, 8, 8), "Minsk", "Brand manager");
        var anna =
                new Human("Anna", LocalDate.of(1993, 8, 8), "Moscow", "Metodist");
        var katya =
                new Human("Katya", LocalDate.of(1994, 8, 8),"Kaliningrad", "Product-manager");
        var artem =
                new Human("Artem", LocalDate.of(1985, 8, 8),"Moscow", "Business development manager");
        System.out.println(maxim);
        System.out.println(anna);
        System.out.println(katya);
        System.out.println(artem);

    }
}