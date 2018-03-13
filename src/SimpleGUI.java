import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGUI extends JFrame{

    private JButton button = new JButton("Press This !");
    private JTextField inpt = new JTextField("",5);
    private JLabel label = new JLabel("Input");
    private JRadioButton radio1 = new JRadioButton("Select this");
    private JRadioButton radio2 = new JRadioButton("Or this");
    private JCheckBox check = new JCheckBox("Check this", false);


    public SimpleGUI() {
        super("Simple Example");
        this.setBounds(100,100,500,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3,2,2,2));
        container.add(label);
        container.add(inpt);

        ButtonGroup goup = new ButtonGroup();
        goup.add(radio1);
        goup.add(radio2);
        container.add(radio1);
        radio1.setSelected(true);
        container.add(radio2);
        container.add(check);
        button.addActionListener(new ButtonEventListener ());
        container.add(button);
    }

    class ButtonEventListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String messege = "";
//            messege += "Was Tested\n";
            messege += "Test is " + inpt.getText() + "\n";
            messege += (radio1.isSelected()? "Radio #1" : "Radion#2" + " is selected \n");
            messege += "Checkbox is " + ((check.isSelected()) ? "cheked":"unchecked" );
            JOptionPane.showMessageDialog(null, messege,"Output", JOptionPane.PLAIN_MESSAGE);

        }
    }
}
