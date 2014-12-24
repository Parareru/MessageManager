package com.tyf.messagemanager;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.view.View.OnClickListener;

public class TitleLayout extends LinearLayout {
	
	private Context mContext; 
	
	public TitleLayout(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
		LayoutInflater.from(context).inflate(R.layout.title, this);
		mContext = context;
		Button titleBackup = (Button) findViewById(R.id.backups);
		Button titleRecover = (Button) findViewById(R.id.recover);
		Button titleEdit = (Button) findViewById(R.id.edit);
		Button titleNew = (Button) findViewById(R.id.newsms);
		
		titleNew.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(mContext,newSMS.class);
				mContext.startActivity(intent);
			}	
		});
		
		titleEdit.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(mContext,EditActivity.class);
				mContext.startActivity(intent);
			}	
		});
		
		titleBackup.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				ProgressDialog processDialog = new ProgressDialog(mContext);
				processDialog.setTitle("备份中");
				processDialog.setMessage("Waiting...");
				processDialog.setCancelable(true);
				processDialog.show();
				
				//Backup
				
				
				processDialog.dismiss();
			}
		});
		
		titleRecover.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				ProgressDialog processDialog = new ProgressDialog(mContext);
				processDialog.setTitle("恢复中");
				processDialog.setMessage("Waiting...");
				processDialog.setCancelable(true);
				processDialog.show();
				
				//recover
				
				
				processDialog.dismiss();
			}
		});
	}

}
