/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractperson;

/**
 *
 * @author lab_services_student
 */
public class Programmer extends Employee implements Setters{
    
    private int hours;
    private double rate;
    
    public Programmer (String n, String s, int hrs, double r){
        super (n,s);
        hours=hrs;
        rate=r;
    }
    
    @Override
    public void setHours(int h){
        hours=h;
    
}
    @Override
       public void setRate(double r){
       rate=r;
    
}
    @Override
    public double calcPay(){
        return hours * rate;
    }
    
    @Override
    public String toString(){
        return super.toString()+"\t"+hours+"\t"+rate+"\t"+calcPay();
    }
    
    
   
}

