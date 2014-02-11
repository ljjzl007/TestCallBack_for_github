package com.callback.test;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class TestCallBackActivity extends Activity{
    /** Called when the activity is first created. */
	private InterfaceCallBack mCallBack = new InterfaceCallBack() {
		
		@Override
		public void fun() {
			// TODO Auto-generated method stub
			Log.w("Test", "receiveCallBack");
		}
	};
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Caller caller = new Caller();
        caller.setCallBackListener(mCallBack);
        caller.doCallBack();
        
    }
    
}