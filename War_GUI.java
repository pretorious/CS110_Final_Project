import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class War_GUI extends JFrame
{
   public War_GUI()
   {
      //Set background color
      getContentPane().setBackground(Color.GREEN);
      
      //Set title
      setTitle("War");
      
      //Set layout
      setLayout(new BorderLayout(400,200));
      
      //Set exit
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      //Create panels
      JPanel north = new JPanel();
      JPanel south = new JPanel();
      JPanel east = new JPanel();
      JPanel west = new JPanel();
      JPanel center = new JPanel();
      
      //Create the titel label
      JLabel title = new JLabel("War");
      title.setFont(new Font("Serif", Font.BOLD, 50));
      north.setBackground(Color.GRAY);
      
      //Names
      JLabel player1 = new JLabel("Player 1");
      JLabel player2 = new JLabel("Player 2");

      //pack and display the window
      pack();
      
      setVisible(true);
   }
}