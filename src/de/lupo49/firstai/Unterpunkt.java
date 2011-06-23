package de.lupo49.firstai;

import java.nio.charset.Charset;

import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Unterpunkt extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.unterpunkt);
		
		int menuepunktID = -1;
		CharSequence ausgabeText = "";
		CharSequence ueberschriftText = "";
		
		final Bundle parameter = getIntent().getExtras();
		if(parameter != null) {
			// ID des angeklickten TextViews sichern
			menuepunktID = parameter.getInt("quelle");
		}
		
		switch(menuepunktID) {
			case R.id.HaftungHinweise:
				ausgabeText = this.getString(R.string.HaftungHinweiseContent);
				ueberschriftText = this.getString(R.string.HaftungHinweise);
				break;
			case R.id.Allgemeines:
				ausgabeText = this.getString(R.string.AllgemeinesContent);
				ueberschriftText = this.getString(R.string.Allgemeines);
				break;
			case R.id.AllergischeReaktion:
				break;
			case R.id.Amputation:
				ausgabeText = this.getString(R.string.AmputationContent);
				ueberschriftText = this.getString(R.string.Amputation);
				break;
			case R.id.AsthmaAtemnot:
				ausgabeText = this.getString(R.string.AsthmaAtemnot);
				ueberschriftText = this.getString(R.string.AsthmaAtemnotContent);
				break;
			case R.id.Atemstillstand:
				ausgabeText = this.getString(R.string.Atemstillstand);
				ueberschriftText = this.getString(R.string.AtemstillstandContent);
				break;
			default:
				ausgabeText = Html.fromHtml("");
				break;
		}
		
		// Ueberschrift setzen
		TextView tvUeberschrift = new TextView(this);
		tvUeberschrift = (TextView)findViewById(R.id.Informationsleiste);
		tvUeberschrift.setText(ueberschriftText);
		
		// Inhalt auf Activity setzen
		TextView tv = new TextView(this);
		tv = (TextView)findViewById(R.id.inhaltContainer);
		tv.setText(ausgabeText);
		
		Log.i("Unterpunkt", String.valueOf(menuepunktID));
	}
	
}
