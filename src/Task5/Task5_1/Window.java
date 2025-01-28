package Task5.Task5_1;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Window extends WindowComponent {
    private JFrame frame;
    private String _tittle;
    private int _width;
    private int _height;

    public Window(String _tittle, int _width, int _height, String name) {
        this._tittle = _tittle;
        this._width = _width;
        this._height = _height;
        this.name = name;
        this.nestedComponent = new ArrayList<>();
    }

    @Override
    public void draw() {
        frame = new JFrame(_tittle);
        frame.setSize(_width,_height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

        super.draw();
        for (WindowComponent component : nestedComponent) {
                frame.add(component.getComponent(), BorderLayout.NORTH);
            }
        frame.setVisible(true);
    }

    @Override
    public JComponent getComponent() {
        return null;
    }
}
