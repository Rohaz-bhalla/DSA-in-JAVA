import java.awt.*;

public class drawLines extends Frame {

    public drawLines() {
        // Set the frame properties
        setTitle("Draw Lines");
        setSize(300, 200);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        // Drawing lines
        g.drawLine(0, 0, 100, 100);
        g.drawLine(0, 100, 100, 0);
        g.drawLine(40, 25, 250, 180);
        g.drawLine(75, 90, 400, 400);
        g.drawLine(20, 150, 400, 40);
        g.drawLine(5, 290, 80, 19);
    }

    public static void main(String[] args) {
        drawLines frame = new drawLines();
        frame.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
