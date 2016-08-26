package name.skylarismy;

import javax.swing.JOptionPane;

/**
 *
 * @author skylar
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Hello world");
    }

    public static int getRandomNumber() {
        return 4; // Chosen by fair dice roll.
                  // Guaranteed to be random.
    }

}
