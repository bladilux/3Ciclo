
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author FelipeMedel
 */
public class correo {

    public static void main(String[] args) {
        
        String email;
        
         
         
        email=JOptionPane.showInputDialog("ingrese su corrreo");
        

        // Patrón para validar el email
        Pattern pattern = Pattern
                .compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

      
       

        Matcher mather = pattern.matcher(email);

        if (mather.find() == true) {
            JOptionPane.showMessageDialog(null, "email valido");
      
        } else {
    JOptionPane.showMessageDialog(null, "email invalido");
        }
    }
}