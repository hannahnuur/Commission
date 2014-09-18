/*
 *Hannah Nuur
 *9-22-2014
 *COMP 2243 Programming and Problem Solving
 *Assignment #3 Commission.java
 *Uses user input to calculate commission
 *using JOptionPane dialog boxes.
 */

 import javax.swing.JOptionPane;
 
 public class CommissionJOP{
  
  public static void main (String[] args){
  
    String transactionStr, outputStr;  
    double transaction, commission;
    
    transactionStr = JOptionPane.showInputDialog("Enter transaction amount.");
    transaction = Double.parseDouble(transactionStr);
    
    //validating transaction amount
    if (transaction <= 0){
      outputStr = ("Invalid input");
      JOptionPane.showMessageDialog(null, outputStr, "Invalid input", JOptionPane.WARNING_MESSAGE);
    }
    
    else {
    if (transaction <3000)         
      commission = 25+transaction*.015;           
    else if (transaction <6500)   
      commission = 50+transaction*0.0065;     
    else if (transaction <40000)   
      commission = 70+transaction*0.003;     
    else if (transaction <100000)   
      commission = 100+transaction*0.002;     
    else if (transaction <500000)   
      commission = 150+transaction*0.0011;     
    else
      commission = 250+transaction*0.0009;
         
    //Makes sure commission is not less than $40.00   
    if (commission < 40.)  
      commission = 40.;
    
    outputStr = String.format("Amount of commission earned is $%.2f", commission);
    
    JOptionPane.showMessageDialog(null, outputStr, "Commission", JOptionPane.INFORMATION_MESSAGE);
    }
    
    System.exit(0);
    }   
 }