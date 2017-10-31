package converter;

import javax.swing.JOptionPane;

public class VolumeCalculator {
    public double handleInput(String from, String to, double input) {
        if(from.equals(to)) {
            JOptionPane.showMessageDialog(null, "Please pick two different units");
        }
        else if (from.equals("meter (m3)")) {
            switch (to) {
                case ("deci (dm3) / liter (L)"):
                    return input * 1000D;
                case ("deci liter (dL)"):
                    return input * 10000D;
                case ("centi liter (cL)"):
                    return input * 100000D;
                case ("centi (cm3) / mL"):
                    return input * 1000000D;
                case ("milli (mm3)"):
                    return input * 1000000000D;
                case ("micro (μm3)"):
                    return input * 1e+18D;
                case ("nano (nm3)"):
                    return input * 1e+27D;
            }
        }
        
        
        else if (from.equals("deci (dm3) / liter (L)")) {
            switch (to) {
                case ("meter (m3)"):
                    return input / 1000D;
                case ("deci liter (dL)"):
                    return input * 10D;
                case ("centi liter (cL)"):
                    return input * 100D;
                case ("centi (cm3) / mL"):
                    return input * 1000D;
                case ("milli (mm3)"):
                    return input * 1000000D;
                case ("micro (μm3)"):
                    return input * 1e+15D;
                case ("nano (nm3)"):
                    return input * 1e+24D;
            }
        }
        
        else if (from.equals("deci liter (dL)")) {
            switch (to) {
                case ("meter (m3)"):
                    return input / 10000D;
                case ("deci (dm3) / liter (L)"):
                    return input / 10D;
                case ("centi liter (cL)"):
                    return input * 10D;
                case ("centi (cm3) / mL"):
                    return input * 100D;
                case ("milli (mm3)"):
                    return input * 100000D;
                case ("micro (μm3)"):
                    return input * 1e+14D;
                case ("nano (nm3)"):
                    return input * 1e+23D;
            }
        }
        
        else if (from.equals("centi liter (cL)")) {
            switch (to) {
                case ("meter (m3)"):
                    return input * 1e-5D;
                case ("deci (dm3) / liter (L)"):
                    return input * 0.01D;
                case ("deci liter (dL)"):
                    return input * 0.1D;
                case ("centi (cm3) / mL"):
                    return input * 10D;
                case ("milli (mm3)"):
                    return input * 10000D;
                case ("micro (μm3)"):
                    return input * 1e+13D;
                case ("nano (nm3)"):
                    return input * 1e+22D;
            }
        }
        
        else if (from.equals("centi (cm3) / mL")) {
            switch (to) {
                case ("meter (m3)"):
                    return input * 1e-6D;
                case ("deci (dm3) / liter (L)"):
                    return input * 0.001D;
                case ("deci liter (dL)"):
                    return input * 0.01D;
                case ("centi liter (cL)"):
                    return input * 0.1D;
                case ("milli (mm3)"):
                    return input * 1000D;
                case ("micro (μm3)"):
                    return input * 1e+12D;
                case ("nano (nm3)"):
                    return input * 1e+21D;
            }
        }
        
        else if (from.equals("milli (mm3)")) {
            switch (to) {
                case ("meter (m3)"):
                    return input * 1e-9D;
                case ("deci (dm3) / liter (L)"):
                    return input * 1e-6D;
                case ("deci liter (dL)"):
                    return input * 1e-5D;
                case ("centi liter (cL)"):
                    return input * 0.0001D;
                case ("centi (cm3) / mL"):
                    return input * 0.001D;
                case ("micro (μm3)"):
                    return input * 1e+9D;
                case ("nano (nm3)"):
                    return input * 1e+18D;
            }
        }
        
        else if (from.equals("micro (μm3)")) {
            switch (to) {
                case ("meter (m3)"):
                    return input * 1e-18D;
                case ("deci (dm3) / liter (L)"):
                    return input * 1e-15D;
                case ("deci liter (dL)"):
                    return input * 1e-14D;
                case ("centi liter (cL)"):
                    return input * 1e-13D;
                case ("centi (cm3) / mL"):
                    return input * 1e-12D;
                case ("milli (mm3)"):
                    return input * 1e-9D;
                case ("nano (nm3)"):
                    return input * 1e+9D;
            }
        }
        
        else if (from.equals("nano (nm3)")) {
            switch (to) {
                case ("meter (m3)"):
                    return input * 1e-27D;
                case ("deci (dm3) / liter (L)"):
                    return input * 1e-24D;
                case ("deci liter (dL)"):
                    return input * 1e-23D;
                case ("centi liter (cL)"):
                    return input * 1e-22D;
                case ("centi (cm3) / mL"):
                    return input * 1e-21D;
                case ("milli (mm3)"):
                    return input * 1e-18D;
                case ("micro (μm3)"):
                    return input * 1e-9D;
            }
        }
        
        
        
        
        return 404D;
    }
}
