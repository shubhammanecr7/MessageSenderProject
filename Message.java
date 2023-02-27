// Import necessary classes and packages
package MessageSender;

import java.util.Scanner;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Clipboard;
import java.awt.Toolkit;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class Message {
    public static void main(String[] args) throws AWTException, InterruptedException {
        // Create a scanner object to read user input from the console
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a message
        System.out.println("Enter your message :");
        String message = sc.nextLine();

        // Prompt the user to enter the number of times to repeat the message
        System.out.println("Enter number of times to repeat :");
        int times = sc.nextInt();  

        // Close the scanner object to avoid resource leak
        sc.close();

        // Display a message indicating that the program is generating and sending the message
        System.out.println("Message generating and sending :");

        // Copy the message to the system clipboard
        StringSelection ss = new StringSelection(message);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(ss, null);

        // Wait for 2 seconds before pasting the message
        Thread.sleep(2000);

        // Create a robot object to simulate keyboard input
        Robot robot = new Robot();

        // Loop for the specified number of times to repeat the message
        for (int i = 0; i < times; i++) {
            // Press and release the Ctrl+V keys to paste the message
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);

            // Press and release the Enter key to send the message
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
        }
    }
}
                                                                                          //Made with enthusiasm by Shubham Mane CR7.
