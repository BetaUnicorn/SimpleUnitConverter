package converter;

import javax.swing.JOptionPane;

class LengthCalculator {

    double handleInput(String from, String to, double input) {
        WeightCalcHelper calc = new WeightCalcHelper();
        
        if(from.equals(to)) {
            JOptionPane.showMessageDialog(null, "Please pick two different units");
        }
        else if (from.equals("giga (Gg)")) {
            switch (to) {
                case ("mega (Mm)"):
                    return calc.gigaToMega(input);
                case ("kilo (km)"):
                    return calc.gigaToKilo(input);
                case ("hecto (hm)"):
                    return calc.gigaToHecto(input);
                case ("deca (dam)"):
                    return calc.gigaToDeka(input);
                case ("meter (m)"):
                    return calc.gigaToGram(input);
                case ("deci (dm)"):
                    return calc.gigaToDeci(input);
                case ("centi (cm)"):
                    return calc.gigaToCenti(input);
                case ("milli (mm)"):
                    return calc.gigaToMilli(input);
                case ("micro (μm)"):
                    return calc.gigaToMicro(input);
                case ("nano (nm)"):
                    return calc.gigaToNano(input);
                case ("pico/micro micro (pm)"):
                    return calc.gigaToPico(input);
            }
        }
        else if (from.equals("mega (Mm)")) {
            switch (to) {
                case ("giga (Gm)"):
                    return input / 1000D;
                case ("kilo (km)"):
                    return input * 1000D;
                case ("hecto (hm)"):
                    return input * 10000D;
                case ("deca (dam)"):
                    return input * 100000D;
                case ("meter (m)"):
                    return input * 1000000D;
                case ("deci (dm)"):
                    return input * 10000000D;
                case ("centi (cm)"):
                    return input * 100000000D;
                case ("milli (mm)"):
                    return input * 1000000000D;
                case ("micro (μm)"):
                    return input * 1000000000000D;
                case ("nano (nm)"):
                    return input * 1000000000000000D;
                case ("pico/micro micro (pm)"):
                    return input * 1000000000000000000D;
            }
        }
        
        else if (from.equals("kilo (km)")) {
            switch (to) {
                case ("giga (Gm)"):
                    return input / 1000000D;
                case ("mega (Mm)"):
                    return input / 1000D;
                case ("hecto (hm)"):
                    return input * 10D;
                case ("deca (dam)"):
                    return input * 100D;
                case ("meter (m)"):
                    return input * 1000D;
                case ("deci (dm)"):
                    return input * 10000D;
                case ("centi (cm)"):
                    return input * 100000D;
                case ("milli (mm)"):
                    return input * 1000000D;
                case ("micro (μm)"):
                    return input * 1000000000D;
                case ("nano (nm)"):
                    return input * 1000000000000D;
                case ("pico/micro micro (pm)"):
                    return input * 1000000000000000D;
            }
        }
        
        else if (from.equals("hecto (hm)")) {
            switch (to) {
                case ("giga (Gm)"):
                    return input / 10000000D;
                case ("mega (Mm) / ton"):
                    return input / 10000D;
                case ("kilo (km)"):
                    return input / 10D;
                case ("deca (dam)"):
                    return input * 10D;
                case ("meter (m)"):
                    return input * 100D;
                case ("deci (dm)"):
                    return input * 1000D;
                case ("centi (cm)"):
                    return input * 10000D;
                case ("milli (mm)"):
                    return input * 100000D;
                case ("micro (μm)"):
                    return input * 100000000D;
                case ("nano (nm)"):
                    return input * 100000000000D;
                case ("pico/micro micro (pm)"):
                    return input * 100000000000000D;
            }
        }
        
        else if (from.equals("deca (dam)")) {
            switch (to) {
                case ("giga (Gm)"):
                    return input / 100000000D;
                case ("mega (Mm) / ton"):
                    return input / 100000D;
                case ("kilo (km)"):
                    return input / 100D;
                case ("hecto (hm)"):
                    return input / 10D;
                case ("meter (m)"):
                    return input * 10D;
                case ("deci (dm)"):
                    return input * 100D;
                case ("centi (cm)"):
                    return input * 1000D;
                case ("milli (mm)"):
                    return input * 10000D;
                case ("micro (μm)"):
                    return input * 10000000D;
                case ("nano (nm)"):
                    return input * 10000000000D;
                case ("pico/micro micro (pm)"):
                    return input * 10000000000000D;
            }
        }
        
        else if (from.equals("meter (m)")) {
            switch (to) {
                case ("giga (Gm)"):
                    return input / 1000000000D;
                case ("mega (Mm)"):
                    return input / 1000000D;
                case ("kilo (km)"):
                    return input / 1000D;
                case ("hecto (hm)"):
                    return input / 100D;
                case ("deca (dam)"):
                    return input / 10D;
                case ("deci (dm)"):
                    return input * 10D;
                case ("centi (cm)"):
                    return input * 100D;
                case ("milli (mm)"):
                    return input * 1000D;
                case ("micro (μm)"):
                    return input * 1000000D;
                case ("nano (nm)"):
                    return input * 1000000000D;
                case ("pico/micro micro (pm)"):
                    return input * 1000000000000D;
            }
        }
        
        else if (from.equals("deci (dm)")) {
            switch (to) {
                case ("giga (Gm)"):
                    return input / 10000000000D;
                case ("mega (Mm)"):
                    return input / 10000000D;
                case ("kilo (km)"):
                    return input / 10000D;
                case ("hecto (hm)"):
                    return input / 1000D;
                case ("deca (dam)"):
                    return input / 100D;
                case ("meter (m)"):
                    return input / 10D;
                case ("centi (cm)"):
                    return input * 10D;
                case ("milli (mm)"):
                    return input * 100D;
                case ("micro (μm)"):
                    return input * 100000D;
                case ("nano (nm)"):
                    return input * 100000000D;
                case ("pico/micro micro (pm)"):
                    return input * 100000000000D;
            }
        }
        
        else if (from.equals("centi (cm)")) {
            switch (to) {
                case ("giga (Gm)"):
                    return input / 100000000000D;
                case ("mega (Mm)"):
                    return input / 100000000D;
                case ("kilo (km)"):
                    return input / 100000D;
                case ("hecto (hm)"):
                    return input / 10000D;
                case ("deca (dam)"):
                    return input / 1000D;
                case ("meter (m)"):
                    return input / 100D;
                case ("deci (dm)"):
                    return input / 10D;
                case ("milli (mm)"):
                    return input * 10D;
                case ("micro (μm)"):
                    return input * 10000D;
                case ("nano (nm)"):
                    return input * 10000000D;
                case ("pico/micro micro (pm)"):
                    return input * 10000000000D;
            }
        }
        
        else if (from.equals("milli (mm)")) {
            switch (to) {
                case ("giga (Gm)"):
                    return input / 1000000000000D;
                case ("mega (Mm) / ton"):
                    return input / 1000000000D;
                case ("kilo (km)"):
                    return input / 1000000D;
                case ("hecto (hm)"):
                    return input / 100000D;
                case ("deca (dam)"):
                    return input / 10000D;
                case ("meter (m)"):
                    return input / 1000D;
                case ("deci (dm)"):
                    return input / 100D;
                case ("centi (cm)"):
                    return input / 10D;
                case ("micro (μm)"):
                    return input * 1000D;
                case ("nano (nm)"):
                    return input * 1000000D;
                case ("pico/micro micro (pm)"):
                    return input * 1000000000D;
            }
        }
        
        else if (from.equals("micro (μm)")) {
            switch (to) {
                case ("giga (Gm)"):
                    return input / 1000000000000000D;
                case ("mega (Mm) / ton"):
                    return input / 1000000000000D;
                case ("kilo (km)"):
                    return input / 1000000000D;
                case ("hecto (hm)"):
                    return input / 100000000D;
                case ("deca (dam)"):
                    return input / 10000000D;
                case ("meter (m)"):
                    return input / 1000000D;
                case ("deci (dm)"):
                    return input / 100000D;
                case ("centi (cm)"):
                    return input / 10000D;
                case ("milli (mm)"):
                    return input / 1000D;
                case ("nano (nm)"):
                    return input * 1000D;
                case ("pico/micro micro (pm)"):
                    return input * 1000000D;
            }
        }
        
        else if (from.equals("nano (nm)")) {
            switch (to) {
                case ("giga (Gm)"):
                    return input / 1000000000000000000D;
                case ("mega (Mm) / ton"):
                    return input / 1000000000000000D;
                case ("kilo (km)"):
                    return input / 1000000000000D;
                case ("hecto (hm)"):
                    return input / 100000000000D;
                case ("deca (dam)"):
                    return input / 10000000000D;
                case ("meter (m)"):
                    return input / 1000000000D;
                case ("deci (dm)"):
                    return input / 100000000D;
                case ("centi (cm)"):
                    return input / 10000000D;
                case ("milli (mm)"):
                    return input / 1000000D;
                case ("micro (μm)"):
                    return input / 1000D;
                case ("pico/micro micro (pm)"):
                    return input * 1000D;
            }
        }
        
        else if (from.equals("pico/micro micro (pm)")) {
            switch (to) {
                case ("giga (Gm)"):
                    return input / 1000000000000000000000D;
                case ("mega (Mm) / ton"):
                    return input / 1000000000000000000D;
                case ("kilo (km)"):
                    return input / 1000000000000000D;
                case ("hecto (hm)"):
                    return input / 100000000000000D;
                case ("deca (dam)"):
                    return input / 10000000000000D;
                case ("meter (m)"):
                    return input / 1000000000000D;
                case ("deci (dm)"):
                    return input / 100000000000D;
                case ("centi (cm)"):
                    return input / 10000000000D;
                case ("milli (mm)"):
                    return input / 1000000000D;
                case ("micro (μm)"):
                    return input / 1000000D;
                case ("nano (nm)"):
                    return input / 1000D;
            }
        }
        
        
        
        return 404D;
    }
    
}
