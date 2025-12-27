/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CrechGUI;

import Students.Students;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author Wandi Mtshali
 */
public class CrecheGUI extends JFrame {

    private JLabel nameLabel, genderLabel;
    private JButton registerButton, displayButton;
    private JPanel inputPanel, displayPanel, namePanel, genderPanel, buttonPanel;
    private JRadioButton maleRadioButton, femaleRadioButton;
    private JTextField nameField;
    private JTextArea displayArea;
    private JScrollPane scrollPane;
    ArrayList<Students> arrayList = new ArrayList();

    public CrecheGUI() {
        setTitle("CRECHE 4 YOUR KIDDIE");
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        inputPanel = new JPanel(new GridLayout(3, 1));

        nameLabel = new JLabel("Name: ");
        nameField = new JTextField(10);

        namePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        namePanel.add(nameLabel);
        namePanel.add(nameField);
        inputPanel.add(namePanel);

        genderLabel = new JLabel("Gender: ");
        maleRadioButton = new JRadioButton("Male");
        femaleRadioButton = new JRadioButton("Female");

        genderPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        genderPanel.add(genderLabel);
        genderPanel.add(maleRadioButton);
        genderPanel.add(femaleRadioButton);
        ButtonGroup bg = new ButtonGroup();
        bg.add(maleRadioButton);
        bg.add(femaleRadioButton);

        inputPanel.add(genderPanel);

        buttonPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        registerButton = new JButton("Register Kiddie");
        displayButton = new JButton("Display Kiddies");
        displayButton.addActionListener(new displayKids());

        registerButton.addActionListener(new register());

        buttonPanel.add(registerButton);
        buttonPanel.add(displayButton);

        inputPanel.add(buttonPanel);
        add(inputPanel, BorderLayout.NORTH);

        displayPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        displayArea = new JTextArea(25, 25);
        scrollPane = new JScrollPane(displayArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        displayPanel.add(scrollPane);

        //displayPanel.add(displayArea);
        add(displayPanel, BorderLayout.SOUTH);

        setVisible(true);

    }

    private class register implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            String name = nameField.getText();
            String genderSelected = "";

            if (maleRadioButton.isSelected()) {

                genderSelected = "Male";

            } else if (femaleRadioButton.isSelected()) {

                genderSelected = "Female";
            }

            arrayList.add(new Students(name, genderSelected));
            JOptionPane.showMessageDialog(null, name + " was Registed !");
            nameField.setText("");
            maleRadioButton.setSelected(false);
            femaleRadioButton.setSelected(false);
            displayArea.setText("");

        }

        

    }private class displayKids implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent e) {

                String list = "Name  \tGender\n";
                for (Students students : arrayList) {

                    list += students.getName() + "\t" + students.getGender() + "\n";

                }

                displayArea.setText(list);

            }

        }
}
