package $001;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 6:51 PM 3/18/19.
 */
public class Singleton {
    private static volatile Singleton instance = null;

    public static Singleton getInstance(){
        if (instance == null){
            synchronized (Singleton.class){
                if (instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
