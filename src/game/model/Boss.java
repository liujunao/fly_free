package game.model;

import java.awt.image.BufferedImage;

/**
 * BOSS类
 *
 * @author lenovo
 * @date 2017/11/20
 */
public class Boss extends FlyObject {

    private BufferedImage bufferedImage = null;


    public Boss(int x, int y,BufferedImage bufferedImage) {
        super(x, y, 220, 220, bufferedImage);
    }

    @Override
    public void move(long time, int index) {

    }
}
