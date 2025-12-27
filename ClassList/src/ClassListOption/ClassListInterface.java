/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassListOption;

/**
 *
 * @author Wandi Mtshali
 */
public class ClassListInterface {
 
    private int ID;
    private String NAME;
    private String SURNAME;
    private int STUDENT_NUMBER;

    public ClassListInterface(int ID, String NAME, String SURNAME, int STUDENT_NUMBER) {
        this.ID = ID;
        this.NAME = NAME;
        this.SURNAME = SURNAME;
        this.STUDENT_NUMBER = STUDENT_NUMBER;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public String getSURNAME() {
        return SURNAME;
    }

    public void setSURNAME(String SURNAME) {
        this.SURNAME = SURNAME;
    }

    public int getSTUDENT_NUMBER() {
        return STUDENT_NUMBER;
    }

    public void setSTUDENT_NUMBER(int STUDENT_NUMBER) {
        this.STUDENT_NUMBER = STUDENT_NUMBER;
    }

    @Override
    public String toString() {
        return super.toString(); 
    }
    
    
    
    
    
}
