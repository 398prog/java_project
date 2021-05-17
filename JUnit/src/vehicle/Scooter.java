package vehicle;

/**
 * スクータークラス
 *
 * @author System Shared
 */
public class Scooter {
    /**
     * 走行距離を計算するメソッド
     *
     * @param speed
     *            乗り物の速度
     * @param gasoline
     *            消費するガソリン量
     * @return 走行距離
     */
    public int drive(int speed, int gasoline) {
        int mileage = speed * gasoline;
        return mileage;
    }
}
