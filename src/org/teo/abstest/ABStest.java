package org.teo.abstest;

import android.os.Bundle;

import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.SherlockFragmentActivity;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;

public class ABStest extends SherlockFragmentActivity  {
    
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//setContentView(R.layout.activity_abstest); 		// no point for layout...
		
		
		ActionBar actionbar = getSupportActionBar();
		actionbar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
		
		actionbar.addTab(actionbar.newTab()
				.setText("TAB 1")
				.setTabListener(new TabListener<Fragment_1>(this, "tab1",  Fragment_1.class)));  
		
		actionbar.addTab(actionbar.newTab()
				.setText("TAB 2")
				.setTabListener(new TabListener<Fragment_2>(this, "tab2",  Fragment_2.class)));  
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getSupportMenuInflater().inflate(R.menu.menu_abstest , menu);		//getSupportMenuInflater() ---> γτ ειναι Sherlock 
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		int id = item.getItemId();
		if ( id == R.id.menu_settings ) {
			return true;
		} else if(id == R.id.menu_load ) {
			return true;
		} else return super.onOptionsItemSelected(item);
	
	}


}
