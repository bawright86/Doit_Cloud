package com.example.banset;
  
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;

import com.example.banset.ListCarActivity;
import com.example.banset.LoginActivity;
import am.doit.ledmanager.R;

import android.annotation.SuppressLint;
import android.app.Activity; 
import android.content.Intent;
import android.os.Bundle; 
import android.os.Handler;
import android.os.Message;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button; 
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class TipTwoActivity extends Activity {

	Button Button_send;
  
	     
	    
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
//	       getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);         		 
	        requestWindowFeature(Window.FEATURE_NO_TITLE); 
		setContentView(R.layout.tip);
	  
		Button_send = (Button) findViewById(R.id.b_tip);
		Button_send.setOnClickListener(new Button.OnClickListener() 
		{
    		public void onClick(View v) {
    			 Intent intent = new Intent(TipTwoActivity.this, EasyLinkActivity.class);
      		     startActivity(intent); 
      		      
          		 finish();
    			 
    		}
    	});
		
		 
	}
		 
	
	 

}
