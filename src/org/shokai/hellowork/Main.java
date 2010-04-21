package org.shokai.hellowork;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Main extends Activity implements OnClickListener{
    /** Called when the activity is first created. */
	
	private Button buttonOpen;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        buttonOpen = (Button)findViewById(R.id.ButtonOpen);
        buttonOpen.setText("あああああ");
        buttonOpen.setOnClickListener(this);
    }
    
    public void onClick(View v){
    	switch(v.getId()){
    	case R.id.ButtonOpen:
    		buttonOpen.setText("clicked!!");
    		break;
    	}
    }
    
}