package net.mobindustry.testimageloader;

import android.app.Application;

public class App extends Application {

    @Override
    public void onCreate() {
        DataHolder.setContext(this);
    }

}
