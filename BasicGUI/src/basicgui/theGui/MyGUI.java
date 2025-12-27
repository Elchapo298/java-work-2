/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basicgui.theGui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Wandi Mtshali
 */
public class MyGUI extends JFrame {
    
    private JPanel inputPanel, diplayPanel, buttonPanel;
    private JTextArea displayArea;
    private JLabel nameLabel, surnameLabel, emailLabel;
    private JButton saveButton, deleteButton, loadToFileButton, readToFileButton;
    private JTextField nameField, surnameField, emailField;
    private JMenuBar menu ;
    private JMenu fileMenu,aboutMenu;
    private JMenuItem infoMenuItem, saveMenuItem,contactMenuItem;

    
    public MyGUI() {
        
        setTitle("Calaculator");
        setSize(400, 450);
        setDefaultLookAndFeelDecorated(true);
        setResizable(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setForeground(Color.ORANGE);

         menu = new JMenuBar();
        
        aboutMenu = new JMenu("about");
        infoMenuItem = new JMenuItem("info");
        
        fileMenu = new JMenu("File");
        saveMenuItem = new JMenuItem("save");
        contactMenuItem = new JMenuItem("contact");
        
        fileMenu.add(saveMenuItem);
        fileMenu.add(contactMenuItem);
        
        aboutMenu.add(infoMenuItem);
        
        menu.add(fileMenu);
        menu.add(aboutMenu);
        
        setJMenuBar(menu);
        
        //add(menu);
        //input
        inputPanel = new JPanel(new GridLayout(3, 2, 10, 5));
        nameLabel = new JLabel("Name:  ");
        nameField = new JTextField(10);
        
        surnameLabel = new JLabel("Surname: ");
        surnameField = new JTextField(10);
        
        emailLabel = new JLabel("Email: ");
        emailField = new JTextField(20);
        
        inputPanel.add(nameLabel);
        inputPanel.add(nameField);
        inputPanel.add(surnameLabel);
        inputPanel.add(surnameField);
        inputPanel.add(emailLabel);
        inputPanel.add(emailField);
        
        add(inputPanel, BorderLayout.NORTH);
        
        diplayPanel = new JPanel(new BorderLayout());
        displayArea = new JTextArea(10, 10);
        displayArea.setBorder(new TitledBorder(new LineBorder(Color.YELLOW, 4), "Display"));
        diplayPanel.add(displayArea);
        add(diplayPanel, BorderLayout.CENTER);

        //button
        buttonPanel = new JPanel(new FlowLayout());
        saveButton = new JButton("OK");
        saveButton.addActionListener(new saveAction());
        
        deleteButton = new JButton("Clear");
        deleteButton.addActionListener(new clearAction());
        buttonPanel.add(saveButton);
        
        loadToFileButton = new JButton("Save");
        loadToFileButton.addActionListener(new saveToFile());
        readToFileButton = new JButton("Load");
        readToFileButton.addActionListener(new readFile());
        
        buttonPanel.add(loadToFileButton);
        buttonPanel.add(readToFileButton);
        
        buttonPanel.add(deleteButton);
        add(buttonPanel, BorderLayout.SOUTH);
        //menu Bar
       
        
        
        
        
        
        
        setVisible(true);
        
    }
    
    private class saveAction implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent e) {
            
            displayArea.setText("Name :" + nameField.getText() + " Surname " + surnameField.getText() + " Email: " + emailField.getText());
            
        }
        
    }
    
    private class clearAction implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent e) {
            
            displayArea.setText("");
            nameField.setText("");
            surnameField.setText("");
            emailField.setText("");
            
        }
        
    }
    
    private class saveToFile implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent e) {
            
            File myFile = new File("C:\\Users\\Wandi Mtshali\\Desktop/myFile.txt");
            String message = nameField.getText() + "|" + surnameField.getText() + "|" + emailField.getText()+"\n";
            
            try {
                BufferedWriter bw = new BufferedWriter(new FileWriter(myFile,true));
                bw.write(message);
                bw.close();
                JOptionPane.showMessageDialog(null, "info, saved thank you " + nameField.getText().toLowerCase());
                
            } catch (IOException ex) {
                
                JOptionPane.showMessageDialog(null, "File not found!!!");
                
            }
            
        }
        
    }

    private class readFile implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent e) {
            File myFile = new File("C:\\Users\\Wandi Mtshali\\Desktop/myFile.txt");
            
            try {
                BufferedReader br = new BufferedReader(new FileReader(myFile));
                
                displayArea.setText("");
                
                String line = "";
                String newLine = "";
                while ((line = br.readLine()) != null) { 
                    newLine+=line+"\n";
                    
                    displayArea.setText(newLine);
                }
                
            } catch (FileNotFoundException ex) {
                
                JOptionPane.showMessageDialog(null,"file not found");
                
            } catch (IOException ex) {
                Logger.getLogger(MyGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
    }
}
