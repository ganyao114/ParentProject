package net.swiftos.eventposter.impls.broadcastreceiver.entity;

import android.content.Context;
import android.content.Intent;

/**
 * Created by gy on 2015/12/2.
 */
public interface IReciver {
    public void onReceiver(Context context, Intent intent);
}
