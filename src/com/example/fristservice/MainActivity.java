package com.example.fristservice;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button start=(Button)findViewById(R.id.start);
		Button stop=(Button)findViewById(R.id.start);
		final Intent intent=new Intent();
		intent.setAction("com.exampie.fristservice.MY_SERVICE");
		start.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				startService (intent);}
		});
	
	stop.setOnClickListener(new OnClickListener(){
		public void onClick(View arg0){
			stopService (intent);}
	});
}


}
