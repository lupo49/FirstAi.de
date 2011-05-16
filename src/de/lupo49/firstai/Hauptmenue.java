package de.lupo49.firstai;

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
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        TextView menuepunkt = (TextView)findViewById(R.id.HaftungHinweise);
        menuepunktAusgewaehlt = new Intent(this, Unterpunkt.class);
        
        
        menuepunkt.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				menuepunktAusgewaehlt.putExtra("quelle", v.getId());
				Log.i("Hauptmenue", String.valueOf(v.getId()));
				startActivity(menuepunktAusgewaehlt);
			}
		});
        
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