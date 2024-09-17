 

 public class GamePlay extends JPanel{ 

    private ImageIcon titleimage; 

    public GamePlay(){} 

     

  

    public void paint(Graphics g){ 

        //draw title image border  

        g.setColor(Color.WHITE); 

        g.drawRect(25, 10, 850, 55); 

        g.setColor(Color.green); 

        g.fillRect(26, 11, 849, 54); 

        //draw title image 

        titleimage=new ImageIcon("C:\\Users\\x\\Downloads\\OneDrive_1_20.01.2022"); 

        titleimage.paintIcon(this, g, 375, 12); 

        //draw border play area 

        g.setColor(Color.WHITE); 

        g.drawRect(24, 74,851,576); 

        //draw background play area 

        g.setColor(Color.black); 

        g.fillRect(25, 75, 850, 575);//dimensiunile dreptunghiului umplut multipli de 25 

    } 

     

} 

