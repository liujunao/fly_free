package game.model;

/**
 * 玩家子弹 2
 * @author lenovo
 * @date 2017/11/20
 */
public class HeroBullet2 extends FlyObject{

    public HeroBullet2(int x, int y) {
        super(x, y, 30, 30, Resources.hBullet2PNG);
    }

    @Override
    public void move(long time,int ex) {
        if (time % 2 == 0){
            if (ex < x){
                x -= 6;
            }else {
                x += 6;
            }
        }
    }
}
