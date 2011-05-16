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
		setContentView(R.layout.menuepunkt);
		
		int menuepunktID = -1;
		CharSequence ausgabeText = "";
 
		final Bundle parameter = getIntent().getExtras();
		if(parameter != null) {
			// ID des angeklickten TextViews sichern
			menuepunktID = parameter.getInt("quelle");
		}
		
		if(menuepunktID == R.id.HaftungHinweise) 	ausgabeText = Html.fromHtml("Haftung + Hinweise, -- Software --\nErste Hilfe auf dem Handy\nVersion: j3.0\n" +
																	"Release: 2008-12-24\nLizenz: Creative Commons BY-NC-ND 3.0\nCopyright: Kai Kajus " +
																	"Noack\n\nErste Hilfe Illustrationen © Med4Teens\n\nDieses Programm soll Informationen" +
																	"zur Ersten Hilfe geben. Es stellt jedoch in keiner Weise einen Ersatz für einen Erste-Hilfe-Kurs" +
																	"dar, sondern dient der Auffrischung des bereits erworbenen Wissens." +
																	"\n\n-- Haftungsausschluss --\nBitte beachten Sie, dass ich keine Verantwortung für Konsequenzen, " +
																	"die aus der Nutzung entstehen, übernehme.\nJEGLICHE HAFTUNG IST AUSGESCHLOSSEN!\nVERWENDUNG AUF EIGENE GEFAHR!" +
																	"\n\nIn allen Notfällen suchen Sie bitte sofort professionelle Hilfe.\n\n-- Entwicklung des Projekts --\n" +
																	"Das Programm soll vielsprachig werden. Freiwillige Übersetzer gesucht!!\n\nWeitere Informationen erhalten Sie im" +
																	"Internet unter www.firstai.de oder schreiben Sie eine E-Mail an: info@firstai.de");
		
		TextView tv = new TextView(this);
		tv.setText(ausgabeText);
		tv.setTextSize(16);
		LinearLayout v = (LinearLayout)findViewById(R.id.mpLinearLayout);
		v.addView(tv);
		
		Log.i("Unterpunkt", String.valueOf(menuepunktID));
	}
	
}
