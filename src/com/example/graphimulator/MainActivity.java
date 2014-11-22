package com.example.graphimulator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener {
	Button help, about;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		about = (Button) findViewById(R.id.about_button);
		help = (Button) findViewById(R.id.help_button);
		help.setOnClickListener(this);
		about.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.about_button:
			Intent inten = new Intent("com.example.graphimulator.ABOUT");
			startActivity(inten);
			break;
		case R.id.help_button:
			Intent intenT = new Intent("com.example.graphimulator.HELP");
			startActivity(intenT);
			break;

		default:
			break;
		}

	}

	public void dismis(View view) {
		finish();
	}
}
