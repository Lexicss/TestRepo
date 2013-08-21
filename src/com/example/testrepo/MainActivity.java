package com.example.testrepo;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Log.i("AM", "Activity started");
		Log.d("AM", "Here I make a next change");
		
		// This comment is special to make a change for next commit
		/*
		 * *
		 * erere
		 * re
		 * re
		 * r
		 * er
		 * e
		 * re
		 * r
		 * er
		 * 
		 */
		Log.v("AM", "His is verbose message in lexbranch");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	// Good work

}
