package de.lupo49.firstai;

import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.util.Log;
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
		if (parameter != null) {
			// ID des angeklickten TextViews sichern
			menuepunktID = parameter.getInt("quelle");
		}

		switch (menuepunktID) {
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
		case R.id.AtmungPruefen:
			ausgabeText = this.getString(R.string.AtmungPruefen);
			ueberschriftText = this.getString(R.string.AtmungPruefen);
			break;
		case R.id.Augenverletzung:
			ausgabeText = this.getString(R.string.Augenverletzung);
			ueberschriftText = this.getString(R.string.Augenverletzung);
			break;
		case R.id.Augenveraetzung:
			ausgabeText = this.getString(R.string.Augenveraetzung);
			ueberschriftText = this.getString(R.string.Augenveraetzung);
			break;
		case R.id.Beatmung:
			ausgabeText = this.getString(R.string.Beatmung);
			ueberschriftText = this.getString(R.string.Beatmung);
			break;
		case R.id.BewusstlosigkeitMitAtmung:
			ausgabeText = this.getString(R.string.BewusstlosigkeitMitAtmung);
			ueberschriftText = this
					.getString(R.string.BewusstlosigkeitMitAtmung);
			break;
		case R.id.BewusstlosigkeitOhneAtmung:
			ausgabeText = this.getString(R.string.BewusstlosigkeitOhneAtmung);
			ueberschriftText = this
					.getString(R.string.BewusstlosigkeitOhneAtmung);
			break;
		case R.id.BlutungLeicht:
			ausgabeText = this.getString(R.string.BlutungLeicht);
			ueberschriftText = this.getString(R.string.BlutungLeicht);
			break;
		case R.id.BlutungSchwer:
			ausgabeText = this.getString(R.string.BlutungSchwer);
			ueberschriftText = this.getString(R.string.BlutungSchwer);
			break;
		case R.id.DiabetischesKoma:
			ausgabeText = this.getString(R.string.DiabetischesKoma);
			ueberschriftText = this.getString(R.string.DiabetischesKoma);
			break;
		case R.id.Durchfall:
			ausgabeText = this.getString(R.string.Durchfall);
			ueberschriftText = this.getString(R.string.Durchfall);
			break;
		case R.id.Eisunfall:
			ausgabeText = this.getString(R.string.Eisunfall);
			ueberschriftText = this.getString(R.string.Eisunfall);
			break;
		case R.id.Elektrounfall:
			ausgabeText = this.getString(R.string.Elektrounfall);
			ueberschriftText = this.getString(R.string.Elektrounfall);
			break;
		case R.id.EpileptischerAnfall:
			ausgabeText = this.getString(R.string.EpileptischerAnfall);
			ueberschriftText = this.getString(R.string.EpileptischerAnfall);
			break;
		case R.id.Erbrechen:
			ausgabeText = this.getString(R.string.Erbrechen);
			ueberschriftText = this.getString(R.string.Erbrechen);
			break;
		case R.id.ErfrierungLeicht:
			ausgabeText = this.getString(R.string.ErfrierungLeicht);
			ueberschriftText = this.getString(R.string.ErfrierungLeicht);
			break;
		case R.id.ErfrierungStark:
			ausgabeText = this.getString(R.string.ErfrierungStark);
			ueberschriftText = this.getString(R.string.ErfrierungStark);
			break;
		case R.id.Ersticken:
			ausgabeText = this.getString(R.string.Ersticken);
			ueberschriftText = this.getString(R.string.Ersticken);
			break;
		case R.id.Ertrinken:
			ausgabeText = this.getString(R.string.Ertrinken);
			ueberschriftText = this.getString(R.string.Ertrinken);
			break;
		case R.id.Geburt:
			ausgabeText = this.getString(R.string.Geburt);
			ueberschriftText = this.getString(R.string.Geburt);
			break;
		case R.id.GefahrenzoneRetten:
			ausgabeText = this.getString(R.string.GefahrenzoneRetten);
			ueberschriftText = this.getString(R.string.GefahrenzoneRetten);
			break;
		case R.id.Gehirnerschuetterung:
			ausgabeText = this.getString(R.string.Gehirnerschuetterung);
			ueberschriftText = this.getString(R.string.Gehirnerschuetterung);
			break;
		case R.id.Herzdruckmassage:
			ausgabeText = this.getString(R.string.Herzdruckmassage);
			ueberschriftText = this.getString(R.string.Herzdruckmassage);
			break;
		case R.id.Herzinfarkt:
			ausgabeText = this.getString(R.string.Herzinfarkt);
			ueberschriftText = this.getString(R.string.Herzinfarkt);
			break;
		case R.id.Hitzschlag:
			ausgabeText = this.getString(R.string.Hitzschlag);
			ueberschriftText = this.getString(R.string.Hitzschlag);
			break;
		case R.id.Insektenstich:
			ausgabeText = this.getString(R.string.Insektenstich);
			ueberschriftText = this.getString(R.string.Insektenstich);
			break;
		case R.id.Knochenbruch:
			ausgabeText = this.getString(R.string.Knochenbruch);
			ueberschriftText = this.getString(R.string.Knochenbruch);
			break;
		case R.id.Nasenbluten:
			ausgabeText = this.getString(R.string.Nasenbluten);
			ueberschriftText = this.getString(R.string.Nasenbluten);
			break;
		case R.id.Notruf:
			ausgabeText = this.getString(R.string.Notruf);
			ueberschriftText = this.getString(R.string.Notruf);
			break;
		case R.id.Reanimation:
			ausgabeText = this.getString(R.string.Reanimation);
			ueberschriftText = this.getString(R.string.Reanimation);
			break;
		case R.id.Rueckenverletzung:
			ausgabeText = this.getString(R.string.Rueckenverletzung);
			ueberschriftText = this.getString(R.string.Rueckenverletzung);
			break;
		case R.id.Schaedelbasisbruch:
			ausgabeText = this.getString(R.string.Schaedelbasisbruch);
			ueberschriftText = this.getString(R.string.Schaedelbasisbruch);
			break;
		case R.id.Schlaganfall:
			ausgabeText = this.getString(R.string.Schlaganfall);
			ueberschriftText = this.getString(R.string.Schlaganfall);
			break;
		case R.id.Schlangenbiss:
			ausgabeText = this.getString(R.string.Schlangenbiss);
			ueberschriftText = this.getString(R.string.Schlangenbiss);
			break;
		case R.id.Schock:
			ausgabeText = this.getString(R.string.Schock);
			ueberschriftText = this.getString(R.string.Schock);
			break;
		case R.id.Sonnenbrand:
			ausgabeText = this.getString(R.string.Sonnenbrand);
			ueberschriftText = this.getString(R.string.Sonnenbrand);
			break;
		case R.id.Sonnenstich:
			ausgabeText = this.getString(R.string.Sonnenstich);
			ueberschriftText = this.getString(R.string.Sonnenstich);
			break;
		case R.id.SOS:
			ausgabeText = this.getString(R.string.SOS);
			ueberschriftText = this.getString(R.string.SOS);
			break;
		case R.id.StabileSeitenlage:
			ausgabeText = this.getString(R.string.StabileSeitenlage);
			ueberschriftText = this.getString(R.string.StabileSeitenlage);
			break;
		case R.id.Tierbiss:
			ausgabeText = this.getString(R.string.Tierbiss);
			ueberschriftText = this.getString(R.string.Tierbiss);
			break;
		case R.id.Ueberhitzung:
			ausgabeText = this.getString(R.string.Ueberhitzung);
			ueberschriftText = this.getString(R.string.Ueberhitzung);
			break;
		case R.id.Ueberzuckerung:
			ausgabeText = this.getString(R.string.Ueberzuckerung);
			ueberschriftText = this.getString(R.string.Ueberzuckerung);
			break;
		case R.id.UnfallstelleSichern:
			ausgabeText = this.getString(R.string.UnfallstelleSichern);
			ueberschriftText = this.getString(R.string.UnfallstelleSichern);
			break;
		case R.id.Unterkuehlung:
			ausgabeText = this.getString(R.string.Unterkuehlung);
			ueberschriftText = this.getString(R.string.Unterkuehlung);
			break;
		case R.id.Unterzuckerung:
			ausgabeText = this.getString(R.string.Unterzuckerung);
			ueberschriftText = this.getString(R.string.Unterzuckerung);
			break;
		case R.id.Veraetzung:
			ausgabeText = this.getString(R.string.Veraetzung);
			ueberschriftText = this.getString(R.string.Veraetzung);
			break;
		case R.id.VerbrennungLeicht:
			ausgabeText = this.getString(R.string.VerbrennungLeicht);
			ueberschriftText = this.getString(R.string.VerbrennungLeicht);
			break;
		case R.id.VerbrennungSchwer:
			ausgabeText = this.getString(R.string.VerbrennungSchwer);
			ueberschriftText = this.getString(R.string.VerbrennungSchwer);
			break;
		case R.id.Vergiftung:
			ausgabeText = this.getString(R.string.Vergiftung);
			ueberschriftText = this.getString(R.string.Vergiftung);
			break;
		case R.id.Verkehrsunfall:
			ausgabeText = this.getString(R.string.Verkehrsunfall);
			ueberschriftText = this.getString(R.string.Verkehrsunfall);
			break;
		case R.id.Verschlucken:
			ausgabeText = this.getString(R.string.Verschlucken);
			ueberschriftText = this.getString(R.string.Verschlucken);
			break;
		case R.id.VerstauchungVerrenkung:
			ausgabeText = this.getString(R.string.VerstauchungVerrenkung);
			ueberschriftText = this.getString(R.string.VerstauchungVerrenkung);
			break;
		case R.id.Wiederbelebung:
			ausgabeText = this.getString(R.string.Wiederbelebung);
			ueberschriftText = this.getString(R.string.Wiederbelebung);
			break;
		case R.id.Wirbelsaeule:
			ausgabeText = this.getString(R.string.Wirbelsaeule);
			ueberschriftText = this.getString(R.string.Wirbelsaeule);
			break;
		case R.id.dashPlaceholder:
			ausgabeText = this.getString(R.string.dashPlaceholder);
			ueberschriftText = this.getString(R.string.dashPlaceholder);
			break;
		case R.id.Notruf112Waehlen:
			ausgabeText = this.getString(R.string.Notruf112Waehlen);
			ueberschriftText = this.getString(R.string.Notruf112Waehlen);
			break;
		default:
			ausgabeText = Html.fromHtml("");
			break;
		}

		// Ueberschrift setzen
		TextView tvUeberschrift = new TextView(this);
		tvUeberschrift = (TextView) findViewById(R.id.Informationsleiste);
		tvUeberschrift.setText(ueberschriftText);

		// Inhalt auf Activity setzen
		TextView tv = new TextView(this);
		tv = (TextView) findViewById(R.id.inhaltContainer);
		tv.setText(ausgabeText);

		Log.i("Unterpunkt", String.valueOf(menuepunktID));
	}
}
