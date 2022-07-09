package auto;

import java.awt.AWTException;
import java.awt.BorderLayout;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Diep Esc
 */
public class MyRobot extends Robot {

    public MyRobot() throws AWTException {
       
    }

    public MyRobot(GraphicsDevice graphicsDevice) throws AWTException {
        super(graphicsDevice);
    }

    public void click() {
        mousePress(MouseEvent.BUTTON1_MASK);
        mouseRelease(MouseEvent.BUTTON1_MASK);
    }

    public void rightClick() {
        mousePress(MouseEvent.BUTTON3_MASK);
        mouseRelease(MouseEvent.BUTTON3_MASK);
    }

    public void doubleClick() {
        click();
        click();
    }

    public void clickAt(int x, int y) {
        Point oldLocation = MouseInfo.getPointerInfo().getLocation();
        mouseMove(x, y);
        click();
        mouseMove(oldLocation.x, oldLocation.y);
    }

    public void keyType(int keyCode) {
        keyPress(keyCode);
        keyRelease(keyCode);
    }

    public void textType(String text) {
        int length = text.length();
        for (int i = 0; i < length; i++) {
            char c = text.charAt(i);
            int keyCode = getKeyCodeForTyping(c);
            if (KeyEvent.CHAR_UNDEFINED == keyCode) {
                throw new RuntimeException(
                        "Key code not found for character '" + c + "'");
            }
            if (isShiftRequired(c)) {
                keyCombine(KeyEvent.VK_SHIFT, () -> keyType(keyCode));
            } else {
                keyType(keyCode);
            }
        }
    }

    private static final String specialKeyChars = "~!@#$%^&*()_+{}:\"<>?";
    private static final String specialKeyCharReplacements = "`1234567890-=[]\\;',./";

    private int getKeyCodeForTyping(char c) {
        int i = specialKeyChars.indexOf(c);
        if (i >= 0) {
            c = specialKeyCharReplacements.charAt(i);
        }
        int keyCode = KeyEvent.getExtendedKeyCodeForChar(c);
        return keyCode;
    }

    private boolean isShiftRequired(char c) {
        if (specialKeyChars.indexOf(c) >= 0) {
            return true;
        } else if (c >= 'a' && c <= 'z') {
            return Toolkit.getDefaultToolkit().getLockingKeyState(KeyEvent.VK_CAPS_LOCK);
        } else if (c >= 'A' && c <= 'Z') {
            return !Toolkit.getDefaultToolkit().getLockingKeyState(KeyEvent.VK_CAPS_LOCK);
        }
        return false;
    }

    @FunctionalInterface
    public interface KeyAction {

        void doAction();
    }

    public void keyCombine(int keyCode, KeyAction action) {
        keyPress(keyCode);
        action.doAction();
        keyRelease(keyCode);
    }

    public void textPaste(String text) {
        StringSelection stringSelection = new StringSelection(text);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, stringSelection);
        keyCombine(KeyEvent.VK_CONTROL, () -> keyType(KeyEvent.VK_V));
    }

    public BufferedImage fullScreenCapture() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        return createScreenCapture(new Rectangle(screenSize));
    }

    public BufferedImage allScreenCapture() {
        Rectangle allscreenBounds = new Rectangle(0, 0, 0, 0);
        for (GraphicsDevice gd : GraphicsEnvironment
                .getLocalGraphicsEnvironment().getScreenDevices()) {
            allscreenBounds = allscreenBounds
                    .union(gd.getDefaultConfiguration().getBounds());
        }
        return createScreenCapture(allscreenBounds);
    }

    public int getPixel(int x, int y) {
        BufferedImage image = createScreenCapture(new Rectangle(x, y, 1, 1));
        return image.getRGB(0, 0);
    }

    public void showSimpleColorPicker() {

        JFrame frame = new JFrame();

        final JLabel label = new JLabel("color");
        label.setOpaque(true);
        frame.add(label, BorderLayout.SOUTH);

        JButton button = new JButton("Drag me");
        button.addMouseMotionListener(new MouseAdapter() {

            @Override
            public void mouseDragged(MouseEvent me) {
                Point location = MouseInfo.getPointerInfo().getLocation();
                int rgb = getPixel(location.x, location.y);
                Color color = new Color(rgb);
                label.setBackground(color);
                int r = color.getRed();
                int g = color.getGreen();
                int b = color.getBlue();
                label.setText("Color at ("
                        + location.x + ","
                        + location.y + ") is {r="
                        + r + ",g="
                        + g + ",b="
                        + b + "}");
//                Determine if a color is bright or dark
                double hsp = Math.sqrt(0.299 * r * r
                        + 0.587 * g * g
                        + 0.114 * b * b);
                label.setForeground(hsp > 127.5 ? Color.BLACK : Color.WHITE);
            }
        });
        frame.add(button, BorderLayout.CENTER);

        frame.setSize(300, 100);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        try {
            MyRobot robot = new MyRobot();
            robot.showSimpleColorPicker();
        } catch (AWTException ex) {
            ex.printStackTrace();
        }

    }
}