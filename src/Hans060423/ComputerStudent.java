/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hans060423;

/**
 *
 * @author ACER
 */
import Hans010423.StudentRecord;
public class ComputerStudent extends StudentRecord {
    private double compGrade;
    public ComputerStudent(String ali){
        super("Ali", "Padang");
        System.out.println("Inside ComputerStudent Constructor");
    }
    
    public double getCompGrade(){
        return compGrade;
    }
    public void setCompGrade(double cGrade){
        this.compGrade = cGrade;
    }
    @Override
    public double getAverage(){
        return (getMathGrade() + getEnglishGrade() + getScienceGrade() +getCompGrade())/4;
    }
}