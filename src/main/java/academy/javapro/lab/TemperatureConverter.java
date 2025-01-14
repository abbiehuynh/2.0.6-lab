package academy.javapro.lab;

public class TemperatureConverter {
    public static void main(String[] args) {
        // Predefined temperature values
        double celsius1 = 0.0;
        double celsius2 = 100.0;
        double fahrenheit1 = 32.0;
        double fahrenheit2 = 98.6;

        // Convert Celsius to Fahrenheit
        double fahrenheitFromCelsius1 = (celsius1 * 9/5) + 32;
        double fahrenheitFromCelsius2 = (celsius2 * 9/5) + 32;

        // Convert Fahrenheit to Celsius
        double celsiusFromFahrenheit1 = (fahrenheit1 - 32) * 5/9;
        double celsiusFromFahrenheit2 = (fahrenheit2 - 32) * 5/9;

        // Display the results formatted to two decimal places
        System.out.println("Temperature Conversions:");
        System.out.printf("%.2f°C is equal to %.2f°F\n", celsius1, fahrenheitFromCelsius1);
        System.out.printf("%.2f°C is equal to %.2f°F\n", celsius2, fahrenheitFromCelsius2);
        System.out.printf("%.2f°C is equal to %.2f°F\n", fahrenheit1, celsiusFromFahrenheit1);
        System.out.printf("%.2f°C is equal to %.2f°F\n", fahrenheit2, celsiusFromFahrenheit2);
    }
}