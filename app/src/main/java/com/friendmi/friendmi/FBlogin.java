package com.friendmi.friendmi;

import android.app.Application;
import com.facebook.FacebookSdk;
import com.facebook.drawee.backends.pipeline.Fresco;

/**
 * Created by alam on 2/3/18.
 */

public class FBlogin extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        FacebookSdk.sdkInitialize(getApplicationContext());

        Fresco.initialize(this);
    }

}
