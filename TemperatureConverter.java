import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class TemperatureConverter
{
    public static JFrame frmMain;
    public static JLabel lblCelsius;
    public static JTextField textCelsius;
    public static JLabel lblFahrenheit;
    public static JTextField textFahrenheit;
    public static JButton btnCalculateCtoF;
    public static JButton btnCalculateFtoC;
    
    public static void main(String[] args)
    {
        frmMain = new JFrame("Temperature Converter");
        frmMain.setSize(400,  500);  
        frmMain.setLayout(new FlowLayout());
    
        lblCelsius = new JLabel("Celsius:");
        textCelsius = new JTextField(10);
        lblFahrenheit = new JLabel("Fahrenheit:");
        textFahrenheit = new JTextField(10);
        btnCalculateCtoF = new JButton("Convert C to F");
        btnCalculateCtoF.addActionListener
        (
            new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    
                    String cText = textCelsius.getText();
                    double c = Double.parseDouble(cText);
                    double f = (c * 9 / 5) + 32;
                    textFahrenheit.setText(String.valueOf(f));
                }
            }
        );
        
        btnCalculateFtoC = new JButton("Convert F to C");
        
        btnCalculateFtoC.addActionListener
        (
            new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    // Convert F to C
                    String fText = textFahrenheit.getText();
                    double f = Double.parseDouble(fText);
                    double c = (f - 32) * 5 / 9;
                    textCelsius.setText(String.valueOf(c)); 
                }
            }
        );
    
        frmMain.add(lblCelsius);
        frmMain.add(textCelsius);
        frmMain.add(lblFahrenheit);
        frmMain.add(textFahrenheit);
        frmMain.add(btnCalculateCtoF);
        frmMain.add(btnCalculateFtoC);
        
        frmMain.setVisible(true);
    }
}
