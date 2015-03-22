package com.keshav.bounty;



import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ViewNote extends Activity {

	Button saveNote;
	EditText note;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.view_notes);
		TextView tv=(TextView)findViewById(R.id.tVLeft);
		DatabaseWork info =	new DatabaseWork(this);
		info.open();
		String data=info.getData();
		info.close();
		tv.setText(data);
	}
}