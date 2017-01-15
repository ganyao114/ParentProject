package net.swiftos.common.navigation;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by gy939 on 2017/1/15.
 */

public class Navigater {

    public final static String NAVI_CODE = "navi_code";

    public static Map<String,Object> dataStack = new HashMap<>();

    public static <T> T navigateIn(String key) {
        return (T) dataStack.remove(key);
    }

    public static void navigateOut(String key, Object data) {
        dataStack.put(key, data);
    }

    public interface INavigate {
        void onNavigate(Object object);
    }

}
