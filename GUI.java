import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUI {
    public static void InitGUI(){
        int WINDOWHEIGHT = 500;
        int WINDOWWITDH = 600;


        JFrame frame = new JFrame("Java Search Engine", null);
        JPanel panel = new JPanel();


        frame.setSize(WINDOWWITDH, WINDOWHEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        JTextField SearchBox = new JTextField(10);
        //SearchBox.setBounds(400, 500, 10, 40);
        //SearchBox.setSize(100, 40);
        SearchBox.setLocation(100, 200);
        panel.add(SearchBox);

        //This must be at the end, if not, the program will not render correctly
        frame.setVisible(true);
    }
}
