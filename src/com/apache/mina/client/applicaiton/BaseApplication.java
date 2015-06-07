package com.apache.mina.client.applicaiton;

import com.apache.mina.client.service.PushService;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by neal on 2014/12/2.
 */
public class BaseApplication extends Application {
	private static Context applicationContext;
	private static String Tag = "BaseApplication";
	@Override
	public void onCreate() {
		super.onCreate();
		Log.e(Tag,"app start" + android.os.Process.myPid() + '-'
				+ android.os.Process.myTid());
		applicationContext = getApplicationContext();
		Intent intent = new Intent(this, PushService.class);
		startService(intent);
	}

	public static Context getAppContext() {
		return applicationContext;
	}
}
