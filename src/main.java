import javax.swing.*;
import java.awt.*;

public class main {
    public static void main(String[] args){
        calcSwing calcSwing = new calcSwing();
        calcSwing.setVisible(true);
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(100, 100, 100, 100);
        calcSwing.setLayout(null);
        calcSwing.add(scrollPane);
        JTextArea textArea = new JTextArea();
        textArea.setText ( "frikfrikfrikfrik");
        scrollPane.setViewportView(textArea);

    }
}
