import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

public class AnimatedFrames extends JFrame {
    private BufferedImage[] frames;
    private int currentFrame = 0;
    private static final int TOTAL_FRAMES = 16; // change this according to the number of frames you have

    public AnimatedFrames() {
        frames = new BufferedImage[TOTAL_FRAMES];

        // Load each frame image into the BufferedImage array
        for (int i = 0; i < TOTAL_FRAMES; i++) {
            try {
                frames[i] = ImageIO.read(getClass().getResource("frame" + (i + 1) + ".png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        setSize(500, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);


        Timer timer = new Timer(80, e -> {
            currentFrame++;
            if (currentFrame >= TOTAL_FRAMES) {
                currentFrame = 0;
            }
            repaint();
        });
        timer.start();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        if (frames[currentFrame] != null) {
            g.drawImage(frames[currentFrame], 0, 0, null);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(AnimatedFrames::new);
    }
}