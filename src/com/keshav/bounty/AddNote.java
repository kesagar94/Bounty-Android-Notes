package com.keshav.bounty;


import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AddNote extends Activity implements OnClickListener {

	Button saveNote;
	EditText note;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.add_notes);
		saveNote = (Button) findViewById(R.id.bSaveNote);
		note = (EditText) findViewById(R.id.eTNotes);
		saveNote.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub

		boolean didItWork = true;
		try {

			String cont = note.getText().toString();
			DatabaseWork entry = new DatabaseWork(AddNote.this);
			entry.open();
			entry.createEntry(cont);
			entry.close();

		} catch (Exception e) {

			didItWork = false;
			String error = e.toString();
			Dialog d = new Dialog(this);
			d.setTitle(error);
			TextView tv = new TextView(this);
			tv.setText("Some Problem");
			d.setContentView(tv);
			d.show();

		} finally {

			if (didItWork) {

				Dialog d = new Dialog(this);
				d.setTitle("NOTE saved!!");
				TextView tv = new TextView(this);
				tv.setText("Thank you");
				d.setContentView(tv);
				d.show();
			}
		}

	}

}
