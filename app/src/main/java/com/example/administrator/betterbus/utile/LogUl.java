package com.example.administrator.betterbus.utile;

import android.util.Log;

import com.example.administrator.betterbus.BuildConfig;

public class LogUl {

	public static final String RELEASE_TAG = "chenyuanzheng";
	public static final String RELEASE_BAIDU = "chenyuanzheng_baidu";
	private static  boolean b =   BuildConfig.DEBUG;
	public static void v(String tag, String msg) {
		if (b) {
			Log.v(tag, msg);
		}
	}

	public static void d(String tag, String msg) {
		if (b) {
			Log.d(tag, msg);
		}
	}

	public static void i(String tag, String msg) {
		if (b) {
			Log.i(tag, msg);
		}
	}

	public static void w(String tag, String msg) {
		if (b) {
			Log.w(tag, msg);
		}
	}

	public static void e(String tag, String msg) {
		if (b) {
			Log.e(tag, msg);
		}
	}
}
