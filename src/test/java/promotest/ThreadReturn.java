package promotest;


import java.util.HashMap;
import java.util.Map;

public class ThreadReturn {

    private static Map<String, Throwable> throwableMap = new HashMap<String, Throwable>();

    public static void save(Throwable throwable) {
        throwableMap.put(Thread.currentThread().getName(), throwable);
    }

    public static Throwable get(String threadName) {
        return throwableMap.get(threadName);
    }
}
