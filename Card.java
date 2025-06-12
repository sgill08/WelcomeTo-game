import javax.swing.*;
import java.awt.Image;

public class Card {
    private String name;
    private int number = 0;

    public Card(String name, int number) {
        this.number = number;
        this.name = name;
    }

    public ImageIcon getImage() {
        return new ImageIcon(new ImageIcon("Welcome To/Welcome To/" + number + "_" + name).getImage().getScaledInstance(WelcomeTo.CARDBACK_SIZE_X, WelcomeTo.CARDBACK_SIZE_Y, Image.SCALE_SMOOTH));
    }
    public String getName()
    {
        return name;
    }
    public int getNum()
    {
        return number;
    }
}
