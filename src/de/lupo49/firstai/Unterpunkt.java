package de.lupo49.firstai;

import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
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
			case R.id.HaftungHinweise: // 0
				ausgabeText = this.getString(R.string.HaftungHinweiseContent);
				ueberschriftText = this.getString(R.string.HaftungHinweise);
				break;
			case R.id.Allgemeines: // 2
				ausgabeText = this.getString(R.string.AllgemeinesContent);
				ueberschriftText = this.getString(R.string.Allgemeines);
				break;
			case R.id.AllergischeReaktion: // 3
				ausgabeText = this.getString(R.string.AllergischeReaktionContent);
				ueberschriftText = this.getString(R.string.AllergischeReaktion);
				break;
			case R.id.Amputation: // 4
				ausgabeText = this.getString(R.string.AmputationContent);
				ueberschriftText = this.getString(R.string.Amputation);
				break;
			case R.id.AsthmaAtemnot: // 5
				ausgabeText = this.getString(R.string.AsthmaAtemnotContent);
				ueberschriftText = this.getString(R.string.AsthmaAtemnot);
				break;
			case R.id.Atemstillstand: // 6
				ausgabeText = this.getString(R.string.AtemstillstandContent);
				ueberschriftText = this.getString(R.string.Atemstillstand);
				break;
			case R.id.AtmungPruefen: // 7
				ausgabeText = this.getString(R.string.AtmungPruefenContent);
				ueberschriftText = this.getString(R.string.AtmungPruefen);
				break;
			case R.id.Augenverletzung: // 8
				ausgabeText = this.getString(R.string.AugenverletzungContent);
				ueberschriftText = this.getString(R.string.Augenverletzung);
				break;
			case R.id.Augenveraetzung: // 9
				ausgabeText = this.getString(R.string.AugenveraetzungContent);
				ueberschriftText = this.getString(R.string.Augenveraetzung);
				break;
			case R.id.Beatmung: // 10
				ausgabeText = this.getString(R.string.BeatmungContent);
				ueberschriftText = this.getString(R.string.Beatmung);
				break;
			case R.id.BewusstlosigkeitMitAtmung: // 11
				ausgabeText = this.getString(R.string.BewusstlosigkeitMitAtmungContent);
				ueberschriftText = this.getString(R.string.BewusstlosigkeitMitAtmung);
				break;
			case R.id.BewusstlosigkeitOhneAtmung: // 12
				ausgabeText = this.getString(R.string.BewusstlosigkeitOhneAtmungContent);
				ueberschriftText = this.getString(R.string.BewusstlosigkeitOhneAtmung);
				break;
			case R.id.BlutungLeicht: // 13
				ausgabeText = this.getString(R.string.BlutungLeichtContent);
				ueberschriftText = this.getString(R.string.BlutungLeicht);
				break;
			case R.id.BlutungSchwer: // 14
				ausgabeText = this.getString(R.string.BlutungSchwerContent);
				ueberschriftText = this.getString(R.string.BlutungSchwer);
				break;
			case R.id.DiabetischesKoma: // 15
				ausgabeText = this.getString(R.string.DiabetischesKomaContent);
				ueberschriftText = this.getString(R.string.DiabetischesKoma);
				break;
			case R.id.Durchfall: // 16
				ausgabeText = this.getString(R.string.DurchfallContent);
				ueberschriftText = this.getString(R.string.Durchfall);
				break;
			case R.id.Eisunfall: // 17
				ausgabeText = this.getString(R.string.EisunfallContent);
				ueberschriftText = this.getString(R.string.Eisunfall);
				break;
			case R.id.Elektrounfall: // 18
				ausgabeText = this.getString(R.string.ElektrounfallContent);
				ueberschriftText = this.getString(R.string.Elektrounfall);
				break;
			case R.id.EpileptischerAnfall: // 19
				ausgabeText = this.getString(R.string.EpileptischerAnfallContent);
				ueberschriftText = this.getString(R.string.EpileptischerAnfall);
				break;
			case R.id.Erbrechen: // 20
				ausgabeText = this.getString(R.string.ErbrechenContent);
				ueberschriftText = this.getString(R.string.Erbrechen);
				break;
			case R.id.ErfrierungLeicht: // 21
				ausgabeText = this.getString(R.string.ErfrierungLeichtContent);
				ueberschriftText = this.getString(R.string.ErfrierungLeicht);
				break;
			case R.id.ErfrierungStark: // 22
				ausgabeText = this.getString(R.string.ErfrierungStarkContent);
				ueberschriftText = this.getString(R.string.ErfrierungStark);
				break;
			case R.id.Ersticken: // 23
				ausgabeText = this.getString(R.string.ErstickenContent);
				ueberschriftText = this.getString(R.string.Ersticken);
				break;
			case R.id.Ertrinken: // 24
				ausgabeText = this.getString(R.string.ErtrinkenContent);
				ueberschriftText = this.getString(R.string.Ertrinken);
				break;
			case R.id.Geburt: // 25
				ausgabeText = this.getString(R.string.GeburtContent);
				ueberschriftText = this.getString(R.string.Geburt);
				break;
			case R.id.GefahrenzoneRetten: // 26
				ausgabeText = this.getString(R.string.GefahrenzoneRettenContent);
				ueberschriftText = this.getString(R.string.GefahrenzoneRetten);
				break;
			case R.id.Gehirnerschuetterung: // 27
				ausgabeText = this.getString(R.string.GehirnerschuetterungContent);
				ueberschriftText = this.getString(R.string.Gehirnerschuetterung);
				break;
			case R.id.Herzdruckmassage: // 28
				ausgabeText = this.getString(R.string.HerzdruckmassageContent);
				ueberschriftText = this.getString(R.string.Herzdruckmassage);
				break;
			case R.id.Herzinfarkt: // 29
				ausgabeText = this.getString(R.string.HerzinfarktContent);
				ueberschriftText = this.getString(R.string.Herzinfarkt);
				break;
			case R.id.Hitzschlag: // 30
				ausgabeText = this.getString(R.string.HitzschlagContent);
				ueberschriftText = this.getString(R.string.Hitzschlag);
				break;
			case R.id.Insektenstich: // 31
				ausgabeText = this.getString(R.string.InsektenstichContent);
				ueberschriftText = this.getString(R.string.Insektenstich);
				break;
			case R.id.Knochenbruch: // 32
				ausgabeText = this.getString(R.string.KnochenbruchContent);
				ueberschriftText = this.getString(R.string.Knochenbruch);
				break;
			case R.id.Nasenbluten: // 33
				ausgabeText = this.getString(R.string.NasenblutenContent);
				ueberschriftText = this.getString(R.string.Nasenbluten);
				break;
			case R.id.Notruf: // 34
				ausgabeText = this.getString(R.string.NotrufContent);
				ueberschriftText = this.getString(R.string.Notruf);
				break;
			case R.id.Reanimation: // 35
				ausgabeText = this.getString(R.string.ReanimationContent);
				ueberschriftText = this.getString(R.string.Reanimation);
				break;
			case R.id.Rueckenverletzung: // 36
				ausgabeText = this.getString(R.string.RueckenverletzungContent);
				ueberschriftText = this.getString(R.string.Rueckenverletzung);
				break;
			case R.id.Schaedelbasisbruch: // 37
				ausgabeText = this.getString(R.string.SchaedelbasisbruchContent);
				ueberschriftText = this.getString(R.string.Schaedelbasisbruch);
				break;
			case R.id.Schlaganfall: // 38
				ausgabeText = this.getString(R.string.SchlaganfallContent);
				ueberschriftText = this.getString(R.string.Schlaganfall);
				break;
			case R.id.Schlangenbiss: // 39
				ausgabeText = this.getString(R.string.SchlangenbissContent);
				ueberschriftText = this.getString(R.string.Schlangenbiss);
				break;
			case R.id.Schock: // 40
				ausgabeText = this.getString(R.string.SchockContent);
				ueberschriftText = this.getString(R.string.Schock);
				break;
			case R.id.Sonnenbrand: // 41
				ausgabeText = this.getString(R.string.SonnenbrandContent);
				ueberschriftText = this.getString(R.string.Sonnenbrand);
				break;
			case R.id.Sonnenstich: // 42
				ausgabeText = this.getString(R.string.SonnenstichContent);
				ueberschriftText = this.getString(R.string.Sonnenstich);
				break;
			case R.id.SOS: // 43
				ausgabeText = this.getString(R.string.SOSContent);
				ueberschriftText = this.getString(R.string.SOS);
				break;
			case R.id.StabileSeitenlage: // 44
				ausgabeText = this.getString(R.string.StabileSeitenlageContent);
				ueberschriftText = this.getString(R.string.StabileSeitenlage);
				break;
			case R.id.Tierbiss: // 45
				ausgabeText = this.getString(R.string.TierbissContent);
				ueberschriftText = this.getString(R.string.Tierbiss);
				break;
			case R.id.Ueberhitzung: // 46
				ausgabeText = this.getString(R.string.UeberhitzungContent);
				ueberschriftText = this.getString(R.string.Ueberhitzung);
				break;
			case R.id.Ueberzuckerung: // 47
				ausgabeText = this.getString(R.string.UeberzuckerungContent);
				ueberschriftText = this.getString(R.string.Ueberzuckerung);
				break;
			case R.id.UnfallstelleSichern: // 48
				ausgabeText = this.getString(R.string.UnfallstelleSichernContent);
				ueberschriftText = this.getString(R.string.UnfallstelleSichern);
				break;
			case R.id.Unterkuehlung: // 49
				ausgabeText = this.getString(R.string.UnterkuehlungContent);
				ueberschriftText = this.getString(R.string.Unterkuehlung);
				break;
			case R.id.Unterzuckerung: // 50
				ausgabeText = this.getString(R.string.UnterzuckerungContent);
				ueberschriftText = this.getString(R.string.Unterzuckerung);
				break;
			case R.id.Veraetzung: // 51
				ausgabeText = this.getString(R.string.VeraetzungContent);
				ueberschriftText = this.getString(R.string.Veraetzung);
				break;
			case R.id.VerbrennungLeicht: // 52
				ausgabeText = this.getString(R.string.VerbrennungLeichtContent);
				ueberschriftText = this.getString(R.string.VerbrennungLeicht);
				break;
			case R.id.VerbrennungSchwer: // 53
				ausgabeText = this.getString(R.string.VerbrennungSchwerContent);
				ueberschriftText = this.getString(R.string.VerbrennungSchwer);
				break;
			case R.id.Vergiftung: // 54
				ausgabeText = this.getString(R.string.VergiftungContent);
				ueberschriftText = this.getString(R.string.Vergiftung);
				break;
			case R.id.Verkehrsunfall: // 55
				ausgabeText = this.getString(R.string.VerkehrsunfallContent);
				ueberschriftText = this.getString(R.string.Verkehrsunfall);
				break;
			case R.id.Verschlucken: // 56
				ausgabeText = this.getString(R.string.VerschluckenContent);
				ueberschriftText = this.getString(R.string.Verschlucken);
				break;
			case R.id.VerstauchungVerrenkung: // 57
				ausgabeText = this.getString(R.string.VerstauchungVerrenkungContent);
				ueberschriftText = this.getString(R.string.VerstauchungVerrenkung);
				break;
			case R.id.Wiederbelebung: // 58
				ausgabeText = this.getString(R.string.WiederbelebungContent);
				ueberschriftText = this.getString(R.string.Wiederbelebung);
				break;
			case R.id.Wirbelsaeule: // 59
				ausgabeText = this.getString(R.string.WirbelsaeuleContent);
				ueberschriftText = this.getString(R.string.Wirbelsaeule);
				break;
			case R.id.dashPlaceholder: // 60
				ausgabeText = this.getString(R.string.dashPlaceholderContent);
				ueberschriftText = this.getString(R.string.dashPlaceholder);
				break;
			case R.id.Notruf112Waehlen: // 61
				ausgabeText = this.getString(R.string.Notruf112WaehlenContent);
				ueberschriftText = this.getString(R.string.Notruf112Waehlen);
				break;
				
			// Inhaltspunkte fuer die "Notrufe weltweit"-Unterpunkte
			case R.id.tvNotrufeWeltweitAfrika:
				ausgabeText = this.getString(R.string.NotrufeWeltweitAfrikaContent);
				ueberschriftText = this.getString(R.string.NotrufeWeltweitAfrika);
				break;
			case R.id.tvNotrufeWeltweitAsien:
				ausgabeText = this.getString(R.string.NotrufeWeltweitAsienContent);
				ueberschriftText = this.getString(R.string.NotrufeWeltweitAsien);
				break;
			case R.id.tvNotrufeWeltweitEuropa:
				ausgabeText = this.getString(R.string.NotrufeWeltweitEuropaContent);
				ueberschriftText = this.getString(R.string.NotrufeWeltweitEuropa);
				break;
			case R.id.tvNotrufeWeltweitNZAmerika:
				ausgabeText = this.getString(R.string.NotrufeWeltweitNZAmerikaContent);
				ueberschriftText = this.getString(R.string.NotrufeWeltweitNZAmerika);
				break;
			case R.id.tvNotrufeWeltweitOzeanien:
				ausgabeText = this.getString(R.string.NotrufeWeltweitOzeanienContent);
				ueberschriftText = this.getString(R.string.NotrufeWeltweitOzeanien);
				break;
			case R.id.tvNotrufeWeltweitSuedamerika:
				ausgabeText = this.getString(R.string.NotrufeWeltweitSuedamerikaContent);
				ueberschriftText = this.getString(R.string.NotrufeWeltweitSuedamerika);
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
		
		bilderHinzufuegen(menuepunktID);
	}
	
	// Fuer einige Punkte sind Bilder vorhandenen.
	// Hier erfolgt das Mapping zwischen Menuepunkten und Bildern.
	public void bilderHinzufuegen(int menuepunkt) {
		/*
		 * Menuepunkt(e)	->	Bilder
		 * 6, 10				aid067, aid010, aid011
		 * 36, 59				aid065
		 * 25					aid025, aid022, aid023
		 * 9					aid019
		 * 13					aid084, aid085
		 * 13					aid084, aid085
		 * 14					aid084, aid085, aid085, aid092
		 * 27					aid061
		 * 26					aid001
		 * 24					aid034
		 * 18					aid045
		 * 19					aid058
		 * 32					aid107
		 * 29					aid061
		 * 17					aid041
		 * 44					aid008, aid009, <TEXT>, aid028
		 * 28					aid013, aid003, aid067, aid010, aid011, aid012, <TEXT>, aid029, <TEXT>, aid030
		 * 48, 55				aid001
		 * 23, 56				aid031, aid069
		 * 42					aid061
		 * 11					aid008, aid009
		 * 12, 24, 29, 37, 38, 40, 54		aid013, aid003, aid067, aid010, aid011, aid012
		 * 18, 49				aid003, aid067, aid010, aid011
		 * 42, 5, 50			aid010, 011 	
		 */
	}
}
