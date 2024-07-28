package package_1.package_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frame_1 implements ActionListener {
    ImageIcon imageIcon1 ;
    JPanel jPanelHeader;

    JFrame frame;
    JLabel label1;
    JLabel label2;
    JLabel label3;
    JLabel label4 = new JLabel();
    JLabel label5 = new JLabel();
    JLabel label6 = new JLabel();
    JLabel label7 = new JLabel();
    JLabel label8 = new JLabel();
    JLabel label9 = new JLabel();
    JButton button1;
    static JTextField textField1;
    static JTextField textField2;
    static String customerid;
    static String password;
    static String data1;
    static String data2;
    static String data3;
    static String data4;
    static String data5;
    static String data6;
    frame_1() {
        imageIcon1 = new ImageIcon("package_1/logo.png");

        label1 = new JLabel();
        label1.setText("Electricity Billing System");
        label1.setFont(new Font("Comic Sans", Font.BOLD, 30));
        label1.setForeground(Color.WHITE);
        label1.setHorizontalAlignment(JLabel.CENTER);
        label1.setVerticalAlignment(JLabel.CENTER);

        jPanelHeader = new JPanel();
        jPanelHeader.setBounds(0 , 0 , 700, 80);
        jPanelHeader.setBackground(new Color(34, 97, 93));
        jPanelHeader.setLayout(new BorderLayout());

        label2 = new JLabel();
        label2.setText("Enter your Customer id:");
        label2.setBounds(70, 120, 215, 30);
        label2.setFont(new Font("Times New Roman", Font.BOLD, 20));
        label2.setForeground(new Color(34, 97, 93));

        textField1 = new JTextField();
        textField1.setBounds(300, 125, 170, 20);
        textField1.setFont(new Font("Times New Roman", Font.PLAIN, 18));

        label3 = new JLabel();
        label3.setText("Enter your Password:");
        label3.setBounds(70, 165, 200, 30);
        label3.setFont(new Font("Times New Roman", Font.BOLD, 20));
        label3.setForeground(new Color(34, 97, 93));

        textField2 = new JTextField();
        textField2.setBounds(300, 170, 170, 20);
        textField2.setFont(new Font("Times New Roman", Font.PLAIN, 18));


        button1 = new JButton();
        button1.setText("Submit");
        button1.setBounds(250, 230, 90, 20);
        button1.setBackground(Color.red);
        button1.addActionListener(this);
        button1.setFocusable(false);

        frame = new JFrame();
        frame.setSize(700, 700);
        frame.setIconImage(imageIcon1.getImage());
        frame.setTitle("Electricity Billing System.");
        frame.setLocationRelativeTo(null);
        frame.getContentPane().setBackground( new Color(153, 222, 218));
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jPanelHeader.add(label1);
        frame.add(jPanelHeader);
        frame.add(label2);
        frame.add(label3);
        frame.add(textField1);
        frame.add(textField2);
        frame.add(button1);
        frame.setLayout(null);
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        frame_1 obj = new frame_1();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {
            customerid = textField1.getText();
            password = textField2.getText();
            connection_1 obj2 = new connection_1();

            label4.setText("Customer id : " + data1);
            label4.setBounds(180, 350, 400, 30);
            label4.setFont(new Font("Times New Roman", Font.BOLD, 23));
            label4.setForeground(new Color(20, 13, 94));
            frame.add(label4);

            label5.setText("Units Consumed : " + data3);
            label5.setBounds(180, 400, 400, 30);
            label5.setFont(new Font("Times New Roman", Font.BOLD, 23));
            label5.setForeground(new Color(20, 13, 94));
            frame.add(label5);


            label6.setText("Bill Month : " + data4);
            label6.setBounds(180, 450, 400, 30);
            label6.setFont(new Font("Times New Roman", Font.BOLD, 23));
            label6.setForeground(new Color(20, 13, 94));
            frame.add(label6);

            label7.setText("Meter number : " + data5);
            label7.setBounds(180, 500, 400, 30);
            label7.setFont(new Font("Times New Roman", Font.BOLD, 23));
            label7.setForeground(new Color(20, 13, 94));
            frame.add(label7);

            label8.setText("Amount to pay : " + data6);
            label8.setBounds(180, 550, 400, 30);
            label8.setFont(new Font("Times New Roman", Font.BOLD, 23));
            label8.setForeground(new Color(20, 13, 94));
            frame.add(label8);

            label9.setText("---------------------Bill Generated----------------");
            label9.setBounds(70, 300, 500, 30);
            label9.setFont(new Font("Times New Roman", Font.BOLD, 23));
            label9.setForeground(new Color(125, 21, 85));
            frame.add(label9);

        }
    }
}
