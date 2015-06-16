package net.mobindustry.testimageloader;

import android.content.Context;

public class DataHolder {

    private static Context context;

    public static Context getContext() {
        return context;
    }

    public static void setContext(Context context) {
        DataHolder.context = context;
    }
}
