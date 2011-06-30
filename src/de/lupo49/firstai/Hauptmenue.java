package de.lupo49.firstai;

import java.util.Vector;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class Hauptmenue extends Activity {
    
	private Intent menuepunktAusgewaehlt;
	private Intent notrufeWeltweit;
	private TextView menuepunkt;
	private Vector<Integer> menuepunkte = new Vector<Integer>();
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hauptmenue);
        
        menuepunkte.add(R.id.HaftungHinweise);
        menuepunkte.add(R.id.NotrufeWeltweit);
        menuepunkte.add(R.id.Allgemeines);
        menuepunkte.add(R.id.AllergischeReaktion);
        menuepunkte.add(R.id.Amputation);
        menuepunkte.add(R.id.AsthmaAtemnot);
        menuepunkte.add(R.id.Atemstillstand);
        menuepunkte.add(R.id.AtmungPruefen);
        menuepunkte.add(R.id.Augenverletzung);
        menuepunkte.add(R.id.Augenveraetzung);
        menuepunkte.add(R.id.Beatmung);
        menuepunkte.add(R.id.BewusstlosigkeitMitAtmung);
        menuepunkte.add(R.id.BewusstlosigkeitOhneAtmung);
        menuepunkte.add(R.id.BlutungLeicht);
        menuepunkte.add(R.id.BlutungSchwer);
        menuepunkte.add(R.id.DiabetischesKoma);
        menuepunkte.add(R.id.Durchfall);
        menuepunkte.add(R.id.Eisunfall);
        menuepunkte.add(R.id.Elektrounfall);
        menuepunkte.add(R.id.EpileptischerAnfall);
        menuepunkte.add(R.id.Erbrechen);
        menuepunkte.add(R.id.ErfrierungLeicht);
        menuepunkte.add(R.id.ErfrierungStark);
        menuepunkte.add(R.id.Ersticken);
        menuepunkte.add(R.id.Ertrinken);
        menuepunkte.add(R.id.Geburt);
        menuepunkte.add(R.id.GefahrenzoneRetten);
        menuepunkte.add(R.id.Gehirnerschuetterung);
        menuepunkte.add(R.id.Herzdruckmassage);
        menuepunkte.add(R.id.Herzinfarkt);
        menuepunkte.add(R.id.Hitzschlag);
        menuepunkte.add(R.id.Insektenstich);
        menuepunkte.add(R.id.Knochenbruch);
        menuepunkte.add(R.id.Nasenbluten);
        menuepunkte.add(R.id.Notruf);
        menuepunkte.add(R.id.Reanimation);
        menuepunkte.add(R.id.Rueckenverletzung);
        menuepunkte.add(R.id.Schaedelbasisbruch);
        menuepunkte.add(R.id.Schlaganfall);
        menuepunkte.add(R.id.Schlangenbiss);
        menuepunkte.add(R.id.Schock);
        menuepunkte.add(R.id.Sonnenbrand);
        menuepunkte.add(R.id.Sonnenstich);
        menuepunkte.add(R.id.SOS);
        menuepunkte.add(R.id.StabileSeitenlage);
        menuepunkte.add(R.id.Tierbiss);
        menuepunkte.add(R.id.Ueberhitzung);
        menuepunkte.add(R.id.Ueberzuckerung);
        menuepunkte.add(R.id.UnfallstelleSichern);
        menuepunkte.add(R.id.Unterkuehlung);
        menuepunkte.add(R.id.Unterzuckerung);
        menuepunkte.add(R.id.Veraetzung);
        menuepunkte.add(R.id.VerbrennungLeicht);
        menuepunkte.add(R.id.VerbrennungSchwer);
        menuepunkte.add(R.id.Vergiftung);
        menuepunkte.add(R.id.Verkehrsunfall);
        menuepunkte.add(R.id.Verschlucken);
        menuepunkte.add(R.id.VerstauchungVerrenkung);
        menuepunkte.add(R.id.Wiederbelebung);
        menuepunkte.add(R.id.Wirbelsaeule);
        menuepunkte.add(R.id.dashPlaceholder);
        menuepunkte.add(R.id.Notruf112Waehlen);

        menuepunktAusgewaehlt = new Intent(this, Unterpunkt.class);
        notrufeWeltweit = new Intent(this, NotrufeWeltweit.class);
        
        // Alle Menuepunkte eigene OnClickListener zuordnen, um die Detailseite aufzurufen
        for(int i = 0; i < menuepunkte.size(); i++) {
        	menuepunkt = (TextView)findViewById(menuepunkte.get(i));
        	menuepunkt.setOnClickListener(new OnClickListener() {
    			@Override
    			public void onClick(View v) {
    				if(v.getId() == R.id.NotrufeWeltweit) {
    	        		startActivity(notrufeWeltweit);
    	        	} else {
    	        		menuepunktAusgewaehlt.putExtra("quelle", v.getId());
    	        		startActivity(menuepunktAusgewaehlt);
    	        	}
    			}
    		});
        }
    }
    
    @Override
    public boolean onCreateOptionsMenu(android.view.Menu menu) {
    	menu.add(0, 1, android.view.Menu.NONE, "Test");
    	return super.onCreateOptionsMenu(menu);
    }
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
    	switch(item.getItemId()) {
    	case 1:
    		// FIXME
    		break;
    	}
    	
    	return super.onOptionsItemSelected(item);
    }
}