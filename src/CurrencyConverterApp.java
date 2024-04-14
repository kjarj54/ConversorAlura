import java.io.IOException;
import java.util.Scanner;

public class CurrencyConverterApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Ingrese la moneda base (ej. USD): ");
            String baseCurrency = scanner.nextLine();

            System.out.println("Ingrese la cantidad a convertir: ");
            double amount = scanner.nextDouble();
            scanner.nextLine(); // Limpiar el buffer

            System.out.println("Ingrese la moneda objetivo (ej. EUR): ");
            String targetCurrency = scanner.nextLine();

            String jsonResponse = CurrencyApi.getExchangeRates(baseCurrency);
            double exchangeRate = JsonParser.parseExchangeRate(jsonResponse, targetCurrency);
            double convertedAmount = CurrencyConverter.convertCurrency(amount, exchangeRate);

            System.out.println("El monto convertido es: " + convertedAmount + " " + targetCurrency);
        } catch (IOException | InterruptedException e) {
            System.err.println("Error al obtener datos de la API: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
