import javax.swing.*;
import java.awt.*;
import java.awt.geom.Arc2D;

public class Canopy extends JComponent {
    @Override
    public void paint(Graphics g) {

        int curAngle = 0;

        StringBuilder firstWord = new StringBuilder();
        StringBuilder secondWord = new StringBuilder();
        StringBuilder thirdWord = new StringBuilder();

        String strToPresent = "DARE MIGHTY THINGS";

        char[] chars = strToPresent.toCharArray();

        Character[] strToChars = new Character[strToPresent.length()];

        for (int i = 0; i < strToChars.length; i++)
            strToChars[i] = new Character(chars[i]);



        for(int i = 0; i < 4;i++)
            firstWord.append(strToChars[i].getBinary());
        for(int i = 5; i < 11;i++)
            secondWord.append(strToChars[i].getBinary());
        for(int i = 12; i < strToChars.length;i++)
            thirdWord.append(strToChars[i].getBinary());


        Graphics2D g2 = (Graphics2D) g;



        for(int i = 0; i < thirdWord.length();i++) {
        if (thirdWord.charAt(i) == '1') {
        g2.setPaint(Color.RED);
        } else {
        g2.setPaint(Color.WHITE);
        }
            g2.fill(new Arc2D.Double(50, 50, 300, 300, curAngle, 4.5, Arc2D.PIE));
            g2.setPaint(Color.BLACK);
            g2.draw(new Arc2D.Double(50, 50, 300, 300, curAngle, 4.5, Arc2D.PIE));

            curAngle+=4.5;
        }
        for(int i = thirdWord.length();i<=80;i++){
            g2.setPaint(Color.WHITE);
            g2.fill(new Arc2D.Double(50, 50, 300, 300, curAngle, 4.5, Arc2D.PIE));
            g2.setPaint(Color.BLACK);
            g2.draw(new Arc2D.Double(50, 50, 300, 300, curAngle, 4.5, Arc2D.PIE));
            curAngle+=4.5;
        }
        for(int i = 80;i<=90;i++){
            g2.setPaint(Color.ORANGE);
            g2.fill(new Arc2D.Double(50, 50, 300, 300, curAngle, 4.5, Arc2D.PIE));
            g2.setPaint(Color.BLACK);
            g2.draw(new Arc2D.Double(50, 50, 300, 300, curAngle, 4.5, Arc2D.PIE));
            curAngle+=4.5;
        }


        curAngle=90;
        for(int i = 0; i < secondWord.length();i++) {
            if (secondWord.charAt(i) == '1') {
                g2.setPaint(Color.RED);
            } else {
                g2.setPaint(Color.WHITE);
            }
            g2.fill(new Arc2D.Double(100, 100, 200, 200, curAngle, 4.5, Arc2D.PIE));
            g2.setPaint(Color.BLACK);
            g2.draw(new Arc2D.Double(100, 100, 200, 200, curAngle, 4.5, Arc2D.PIE));

            curAngle+=4.5;
        }
        for(int i = secondWord.length();i<=80;i++){
            g2.setPaint(Color.WHITE);
            g2.fill(new Arc2D.Double(100, 100, 200, 200, curAngle, 4.5, Arc2D.PIE));
            g2.setPaint(Color.BLACK);
            g2.draw(new Arc2D.Double(100, 100, 200, 200, curAngle, 4.5, Arc2D.PIE));
            curAngle+=4.5;
        }
        for(int i = 80;i<=90;i++){
            g2.setPaint(Color.ORANGE);
            g2.fill(new Arc2D.Double(100, 100, 200, 200, curAngle, 4.5, Arc2D.PIE));
            g2.setPaint(Color.BLACK);
            g2.draw(new Arc2D.Double(100, 100, 200, 200, curAngle, 4.5, Arc2D.PIE));
            curAngle+=4.5;
        }


        curAngle=90;
        for(int i = 0; i < firstWord.length();i++) {
            if (firstWord.charAt(i) == '1') {
                g2.setPaint(Color.RED);
            } else {
                g2.setPaint(Color.WHITE);
            }
            g2.fill(new Arc2D.Double(150, 150, 100, 100, curAngle, 4.5, Arc2D.PIE));
            g2.setPaint(Color.BLACK);
            g2.draw(new Arc2D.Double(150, 150, 100, 100, curAngle, 4.5, Arc2D.PIE));

            curAngle+=4.5;
        }
        for(int i = firstWord.length();i<=80;i++){
            g2.setPaint(Color.WHITE);
            g2.fill(new Arc2D.Double(150, 150, 100, 100, curAngle, 4.5, Arc2D.PIE));
            g2.setPaint(Color.BLACK);
            g2.draw(new Arc2D.Double(150, 150, 100, 100, curAngle, 4.5, Arc2D.PIE));
            curAngle+=4.5;
        }
        for(int i = 80;i<=90;i++){
            g2.setPaint(Color.ORANGE);
            g2.fill(new Arc2D.Double(150, 150, 100, 100, curAngle, 4.5, Arc2D.PIE));
            g2.setPaint(Color.BLACK);
            g2.draw(new Arc2D.Double(150, 150, 100, 100, curAngle, 4.5, Arc2D.PIE));
            curAngle+=4.5;
        }



    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("Canopy Representation Andoniev Bogdan");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.getContentPane().add(new Canopy());
        frame.pack();
        frame.setSize(new Dimension(420, 450));
        frame.setVisible(true);

        //Output of the phrase
        String strToPresent = "DARE MIGHTY THINGS";
        char[] chars = strToPresent.toCharArray();


        Character[] strToChars = new Character[strToPresent.length()];

        for (int i = 0; i < strToChars.length; i++)
            strToChars[i] = new Character(chars[i]);

        for (Character stc : strToChars) {
            System.out.print(stc.getBinary() + " ");
        }
        System.out.println();
        for (Character stc : strToChars) {
            if (stc.getIndex() != -32)
                System.out.print(stc.getIndex() + " ");
        }
        System.out.println();
        for (Character stc : strToChars) {
            System.out.print(stc.getLetter());
        }




    }
}
