import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class ShapeDrawer extends JFrame {
    private ArrayList<Shape> shapes;

    public ShapeDrawer() {
        shapes = new ArrayList<Shape>();
        generateRandomShapes(20);

        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void generateRandomShapes(int count) {
        Random rand = new Random();
        for (int i = 0; i < count; i++) {
            int x = rand.nextInt(400);
            int y = rand.nextInt(400);
            Color color = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));

            if (rand.nextBoolean()) {
                int radius = rand.nextInt(100);
                shapes.add(new Circle(x, y, color, radius));
            } else {
                int width = rand.nextInt(100);
                int height = rand.nextInt(100);
                shapes.add(new RectangleShape(x, y, color, width, height));
            }
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        for (Shape shape : shapes) {
            shape.draw(g);
        }
    }

    public static void main(String[] args) {
        new ShapeDrawer();
    }
}
