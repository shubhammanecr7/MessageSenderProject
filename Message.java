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
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your message :");
        String message = sc.nextLine();
        System.out.println("Enter number of times to repeat :");
        int times = sc.nextInt();  
        sc.close();

        System.out.println("Message generating and sending :");
        StringSelection ss = new StringSelection(message);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(ss, null);

        Thread.sleep(2000);

        Robot robot = new Robot();
            for (int i = 0; i < times; i++) {
                robot.keyPress(KeyEvent.VK_CONTROL);
                robot.keyPress(KeyEvent.VK_V);
                robot.keyRelease(KeyEvent.VK_V);
                robot.keyRelease(KeyEvent.VK_CONTROL);
                robot.keyPress(KeyEvent.VK_ENTER);
                robot.keyRelease(KeyEvent.VK_ENTER);
            }

    }

}
