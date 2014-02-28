package com.example.nochmaldb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		skriptData Skript = new skriptData("345","","","","");
		
		Intent intent = new Intent(this, HelloIntentService.class);
		startService(intent);
		
		Skript = parser.getSkript(1);
		TextView myText = new TextView(this);//(TextView) findViewById(R.id.myText);
		
		myText.setText(Skript.getId());
		//myText.setText("Test");
		//setContentView(R.layout.activity_main);
		setContentView(myText);
		
		
				
		//EditText editText = (EditText) findViewById(R.id.edit_message);

		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
