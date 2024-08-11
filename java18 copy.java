import java.awt.*;
import java.awt.event.*;

class EventHandlingDemo extends Frame implements ActionListener, MouseListener, MouseMotionListener {
    TextField tf;
    TextArea ta;

    EventHandlingDemo() {
        tf = new TextField();
        tf.setBounds(50, 50, 150, 20);
        ta = new TextArea();
        ta.setBounds(50, 100, 300, 200);
        ta.setEditable(false);

        tf.addActionListener(this);
        ta.addMouseListener(this);
        ta.addMouseMotionListener(this);

        add(tf);
        add(ta);

        setTitle("Event Handling Demo");
        setSize(400, 400);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        ta.append("Action performed: " + tf.getText() + "\n");
        tf.setText("");
    }

    public void mouseClicked(MouseEvent e) {
        ta.append("Mouse Clicked at (" + e.getX() + ", " + e.getY() + ")\n");
    }

    public void mouseEntered(MouseEvent e) {
        ta.append("Mouse Entered\n");
    }

    public void mouseExited(MouseEvent e) {
        ta.append("Mouse Exited\n");
    }

    public void mousePressed(MouseEvent e) {
        ta.append("Mouse Pressed at (" + e.getX() + ", " + e.getY() + ")\n");
    }

    public void mouseReleased(MouseEvent e) {
        ta.append("Mouse Released at (" + e.getX() + ", " + e.getY() + ")\n");
    }

    public void mouseDragged(MouseEvent e) {
        ta.append("Mouse Dragged at (" + e.getX() + ", " + e.getY() + ")\n");
    }

    public void mouseMoved(MouseEvent e) {
        ta.append("Mouse Moved at (" + e.getX() + ", " + e.getY() + ")\n");
    }

    public static void main(String[] args) {
        new EventHandlingDemo();
    }
}
