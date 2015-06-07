package com.apache.mina.client.service;

import com.apache.mina.client.push.PushEventListener;
import com.apache.mina.client.push.PushManager;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class PushService extends Service {

	PushManager pushManager = PushManager.getInstance();
	private static String Tag = "PushService";

	@Override
	public void onCreate() {
		Log.e(Tag, "service start" + android.os.Process.myPid() + '-'
				+ android.os.Process.myTid());
		super.onCreate();
		pushManager.openPush();
		pushManager.setPushEventListener(new PushEventListener() {
			@Override
			public void onPushConnected() {
				Log.e(Tag, "service push open" + android.os.Process.myPid()
						+ '-' + android.os.Process.myTid());

			}

			@Override
			public void onPushExceptionCaught() {
				Log.e(Tag,
						"service push exception" + android.os.Process.myPid()
								+ '-' + android.os.Process.myTid());

			}

			@Override
			public void onPushMessageSent() {
				Log.e(Tag, "service push sent" + android.os.Process.myPid()
						+ '-' + android.os.Process.myTid());

			}

			@Override
			public void onPushMessageReceived() {

			}

			@Override
			public void onPushDisConnected() {
				Log.e(Tag, "service push close" + android.os.Process.myPid()
						+ '-' + android.os.Process.myTid());

			}
		});
		Log.e(Tag, "pushManager connect!");
		pushManager.Connect();
	}

	@Override
	public int onStartCommand(Intent intent, int flags, int startId) {

		super.onStartCommand(intent, flags, startId);
		return START_STICKY;
	}

	@Override
	public IBinder onBind(Intent intent) {
		return null;
	}

	@Override
	public void onDestroy() {
		super.onDestroy();
		pushManager.disConnect();
	}

}
