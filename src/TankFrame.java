import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class TankFrame extends Frame {
    Tank myTank = new Tank(50,50,Direaction.R);
    Tank enymyTank = new Tank(100,100,Direaction.R);
    public TankFrame() {
        this.setTitle("tank war");
        this.setLocation(200,200);
        this.setSize(200,200);
        this.setVisible(true);
        this.addKeyListener(new TankKeyListener());
    }

    @Override
    public void paint(Graphics g) {
        myTank.paint(g);
        enymyTank.paint(g);
    }
//    KeyListener接口实现需要重写全部方法，继承KeyAdapter类不需要
//    private class TankKeyListener implements KeyListener {
//
//        @Override
//        public void keyTyped(KeyEvent e) {
//
//        }
//
//        @Override
//        public void keyPressed(KeyEvent e) {
//
//        }
//
//        @Override
//        public void keyReleased(KeyEvent e) {
//
//        }
//    }
    public class TankKeyListener extends KeyAdapter {

        @Override
        public void keyPressed(KeyEvent e) {
            myTank.pressed(e);
        }

        @Override
        public void keyReleased(KeyEvent e) {
            myTank.released(e);
    }
    }
}
