package Task5.Task5_1;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class VerticalLayout extends WindowComponent{
    private int _width;
    private int _height;
    private JPanel jPanel;

    public VerticalLayout(int _width, int _height, String name) {
        this._width = _width;
        this._height = _height;
        this.name = name;
        this.nestedComponent = new ArrayList<>();
    }

    protected void draw(){
        jPanel = new JPanel();
        JLabel jLabel = new JLabel(name);
        jLabel.setSize(_width, _height);
        jPanel.add(jLabel);

        super.draw();

        for (WindowComponent component : nestedComponent) {
            if (component instanceof Button) {
                Button button = (Button) component;

                jPanel.add(button.getComponent(), BorderLayout.NORTH);
            }
        }
    }

    public int get_width() {
        return _width;
    }

    public void set_width(int _width) {
        this._width = _width;
    }


    public int get_height() {
        return _height;
    }

    public void set_height(int _height) {
        this._height = _height;
    }

    public JPanel getComponent() {
        return jPanel;
    }

    public void setComponent(JPanel jPanel) {
        this.jPanel = jPanel;
    }
}
