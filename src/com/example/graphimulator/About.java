package com.example.graphimulator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class About extends Activity implements View.OnClickListener {
	TextView about;
	String a_text;
	Button back;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.about);
		about = (TextView) findViewById(R.id.about_text);
		back = (Button) findViewById(R.id.back);
		a_text = String.format("CSE JNEjfhnjjdvhn CSE Ghatta");
		about.setText(a_text);
		back.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.back:
			finish();
			// Intent inten = new
			// Intent("com.example.graphimulator.MAINACTIVITY");
			// startActivity(inten);
			break;
		default:
			break;
		}
	}
}