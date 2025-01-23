package Task5.Task5_1;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Window extends WindowComponent {
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
        JFrame frame = new JFrame(_tittle);
        frame.setSize(_width,_height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

        super.draw();
        for (WindowComponent component : nestedComponent) {
            if (component instanceof VerticalLayout) {
                VerticalLayout layout = (VerticalLayout) component;

                frame.add(layout.getComponent(), BorderLayout.NORTH);
            }
        }

        frame.setVisible(true);

    }
}
