package com.callback.test;

import android.util.Log;

public class Caller {
	InterfaceCallBack callBack;
	
	public void doCallBack(){
		Log.w("Test", "setDoCallBack");
		callBack.fun();
	}
	
	public void setCallBackListener(InterfaceCallBack back){
		Log.w("Test", "setListener");
		this.callBack = back;
	}
}
