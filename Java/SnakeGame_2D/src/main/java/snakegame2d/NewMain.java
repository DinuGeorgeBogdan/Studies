
package snakegame2d;


public class NewMain {

    
    public static void main(String[] args) {
        JFrame jframe=new JFrame("Snake Game"); 

GamePlay gameplay=new GamePlay(); 

 jframe.setBounds(10,10,900,700); 

 jframe.setBackground(Color.DARK_GRAY); 

 jframe.setResizable(false); 

jframe.setVisible(true); 

jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

jframe.add(gameplay); 
    }
    
}
