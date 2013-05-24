package org.teo.abstest;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;

import com.actionbarsherlock.app.ActionBar.Tab;

public class TabListener<T extends Fragment> implements com.actionbarsherlock.app.ActionBar.TabListener	{
	private final Activity mActivity;
	private final String mTag;
	private final Class<T> mClass;
	private Fragment mFragment;

	// Constructor *********
	   public TabListener(Activity activity, String tag, Class<T> cls) {  
		     mActivity = activity;  
		     mTag = tag;  
		     mClass = cls;  
		   }  
	
		   /* The following are each of the ActionBar.TabListener callbacks */  
		   public void onTabSelected(Tab tab, FragmentTransaction ft) {  
		     // Check if the fragment is already initialized  
			     if (mFragment == null) {  
			       // If not, instantiate and add it to the activity  
			       mFragment = Fragment.instantiate(mActivity, mClass.getName()); 
			       ft.add(android.R.id.content, mFragment, mTag);
			       //ft.add(android.R.id.content, mFragment, mTag);  
			     } else {  
			       // If it exists, simply attach it in order to show it  
			       ft.attach(mFragment);  
			     }  
		   }  
		
			@Override
			public void onTabUnselected(Tab tab, FragmentTransaction ft) {
			    if (mFragment != null) {  
			        // Detach the fragment, because another one is being attached  
			        ft.detach(mFragment);  
			    }  
			}
		
			@Override
			public void onTabReselected(Tab tab, FragmentTransaction ft) {
				// TODO Auto-generated method stub
			}
}


