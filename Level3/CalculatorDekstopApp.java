'''
Develop a calculator using
Swing. '''
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;

class SetCalculator extends JFrame implements ActionListener{
 JLabel label1, label2, label3;

 JButton buttonAdd, buttonSubtract, buttonMultiply, buttonClear;
 JTextField textField1, textField2, textField3;
 
 public SetCalculator(){
  setLayout(new GridLayout(5,2));
  setTitle("Simple Calculator using Swings");
 
  label1 = new JLabel("Enter Number 1 :",JLabel.LEFT);
  label2 = new JLabel("Enter Number 2 :",JLabel.LEFT);
  label3 = new JLabel("Result :",JLabel.LEFT);
  
  buttonAdd = new JButton("Add");
  buttonSubtract = new JButton("Subtract");
  buttonMultiply = new JButton("Multiply");
  buttonClear = new JButton("Clear");
  
  buttonAdd.addActionListener(this);
  buttonSubtract.addActionListener(this);
  buttonMultiply.addActionListener(this);
  buttonClear.addActionListener(this);
 
   textField1 = new JTextField();
   textField2 = new JTextField();
   textField3 = new JTextField();
   
  add(label1,0);
  add(textField1);
  add(label2);
  add(textField2);
  add(label3);
  add(textField3);
  add(buttonAdd);
  add(buttonSubtract);
  add(buttonMultiply);
  add(buttonClear);
 }
 
 
  public void actionPerformed(ActionEvent event){
  String option = event.getActionCommand();
  int num1, num2, num = 0;
  num1 = Integer.parseInt(textField1.getText());
  num2 = Integer.parseInt(textField2.getText());
  
  
   if(option.equals("Add"))
    num = num1 + num2;
   else if(option.equals("Subtract"))
    num = num1 - num2;
   else if(option.equals("Multiply"))
    num = num1 * num2;
   else if(option.equals("Clear")){
    textField1.setText("");
    textField2.setText("");
    textField3.setText("");
   }
   textField3.setText(Integer.toString(num));
  
 }
}

public class CalculatorDekstopApp {
 public static void main(String args[]){
  SetCalculator demo = new SetCalculator();
  demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  demo.setVisible(true);
  demo.setSize(300,500);
 }
}