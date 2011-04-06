package de.lupo49.firstai;

import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;

public class Hauptmenue extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        
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