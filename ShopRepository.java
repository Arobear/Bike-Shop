import java.io.*;

public class ShopRepository {

    private static final String FILENAME = "order.txt";

    private static File getDataSource() {
        final File file = new File(FILENAME);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.out.println("Error creating file: " + FILENAME + ": " + e.getMessage());
            }
        }
        return file;
    }

    public static void insert(Order order) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(getDataSource(), true);
            writer.write(format(order) + "\n");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + FILENAME + ": " + e.getMessage());
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    System.out.println("Error closing file: " + FILENAME + ": " + e.getMessage());
                }
            }
        }
    }

    public static Order[] getAll() {
        int len = getTotalNumberOfOrders();
        int counter = 0;
        Order[] orders = new Order[len];
        FileReader reader = null;
        BufferedReader bufferedReader = null;
        try {
            reader = new FileReader(getDataSource());
            bufferedReader = new BufferedReader(reader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] parts = line.split(", ");
                if (parts.length == 5) {
                    String name = parts[0].substring(parts[0].indexOf(":") + 2);
                    String phone = parts[1].substring(parts[1].indexOf(":") + 2);
                    String bikes = parts[2].substring(parts[2].indexOf(":") + 2);
                    String payment = parts[3].substring(parts[3].indexOf(":") + 2);
                    double price = Double.parseDouble(parts[4].substring(parts[4].indexOf("$") + 1));

                    orders[counter++] = new Order(name, phone, bikes, payment, price);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + FILENAME + ": " + e.getMessage());
        } finally {
            closeResources(reader, bufferedReader);
        }
        return orders;
    }

    public static int getTotalNumberOfOrders() {
        int total = 0;
        FileReader reader = null;
        BufferedReader bufferedReader = null;
        try {
            reader = new FileReader(getDataSource());
            bufferedReader = new BufferedReader(reader);
            while (bufferedReader.readLine() != null) {
                total++;
            }
        } catch (IOException e) {
            System.out.println("Error counting orders: " + FILENAME + ": " + e.getMessage());
        } finally {
            closeResources(reader, bufferedReader);
        }
        return total;
    }

    private static void closeResources(FileReader reader, BufferedReader bufferedReader) {
        if (bufferedReader != null) {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                System.out.println("Error closing bufferedReader: " + FILENAME + ": " + e.getMessage());
            }
        }
        if (reader != null) {
            try {
                reader.close();
            } catch (IOException e) {
                System.out.println("Error closing fileReader: " + FILENAME + ": " + e.getMessage());
            }
        }
    }

    private static String format(Order order) {
        return "Name: " + order.getName()
             + ", Phone: " + order.getPhone()
             + ", Bikes: " + order.getBikesInput()
             + ", Payment: " + order.getPaymentMethod()
             + ", Price: $" + order.getOrderPrice();
    }
}
