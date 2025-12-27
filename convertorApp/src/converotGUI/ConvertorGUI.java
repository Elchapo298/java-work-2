/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package converotGUI;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/*
 *
 * @author Wandi Mtshali
 */
public class ConvertorGUI extends JFrame{
    
    private JPanel mainPanel,displayPanal,buttonPanel,headingPanel;
    private JLabel inputLabel, centimeterLabel,milimetersLabel;
    private JButton centimeterButton,millimiterButton,clearButton;
    private JTextArea displayArea;
    private JTextField inputField;

    public ConvertorGUI() throws IOException {
        
        setTitle("Convetor APP");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(350,350);
        
        
        mainPanel = new JPanel( new FlowLayout(FlowLayout.CENTER)  );
        inputField = new JTextField(15);
        inputLabel = new JLabel("INPUT VALUE: ");
        
        mainPanel.add(inputLabel);
        mainPanel.add(inputField);
        
        headingPanel = new JPanel(new GridLayout(2,1,1,1));
        
        
        
        buttonPanel = new JPanel(new FlowLayout());
        centimeterButton = new JButton("centimeters");
        centimeterButton.addActionListener(new centimeter());
        millimiterButton = new JButton("millimeters");
        millimiterButton.addActionListener(new millimeters());
        clearButton = new JButton("Clear");
        clearButton.addActionListener(new clear());
        
        buttonPanel.add(centimeterButton);
        buttonPanel.add(millimiterButton);
        buttonPanel.add(clearButton);
        
       headingPanel.add(mainPanel);
        headingPanel.add(buttonPanel);
        
        add(headingPanel, BorderLayout.NORTH);
        
        displayPanal = new JPanel(new BorderLayout());
        displayArea = new JTextArea(10,10);
        displayPanal.add(displayArea);
        
        
        
        
        
        File file = new File("file.txt");
        String line = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            while ((line = br.readLine())!=null) {                
                
            }
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ConvertorGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
        add(displayPanal, BorderLayout.CENTER);
        

        
        
        setVisible(true);
        
        
        
    }private class clear implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
           
            displayArea.setText("");
            inputField.setText("");

            
        }
    
    }private class centimeter implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
          
                int centi = Integer.parseInt(inputField.getText());
                double sum = centi/10;
                displayArea.setText("from millimeters to centimeters :"+ sum+" CM");
        
        }
    
    
    
    }private class millimeters implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
          
                int centi = Integer.parseInt(inputField.getText());
                double sum = centi*10;
                displayArea.setText("From Centimeters to Millimeters :"+ sum+" mm");
        
        }
    
    
    
    }
    
    
}
