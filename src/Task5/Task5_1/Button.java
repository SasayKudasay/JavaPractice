package Task5.Task5_1;
import javax.swing.*;

public class Button extends WindowComponent{
    private String _text;
    private String _imagePath;
    private JButton jButton;

    public Button(String _text, String _imagePath, String name) {
        this._text = _text;
        this._imagePath = _imagePath;
        this.name = name;
    }


    @Override
    protected void draw() {
        jButton = new JButton(_text);
        jButton.setName(name);
    }

    @Override
    public void addComponent(WindowComponent component) {
        System.out.println("No addition to button");
    }

    @Override
    public void removeComponent(String name) {

    }

    public JButton getComponent() {
        return jButton;
    }

    public void setComponent(JButton jButton) {
        this.jButton = jButton;
    }
}
