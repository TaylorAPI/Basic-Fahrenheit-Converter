import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.*;
public class GUI implements ActionListener {

    JFrame frame=new JFrame("Fahrenheit Converter");
    JRadioButton K=new JRadioButton("Kelvin");
 //   JRadioButton F=new JRadioButton("Fahrenheit");
    JRadioButton C=new JRadioButton("Celsius");
    JTextField Value = new JTextField();




    GUI() {





    JLabel Title = new JLabel("Fahrenheit ");
    JLabel EnterValue = new JLabel();



    Title.setBounds(10,10,100,100);
    Value.setBounds(90,50,100,20);
    K.setBounds(-5,100,100,30);
   // F.setBounds(-5,140,100,30);
    C.setBounds(-5,140,100,30);

    K.addActionListener(this);
  //  F.addActionListener(this);
    C.addActionListener(this);

    ButtonGroup bg=new ButtonGroup();
    bg.add(K);bg.add(C);
    frame.add(K);frame.add(C);

    frame.add(Title);frame.add(Value);
    frame.setSize(300,250);
    frame.setLayout(null);
    frame.setVisible(true);
    frame.setResizable(false);


}

    @Override
    public void actionPerformed(ActionEvent e) {

        DecimalFormat df = new DecimalFormat("0.###");

        String Convert = Value.getText();
        double Sum = Double.parseDouble(Convert);
        DecimalFormat d = new DecimalFormat("#.####");


        if(e.getSource()== K){




          double Kelvin = (Sum -32) * 5/9 +273.15;





            JTextField Answer = new JTextField(df.format(Kelvin) + "K");
            Answer.setBounds(90,80,100,20);
            Answer.setEditable(false);
            frame.add(Answer);

            System.out.println(df.format(Kelvin) + "K");



        }

        if(e.getSource() == C){

            double Celcius = (Sum - 32) * 5/9;
            JTextField Answer = new JTextField(df.format(Celcius) + "C");
            Answer.setBounds(90,80,100,20);
            Answer.setEditable(false);
            frame.add(Answer);







            System.out.println(df.format(Celcius) + "C");



        }





    }
}
