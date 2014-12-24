package com.tyf.messagemanager;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

public class MyDatabaseHelper extends SQLiteOpenHelper{

	private Context mContext;
	public static final String CREATE_NECKNAME = "create table neckname (phoneNumber TEXT, neckname TEXT)";
//	public static final String CREATE_TEMP = "create table temp ("
//			+ "name text"
//			+ "phoneNumber text"
//			+ "neckname text";
////			+ "sort_key ";
	
	public MyDatabaseHelper(Context context, String name, CursorFactory factory, int version) {
		super(context, name, factory, version);
		// TODO Auto-generated constructor stub
		mContext = context;	
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		db.execSQL(CREATE_NECKNAME);
		Toast.makeText(mContext, "Create Success", Toast.LENGTH_LONG).show();
		
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		
	}

}
