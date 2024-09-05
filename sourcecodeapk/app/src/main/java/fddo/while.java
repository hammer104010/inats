package fddo;

import android.content.Context;
import java.util.Iterator;
import java.util.Map;
public class while {
    public static void case(Context context, String str, Boolean bool) {
        context.getSharedPreferences("main", 0).edit().putBoolean(str, bool.booleanValue()).commit();
    }

    public static void else(Context context, String str, Integer num) {
        context.getSharedPreferences("main", 0).edit().putInt(str, num.intValue()).commit();
    }

    public static Boolean fddo(Context context, String str, Boolean bool) {
        return Boolean.valueOf(context.getSharedPreferences("main", 0).getBoolean(str, bool.booleanValue()));
    }

    public static Long for(Context context, String str, Long l) {
        return Long.valueOf(context.getSharedPreferences("main", 0).getLong(str, l.longValue()));
    }

    public static void goto(Context context, String str, Long l) {
        context.getSharedPreferences("main", 0).edit().putLong(str, l.longValue()).commit();
    }

    public static Integer ifdf(Context context, String str, Integer num) {
        return Integer.valueOf(context.getSharedPreferences("main", 0).getInt(str, num.intValue()));
    }

    public static String new(Context context, String str, String str2) {
        return context.getSharedPreferences("main", 0).getString(str, str2);
    }

    public static void this(Context context, String str, String str2) {
        context.getSharedPreferences("main", 0).edit().putString(str, str2).commit();
    }

    public static String try(Context context, String str) {
        StringBuilder sb;
        String str2 = "SharedPrefs:\\n";
        Iterator<Map.Entry<String, ?>> it = context.getSharedPreferences("main", 0).getAll().entrySet().iterator();
        while (true) {
            String str3 = str2;
            if (!it.hasNext()) {
                return str3;
            }
            Map.Entry<String, ?> next = it.next();
            String obj = next.getValue().toString();
            if (obj.length() < 1000) {
                str2 = str3 + ">>" + next.getKey() + ": " + obj + "\n";
            } else {
                String str4 = str3 + ">>" + next.getKey() + ": ";
                if (next.getKey().startsWith("inj_")) {
                    sb = new StringBuilder();
                    sb.append(str4);
                    sb.append("<hidden>\n");
                } else {
                    int i = 0;
                    String str5 = str4;
                    while (i <= obj.length() / 1000) {
                        int i2 = i + 1;
                        int i3 = i2 * 1000;
                        if (i3 > obj.length()) {
                            i3 = obj.length();
                        }
                        str5 = str5 + obj.substring(i * 1000, i3).replace("%", "%%");
                        i = i2;
                    }
                    sb = new StringBuilder();
                    sb.append(str5);
                    sb.append("\n");
                }
                str2 = sb.toString();
            }
        }
    }
}
