package com.example.graphimulator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Help extends Activity implements View.OnClickListener {
	TextView help;
	String a_text;
	Button back;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.help);
		help = (TextView) findViewById(R.id.help);
		back = (Button) findViewById(R.id.back);
		a_text = String.format("CSE JNu help help CSE Ghatta");
		help.setText(a_text);
		back.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.back:
			finish();
			//Intent inten = new Intent("com.example.graphimulator.MAINACTIVITY");
			//startActivity(inten);
			break;
		default:
			break;
		}
	}
}
