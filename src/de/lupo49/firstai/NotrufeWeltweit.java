package de.lupo49.firstai;

import java.util.Vector;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class NotrufeWeltweit extends Activity {

	private Vector<Integer> kontinente = new Vector<Integer>();
	private TextView tv;
	private Intent kontinentAusgewaehlt;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.notrufeweltweit);
		tv = new TextView(this);

		kontinente.add(R.id.tvNotrufeWeltweitAfrika);
		kontinente.add(R.id.tvNotrufeWeltweitAsien);
		kontinente.add(R.id.tvNotrufeWeltweitEuropa);
		kontinente.add(R.id.tvNotrufeWeltweitNZAmerika);
		kontinente.add(R.id.tvNotrufeWeltweitOzeanien);
		kontinente.add(R.id.tvNotrufeWeltweitSuedamerika);

		kontinentAusgewaehlt = new Intent(this, Unterpunkt.class);

		// Ereignisse auf die einzelnen Kontinente setzen
		for (int i = 0; i < kontinente.size(); i++) {
			tv = (TextView) findViewById(kontinente.get(i));
			tv.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					kontinentAusgewaehlt.putExtra("quelle", v.getId());
					startActivity(kontinentAusgewaehlt);
				}
			});
		}
	}
}
