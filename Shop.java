import javax.swing.*;

public class Shop {
    public static void main(String [] args) {
        JCheckBox c1=new JCheckBox("Salad PKR 250"),
                c2=new JCheckBox("Fruit salad PKR 400");
        JButton b = new JButton("Pay");
        b.addActionListener(e -> JOptionPane.showMessageDialog(null,"Total PKR "+((c1.isSelected()?250:0)+(c2.isSelected()?400:0))));
        JOptionPane.showMessageDialog(null,new Object[]{c1,c2,b},"Fruit Shop",1);

    }
}
