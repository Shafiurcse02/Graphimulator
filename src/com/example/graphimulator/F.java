package com.example.graphimulator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class F extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.f_page);
		Thread th = new Thread() {
			public void run() {
				try {
					sleep(3500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				} finally {
					Intent inten = new Intent(
							"com.example.graphimulator.MAINACTIVITY");
					startActivity(inten);
				}
			}
		};
		th.start();
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		finish();
	}

}
