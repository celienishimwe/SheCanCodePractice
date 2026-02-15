package FullPractice;

public class temperature {
    public static void main(String[] args) {

        double celsius = 25;

        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println(celsius + "°C is " + fahrenheit + "°F");

        if (celsius < -273.15) {
            System.out.println("Temperature below absolute zero");
        }
        double[] temp = {0, 25, 37, 100};
        System.out.println("\nMultiple Conversions:");
        for (int i = 0; i < temp.length; i++) {
            double f = (temp[i] * 9 / 5) + 32;
            System.out.println(temp[i] + "°C = " + f + "°F");
        }
    }
}
