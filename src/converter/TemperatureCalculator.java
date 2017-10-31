
package converter;

import javax.swing.JOptionPane;

public class TemperatureCalculator {
    public double handleInput(String from, String to, double input) {
        if(from.equals(to)) {
            JOptionPane.showMessageDialog(null, "Please pick two different units");
        }
        else if (from.equals("Kelvin (K)")) {
            switch (to) {
                case ("Celsius (C)"):
                    return input - 273.1500D;
                case ("Fahrenheit (F)"):
                    return kelvinToFahrenheit(input);
            }
        }
        
        
        else if (from.equals("Celsius (C)")) {
            switch (to) {
                case ("Kelvin (K)"):
                    return input + 273.1500D;
                case ("Fahrenheit (F)"):
                    return (input * 1.8D + 32D);
            }
        }
        
        else if (from.equals("Fahrenheit (F)")) {
            switch (to) {
                case ("Kelvin (K)"):
                    return fahrToKelvin(input);
                case ("Celsius (C)"):
                    return fahrToCelsius(input);
            }
        }
        
        
        
        
        return 401D;
    }

    private double kelvinToFahrenheit(double input) {
        double a = ((9D/5D)*(input - 273.15D) + 32D);
        return a;
    }

    private double fahrToKelvin(double input) {
        double a = input;
        a = a - 32D;
        a = a * 5D;
        a = a / 9D;
        a = a + 273.15D;
        return a;
    }

    private double fahrToCelsius(double input) {
        double a = input;
        a = a - 32;
        a = a * 5;
        a = a / 9;
        
        return a;
        
    }
}
