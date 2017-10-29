package converter;

import javax.swing.JOptionPane;

public class Calculator {
    
    public double handleInput(String from, String to, double input) {
        
        if(from.equals(to)) {
            JOptionPane.showMessageDialog(null, "Please pick two different units");
        }
        
        
        double output = 0;
        return output;
    }
}
