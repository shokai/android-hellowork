package org.shokai.hellowork;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

import java.util.*;

public class Main extends Activity implements OnClickListener{
    /** Called when the activity is first created. */
	
	private Button buttonOpen;
	private TextView textViewMessage;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        textViewMessage = (TextView)findViewById(R.id.TextViewMessage);
        buttonOpen = (Button)findViewById(R.id.ButtonOpen);
        buttonOpen.setOnClickListener(this);
    }
    
    public void onClick(View v){
    	switch(v.getId()){
    	case R.id.ButtonOpen:
    		buttonOpen.setText("clicked!!");
    		Date now = new Date();
    		this.textViewMessage.setText(now.toString());
    		Uri uri = Uri.parse("http://www.hellowork.go.jp/");
    		Intent intent = new Intent(Intent.ACTION_VIEW, uri);
    		startActivity(intent);
    		break;
    	}
    }
    
    
}