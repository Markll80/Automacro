// import java.awt.*;
// import java.util.*;
import java.awt.event.*;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Component;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.lang.Thread;

public class Automacro {
  public static void main(String[] args) throws Exception {
    Robot bot = new Robot();
    int mask = InputEvent.BUTTON1_MASK;
    Thread.sleep(10000);
    while(true) {
      bot.mousePress(mask);
      Thread.sleep(200);
      bot.mouseRelease(mask);
      Thread.sleep(2000);
      bot.keyPress(KeyEvent.VK_4);
      bot.keyRelease(KeyEvent.VK_4);
      Thread.sleep(35000);
    }
  }
}
