import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUI {
    public static void InitGUI(){
        int WINDOWHEIGHT = 500;
        int WINDOWWITDH = 600;

        int width = 20;
        int height = 40;

        for(int i =0; i< 600; i++){
            width++;
            height++;
        }

        

        JFrame frame = new JFrame("Java Search Engine");
        JPanel panel = new JPanel();


        frame.setSize(WINDOWWITDH, WINDOWHEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField SearchBox = new JTextField(50);
        //SearchBox.setBounds(400, 500, 10, 40);
        //SearchBox.setSize(100, 40);
        SearchBox.setPreferredSize(new Dimension(50, 40));

        //This must be at the end, if not, the program will not render correctly
        panel.add(SearchBox, BorderLayout.SOUTH);
        frame.add(panel);
        frame.setVisible(true);
    }
}
