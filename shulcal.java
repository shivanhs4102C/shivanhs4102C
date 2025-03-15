import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class shulcal implements ActionListener
{
    JFrame Fra;
    JTextField F1;
    JButton [] funbutton = new JButton[7];
    JButton addButton, subButton, mulButton, divButton;
    JButton equButton, clrButton, delButton;
    JPanel P1;

    double num1=0 , num2=0 , result=0;
    char operator;
    shulcal()
    {
        Fra = new JFrame("Calculator");
        Fra.setSize(400,500);
        Fra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Fra.setLayout(null);
        Fra.setResizable(false);

        F1=new JTextField();
        F1.setBounds(40, 10, 300, 50);
        F1.setEditable(true);

        addButton=new JButton("+");
        subButton=new JButton("-");
        mulButton=new JButton("*");
        divButton=new JButton("/");
        equButton=new JButton("=");
        clrButton=new JButton("Clr");
        delButton=new JButton("Del");
        

        funbutton[0]=addButton;
        funbutton[1]=subButton;
        funbutton[2]=mulButton;
        funbutton[3]=divButton;
        funbutton[4]=equButton;
        funbutton[5]=delButton;
        funbutton[6]=clrButton;

        for(int i=0;i<7;i++){
            funbutton[i].setFocusable(false);
            funbutton[i].addActionListener(this);
        }

        clrButton.setBounds(140,380 ,145 ,50 );


        P1=new JPanel();
        P1.setBounds(50, 100, 300, 250);
        P1.setLayout(new GridLayout(3,2,30,30));

        
        P1.add(addButton);
        P1.add(subButton);
        P1.add(mulButton);
        P1.add(equButton);
        P1.add(divButton);
        P1.add(delButton);

        Fra.add(clrButton);
        Fra.add(F1);
        Fra.add(P1);
        Fra.setVisible(true);
    }


    public static void main(String[] args) {
        shulcal sul=new shulcal();
    }


    
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==addButton)
        {
            num1=Double.parseDouble(F1.getText());
            F1.setText("");
            operator='+';
        }
        if(e.getSource()==subButton)
        {
            num1=Double.parseDouble(F1.getText());
            F1.setText("");
            operator='-';
        }
        if(e.getSource()==mulButton)
        {
            num1=Double.parseDouble(F1.getText());
            F1.setText("");
            operator='*';
        }
        if(e.getSource()==divButton)
        {
            num1=Double.parseDouble(F1.getText());
            F1.setText("");
            operator='/';
        }
        if(e.getSource()==equButton)
        {
            num2=Double.parseDouble(F1.getText());

            switch(operator){
                case '+':
                result=num1+num2;
                break;
                case '*':
                result=num1*num2;
                break;
                case '-':
                result=num1-num2; 
                break;
                case '/':
                result=num1/num2;
                break;
            }
            F1.setText(String.valueOf(result));
            num1=result;
        }
        if(e.getSource()==clrButton)
        {
            F1.setText("");
        }
        if(e.getSource()==delButton){
            StringBuilder sb=new StringBuilder(F1.getText());
            sb.deleteCharAt(sb.length()-1);
            F1.setText(sb.toString());
        }
    }
}
