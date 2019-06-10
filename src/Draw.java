import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Draw extends JFrame {

    public static void main(String[] args) {
        new Draw();
    }

    public Draw(){
        this.setSize(1000, 1000);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(SwingUtilities.isRightMouseButton(e)) clear();
                else draw(e.getX(), e.getY());
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                draw(e.getX(), e.getY());
            }

            @Override
            public void mouseMoved(MouseEvent e) {

            }
        });
        this.setVisible(true);
    }

    @Override
    public void paint(Graphics g){
        super.paint(g);
        clear();
    }

    private void draw(int x, int y){
        Graphics graphics = this.getContentPane().getGraphics();
        graphics.setColor(Color.BLACK);
        graphics.fillOval(x - 13, y - 35, 10, 10);
    }

    private void clear(){
        Graphics graphics = this.getContentPane().getGraphics();
        graphics.setColor(Color.GRAY);
        graphics.fillRect(0, 0, this.getWidth(), this.getHeight());
    }

}
