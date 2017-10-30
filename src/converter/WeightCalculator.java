package converter;

import javax.swing.JOptionPane;

public class WeightCalculator {
    
    public double handleInput(String from, String to, double input) {
        WeightCalcHelper calc = new WeightCalcHelper();
        
        if(from.equals(to)) {
            JOptionPane.showMessageDialog(null, "Please pick two different units");
        }
        else if (from.equals("giga (Gg)")) {
            switch (to) {
                case ("mega (Mg) / ton"):
                    return calc.gigaToMega(input);
                case ("kilo (kg)"):
                    return calc.gigaToKilo(input);
                case ("hecto (hg)"):
                    return calc.gigaToHecto(input);
                case ("deca (dag)"):
                    return calc.gigaToDeka(input);
                case ("gram (g)"):
                    return calc.gigaToGram(input);
                case ("deci (dg)"):
                    return calc.gigaToDeci(input);
                case ("centi (cg)"):
                    return calc.gigaToCenti(input);
                case ("milli (mg)"):
                    return calc.gigaToMilli(input);
                case ("micro (μg)"):
                    return calc.gigaToMicro(input);
                case ("nano (ng)"):
                    return calc.gigaToNano(input);
                case ("pico/micro micro (pg)"):
                    return calc.gigaToPico(input);
            }
        }
        else if (from.equals("mega (Mg) / ton")) {
            switch (to) {
                case ("giga (Gg)"):
                    return input / 1000D;
                case ("kilo (kg)"):
                    return input * 1000D;
                case ("hecto (hg)"):
                    return input * 10000D;
                case ("deca (dag)"):
                    return input * 100000D;
                case ("gram (g)"):
                    return input * 1000000D;
                case ("deci (dg)"):
                    return input * 10000000D;
                case ("centi (cg)"):
                    return input * 100000000D;
                case ("milli (mg)"):
                    return input * 1000000000D;
                case ("micro (μg)"):
                    return input * 1000000000000D;
                case ("nano (ng)"):
                    return input * 1000000000000000D;
                case ("pico/micro micro (pg)"):
                    return input * 1000000000000000000D;
            }
        }
        
        else if (from.equals("kilo (kg)")) {
            switch (to) {
                case ("giga (Gg)"):
                    return input / 1000000D;
                case ("mega (Mg) / ton"):
                    return input / 1000D;
                case ("hecto (hg)"):
                    return input * 10D;
                case ("deca (dag)"):
                    return input * 100D;
                case ("gram (g)"):
                    return input * 1000D;
                case ("deci (dg)"):
                    return input * 10000D;
                case ("centi (cg)"):
                    return input * 100000D;
                case ("milli (mg)"):
                    return input * 1000000D;
                case ("micro (μg)"):
                    return input * 1000000000D;
                case ("nano (ng)"):
                    return input * 1000000000000D;
                case ("pico/micro micro (pg)"):
                    return input * 1000000000000000D;
            }
        }
        
        else if (from.equals("hecto (hg)")) {
            switch (to) {
                case ("giga (Gg)"):
                    return input / 10000000D;
                case ("mega (Mg) / ton"):
                    return input / 10000D;
                case ("kilo (kg)"):
                    return input / 10D;
                case ("deca (dag)"):
                    return input * 10D;
                case ("gram (g)"):
                    return input * 100D;
                case ("deci (dg)"):
                    return input * 1000D;
                case ("centi (cg)"):
                    return input * 10000D;
                case ("milli (mg)"):
                    return input * 100000D;
                case ("micro (μg)"):
                    return input * 100000000D;
                case ("nano (ng)"):
                    return input * 100000000000D;
                case ("pico/micro micro (pg)"):
                    return input * 100000000000000D;
            }
        }
        
        else if (from.equals("deca (dag)")) {
            switch (to) {
                case ("giga (Gg)"):
                    return input / 100000000D;
                case ("mega (Mg) / ton"):
                    return input / 100000D;
                case ("kilo (kg)"):
                    return input / 100D;
                case ("hecto (hg)"):
                    return input / 10D;
                case ("gram (g)"):
                    return input * 10D;
                case ("deci (dg)"):
                    return input * 100D;
                case ("centi (cg)"):
                    return input * 1000D;
                case ("milli (mg)"):
                    return input * 10000D;
                case ("micro (μg)"):
                    return input * 10000000D;
                case ("nano (ng)"):
                    return input * 10000000000D;
                case ("pico/micro micro (pg)"):
                    return input * 10000000000000D;
            }
        }
        
        else if (from.equals("gram (g)")) {
            switch (to) {
                case ("giga (Gg)"):
                    return input / 1000000000D;
                case ("mega (Mg) / ton"):
                    return input / 1000000D;
                case ("kilo (kg)"):
                    return input / 1000D;
                case ("hecto (hg)"):
                    return input / 100D;
                case ("deca (dag)"):
                    return input / 10D;
                case ("deci (dg)"):
                    return input * 10D;
                case ("centi (cg)"):
                    return input * 100D;
                case ("milli (mg)"):
                    return input * 1000D;
                case ("micro (μg)"):
                    return input * 1000000D;
                case ("nano (ng)"):
                    return input * 1000000000D;
                case ("pico/micro micro (pg)"):
                    return input * 1000000000000D;
            }
        }
        
        else if (from.equals("deci (dg)")) {
            switch (to) {
                case ("giga (Gg)"):
                    return input / 10000000000D;
                case ("mega (Mg) / ton"):
                    return input / 10000000D;
                case ("kilo (kg)"):
                    return input / 10000D;
                case ("hecto (hg)"):
                    return input / 1000D;
                case ("deca (dag)"):
                    return input / 100D;
                case ("gram (g)"):
                    return input / 10D;
                case ("centi (cg)"):
                    return input * 10D;
                case ("milli (mg)"):
                    return input * 100D;
                case ("micro (μg)"):
                    return input * 100000D;
                case ("nano (ng)"):
                    return input * 100000000D;
                case ("pico/micro micro (pg)"):
                    return input * 100000000000D;
            }
        }
        
        else if (from.equals("centi (cg)")) {
            switch (to) {
                case ("giga (Gg)"):
                    return input / 100000000000D;
                case ("mega (Mg) / ton"):
                    return input / 100000000D;
                case ("kilo (kg)"):
                    return input / 100000D;
                case ("hecto (hg)"):
                    return input / 10000D;
                case ("deca (dag)"):
                    return input / 1000D;
                case ("gram (g)"):
                    return input / 100D;
                case ("deci (dg)"):
                    return input / 10D;
                case ("milli (mg)"):
                    return input * 10D;
                case ("micro (μg)"):
                    return input * 10000D;
                case ("nano (ng)"):
                    return input * 10000000D;
                case ("pico/micro micro (pg)"):
                    return input * 10000000000D;
            }
        }
        
        else if (from.equals("milli (mg)")) {
            switch (to) {
                case ("giga (Gg)"):
                    return input / 1000000000000D;
                case ("mega (Mg) / ton"):
                    return input / 1000000000D;
                case ("kilo (kg)"):
                    return input / 1000000D;
                case ("hecto (hg)"):
                    return input / 100000D;
                case ("deca (dag)"):
                    return input / 10000D;
                case ("gram (g)"):
                    return input / 1000D;
                case ("deci (dg)"):
                    return input / 100D;
                case ("centi (cg)"):
                    return input / 10D;
                case ("micro (μg)"):
                    return input * 1000D;
                case ("nano (ng)"):
                    return input * 1000000D;
                case ("pico/micro micro (pg)"):
                    return input * 1000000000D;
            }
        }
        
        else if (from.equals("micro (μg)")) {
            switch (to) {
                case ("giga (Gg)"):
                    return input / 1000000000000000D;
                case ("mega (Mg) / ton"):
                    return input / 1000000000000D;
                case ("kilo (kg)"):
                    return input / 1000000000D;
                case ("hecto (hg)"):
                    return input / 100000000D;
                case ("deca (dag)"):
                    return input / 10000000D;
                case ("gram (g)"):
                    return input / 1000000D;
                case ("deci (dg)"):
                    return input / 100000D;
                case ("centi (cg)"):
                    return input / 10000D;
                case ("milli (mg)"):
                    return input / 1000D;
                case ("nano (ng)"):
                    return input * 1000D;
                case ("pico/micro micro (pg)"):
                    return input * 1000000D;
            }
        }
        
        else if (from.equals("nano (ng)")) {
            switch (to) {
                case ("giga (Gg)"):
                    return input / 1000000000000000000D;
                case ("mega (Mg) / ton"):
                    return input / 1000000000000000D;
                case ("kilo (kg)"):
                    return input / 1000000000000D;
                case ("hecto (hg)"):
                    return input / 100000000000D;
                case ("deca (dag)"):
                    return input / 10000000000D;
                case ("gram (g)"):
                    return input / 1000000000D;
                case ("deci (dg)"):
                    return input / 100000000D;
                case ("centi (cg)"):
                    return input / 10000000D;
                case ("milli (mg)"):
                    return input / 1000000D;
                case ("micro (μg)"):
                    return input / 1000D;
                case ("pico/micro micro (pg)"):
                    return input * 1000D;
            }
        }
        
        else if (from.equals("pico/micro micro (pg)")) {
            switch (to) {
                case ("giga (Gg)"):
                    return input / 1000000000000000000000D;
                case ("mega (Mg) / ton"):
                    return input / 1000000000000000000D;
                case ("kilo (kg)"):
                    return input / 1000000000000000D;
                case ("hecto (hg)"):
                    return input / 100000000000000D;
                case ("deca (dag)"):
                    return input / 10000000000000D;
                case ("gram (g)"):
                    return input / 1000000000000D;
                case ("deci (dg)"):
                    return input / 100000000000D;
                case ("centi (cg)"):
                    return input / 10000000000D;
                case ("milli (mg)"):
                    return input / 1000000000D;
                case ("micro (μg)"):
                    return input / 1000000D;
                case ("nano (ng)"):
                    return input / 1000D;
            }
        }
        
        
        
        return 404D;
    }
}
