public class Waterpark {

    public static String TicketPrice(double height, int day) {
        if (height < 0.4 || height > 2.6) {
            return "Invalid Input";
        }

        if (day < 1 || day > 7) {
            return "Invalid Input";
        }

        int price;

        if (height < 0.9) {
            price = 0;
        } else if (height < 1.35) {
            price = 150000;
        } else {
            price = 180000;
        }

        if (day == 1 || day == 7) {
            price += 20000;
        }

        return String.valueOf(price);
    }
}
