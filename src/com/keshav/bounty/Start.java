package com.keshav.bounty;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Start extends Activity implements OnClickListener {

	Button addNote, viewNote;
	Button addTDL, viewTDL;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.opening);

		addNote = (Button) findViewById(R.id.bAddNote);
		viewNote = (Button) findViewById(R.id.bViewNote);
		addTDL = (Button) findViewById(R.id.bAddTDL);
		viewTDL = (Button) findViewById(R.id.bViewTDL);

		addNote.setOnClickListener(this);
		viewNote.setOnClickListener(this);
		addTDL.setOnClickListener(this);
		viewTDL.setOnClickListener(this);

	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub

		switch (v.getId()) {
		case R.id.bAddNote:
			Intent openStartingPoint = new Intent("com.keshav.bounty.ADDNOTE");
			startActivity(openStartingPoint);

			break;

		case R.id.bViewNote:
			Intent openStartingPoint2 = new Intent("com.keshav.bounty.VIEWNOTE");
			startActivity(openStartingPoint2);
			break;

		case R.id.bAddTDL:
			break;

		case R.id.bViewTDL:
			break;
		}

	}

}
