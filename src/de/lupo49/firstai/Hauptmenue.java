package de.lupo49.firstai;

import java.util.Vector;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class Hauptmenue extends Activity {
    
	private Intent menuepunktAusgewaehlt;
	private TextView menuepunkt;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Vector<Integer> menuepunkte = new Vector<Integer>();
        menuepunkte.add(R.id.HaftungHinweise);
        menuepunkte.add(R.id.NotrufeWeltweit);
        menuepunkte.add(R.id.Allgemeines);
        menuepunkte.add(R.id.AllergischeReaktion);
        menuepunkte.add(R.id.Amputation);
        menuepunkte.add(R.id.AsthmaAtemnot);
        menuepunkte.add(R.id.Atemstillstand);
        
        menuepunktAusgewaehlt = new Intent(this, Unterpunkt.class);
        
        // Alle Menuepunkte eigene OnClickListener zuordnen, um die Detailseite aufzurufen
        for(int i = 0; i < menuepunkte.size(); i++) {
        	menuepunkt = (TextView)findViewById(menuepunkte.get(i));
        	menuepunkt.setOnClickListener(new OnClickListener() {
    			@Override
    			public void onClick(View v) {
    				menuepunktAusgewaehlt.putExtra("quelle", v.getId());
    				Log.i("Hauptmenue", String.valueOf(v.getId()));
    				startActivity(menuepunktAusgewaehlt);
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