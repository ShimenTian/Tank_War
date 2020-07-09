import java.awt.*;
import java.awt.event.KeyEvent;

public class Tank {
    private int x,y;
    private Direaction dir;
    private boolean bL,bR,bU,bD;
    private static final int SPEED = 5;

    public Tank(int x , int y , Direaction dir) {
        this.x = x;
        this.y = y;
        this.dir = dir;
    }

    public void paint(Graphics g) {
        g.fillRect(x,y,20,20);
    }

    public void pressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        switch (keyCode) {
            case KeyEvent.VK_RIGHT :
                bR = true;
                break;
            case KeyEvent.VK_LEFT :
                bL = true;
                break;
            case KeyEvent.VK_UP :
                bU = true;
                break;
            case KeyEvent.VK_DOWN :
                bD = true;
                break;
        }
        setMainDir();
    }

    private void setMainDir() {
        if(!bL && !bU && !bR &&!bD) {
            dir = Direaction.STOP;
        }
        if(!bL && !bU && !bR &&!bD) {
            dir = Direaction.STOP;
        }
        if(!bL && !bU && !bR &&!bD) {
            dir = Direaction.STOP;
        }
        if(!bL && !bU && !bR &&!bD) {
            dir = Direaction.STOP;
        }
    }

    private void move() {
        switch(dir) {
            case D -> y += SPEED;
            case L -> x -= SPEED;
            case R -> x += SPEED;
            case U -> y -= SPEED;
        }
    }

    public void released(KeyEvent e) {

    }
}
