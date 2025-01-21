package Task5.Task5_1;

public class Main {
    public static void main(String[] args) {
        Window window = new Window("Aboba", 400, 300, "myWindow");

        VerticalLayout verticalLayout = new VerticalLayout(200, 100, "Vertical Layout");

        Button button = new Button("Click me", "/test", "button");

        verticalLayout.addComponent(button);
        window.addComponent(verticalLayout);
        window.draw();
    }

}
