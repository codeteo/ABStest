package org.teo.abstest;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Fragment_2 extends Fragment {
	  
	
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
    	
        View view = inflater.inflate( R.layout.fragment_2 , container, false);

        return view;			//returns view
    }
    
    
    // ********** declare INTERFACE ***************** //

}