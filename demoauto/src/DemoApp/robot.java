
package auto;
 

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Window;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Objects;
import java.util.Stack;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import static javax.swing.SwingUtilities.invokeLater;
 
/**
 *
 * @author Diep Esc
 */
public class robot {
 
    public static void main(String[] args) {
        robot.main(args);
 
        delay(1000);
        JButton clickMe = findButtonByText("Click me");
        invokeLater(() -> {
            clickMe.doClick();
            clickMe.doClick();
        });
 
        Stream<JLabel> labels = getComponents(JLabel.class);
        labels.forEach(t -> invokeLater(() -> t.setForeground(Color.BLUE)));
 
        JLabel lBirth = findComponentByText(JLabel.class, "Birth");
        forEarchComponent(JTextField.class, t -> {
            if (Math.abs(t.getY() - lBirth.getY()) < 10) {
                invokeLater(() -> t.setText("secret"));
            } else {
                invokeLater(() -> t.setText("auto: "));
            }
        });
 
        JLabel lName = findComponentByText(JLabel.class, "Name");
        JTextField tfName = findComponent(JTextField.class, t
                -> Math.abs(t.getY() - lName.getY()) < 10);
        invokeLater(() -> tfName.setText(tfName.getText() + "Điệp Esc"));
 
        JLabel lSex = findComponentByText(JLabel.class, "Sex");
        JTextField tfSex = findComponent(JTextField.class, t
                -> Math.abs(t.getY() - lSex.getY()) < 10);
        invokeLater(() -> tfSex.setText(tfSex.getText() + "Male"));
 
        JButton submit = findComponentByText(JButton.class, "Submit");
        invokeLater(submit::doClick);
        delay(500);
        Window dialog = findWindowByTitle("Submit confirm");
        JButton ok = findButtonByText(dialog, "OK");
        invokeLater(ok::doClick);
 
//        
    }
 
    public static void delay(long ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException ex) {
            throw new RuntimeException(ex);
        }
    }
 
    public static Window findWindowByTitle(String text) {
        for (Window window : Window.getWindows()) {
            try {
                Method method = window.getClass().getMethod("getTitle");
                if (method.getReturnType() == String.class) {
                    String windowTitle = (String) method.invoke(window);
                    if (Objects.equals(windowTitle, text)) {
                        return window;
                    }
                } else {
                    if (text == null || text.length() == 0) {
                        return window;
                    }
                }
            } catch (NoSuchMethodException | IllegalAccessException | IllegalArgumentException ex) {
                if (text == null || text.length() == 0) {
                    return window;
                }
            } catch (SecurityException | InvocationTargetException ex) {
                Logger.getLogger(robot.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }
 
    public static JButton findButtonByText(String text) {
        for (Window window : Window.getWindows()) {
            JButton result = findButtonByText(window, text);
            if (result != null) {
                return result;
            }
        }
        return null;
    }
 
    public static JButton findButtonByText(Component root, String text) {
        if (root instanceof JButton) {
            JButton button = (JButton) root;
            if (Objects.equals(button.getText(), text)) {
                return button;
            }
        }
        if (root instanceof Container) {
            for (Component component : ((Container) root).getComponents()) {
                JButton result = findButtonByText(component, text);
                if (result != null) {
                    return result;
                }
            }
        }
        return null;
    }
 
    public static <T extends Component> T findComponentByText(
            Class<T> clazz, String text) {
        for (Window window : Window.getWindows()) {
            T result = findComponentByText(clazz, window, text);
            if (result != null) {
                return result;
            }
        }
        return null;
    }
 
    public static <T extends Component> T findComponentByText(
            Class<T> clazz, Component root, String text) {
        if (clazz.isInstance(root)) {
 
            try {
                Method method = clazz.getMethod("getText", new Class[0]);
                if (method.getReturnType() != String.class) {
                    throw new NoSuchMethodException("class "
                            + clazz.getCanonicalName()
                            + " do not have a suitable getText method");
                }
                String componentText = (String) method.invoke(root);
                if (Objects.equals(componentText, text)) {
                    return (T) root;
                }
            } catch (IllegalAccessException | IllegalArgumentException | NoSuchMethodException | SecurityException | InvocationTargetException ex) {
                throw new RuntimeException(ex);
            }
        }
        if (root instanceof Container) {
            for (Component component : ((Container) root).getComponents()) {
                T result = findComponentByText(clazz, component, text);
                if (result != null) {
                    return result;
                }
            }
        }
        return null;
    }
 
    public static <T extends Component> T findComponent(
            Class<T> clazz, Component root, Predicate<T> predicate) {
        return (T) findComponent(root, t
                -> clazz.isInstance(t) && predicate.test((T) t));
    }
 
    public static <T extends Component> T findComponent(
            Class<T> clazz, Predicate<T> predicate) {
        return (T) findComponent(((Predicate<Component>) clazz::isInstance)
                .and(t -> predicate.test((T) t)));
    }
 
    public static Component findComponent(Predicate<Component> predicate) {
        for (Window window : Window.getWindows()) {
            Component result = findComponent(window, predicate);
            if (result != null) {
                return result;
            }
        }
        return null;
    }
 
    public static Component findComponent(
            Component root, Predicate<Component> predicate) {
        if (predicate.test(root)) {
            return root;
        }
        if (root instanceof Container) {
            for (Component component : ((Container) root).getComponents()) {
                Component result = findComponent(component, predicate);
                if (result != null) {
                    return result;
                }
            }
        }
        return null;
    }
 
    public static <T extends Component> void forEarchComponent(
            Class<T> clazz, Consumer<T> consumer) {
        for (Window window : Window.getWindows()) {
            forEarchComponent(clazz, window, consumer);
        }
    }
 
    public static <T extends Component> void forEarchComponent(
            Class<T> clazz, Component root, Consumer<T> consumer) {
        if (clazz.isInstance(root)) {
            consumer.accept((T) root);
        }
        if (root instanceof Container) {
            for (Component component : ((Container) root).getComponents()) {
                forEarchComponent(clazz, component, consumer);
            }
        }
    }
 
    public static Stream<Component> getComponents() {
        Stream<Component> stream = Stream.empty();
        for (Window window : Window.getWindows()) {
            Stream<Component> components = getComponents(window);
            stream = Stream.concat(stream, components);
        }
        return stream;
    }
 
    public static Stream<Component> getComponents(Component root) {
        Stack<Component> stack = new Stack<>();
        stack.push(root);
        Iterable<Component> iterable = () -> new Iterator<Component>() {
 
            @Override
            public boolean hasNext() {
                return !stack.isEmpty();
            }
 
            @Override
            public Component next() {
                Component component = stack.pop();
                if (component instanceof Container) {
                    for (Component child : ((Container) component).getComponents()) {
                        stack.push(child);
                    }
                }
                return component;
            }
        };
        return StreamSupport.stream(iterable.spliterator(), false);
    }
 
    public static <T extends Component> Stream<T> getComponents(Class<T> clazz, Component root) {
        return getComponents(root).filter(clazz::isInstance).map(t -> (T) t);
    }
 
    public static <T extends Component> Stream<T> getComponents(Class<T> clazz) {
        return getComponents().filter(clazz::isInstance).map(t -> (T) t);
    }
}