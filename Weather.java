public class Weather {
    public static void main(String args[]) {
        String cities[] = {"New York", "Los Angeles", "Chicago"};
        int temperatures[] = {28, 32, 24};
        char forecasts[] = {'Sunny', 'Cloudy', 'Partly Cloudy'};

        System.out.print("Cities are: ");
        for (int i = 0; i < cities.length; i++) {
            System.out.print(cities[i] + " ");
        }
        System.out.println("\n");

        System.out.print("Temperatures are: ");
        for (int i = 0; i < temperatures.length; i++) {
            System.out.print(temperatures[i] + " ");
        }
        System.out.println("\n");

        System.out.print("Humidity levels are: ");
        for (int i = 0; i < humidity.length; i++) {
            System.out.print(humidity[i] + " ");
        }
        System.out.println("\n");

        System.out.print("Forecasts are: ");
        for (int i = 0; i < forecasts.length; i++) {
            System.out.print(forecasts[i] + " ");
        }
    }
}
