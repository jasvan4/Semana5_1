package com.example.semana5_1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class Fragment_recycler_view extends Fragment {
	
	
	
	@Override
	public View onCreateView ( LayoutInflater inflater, ViewGroup container,
	                           Bundle savedInstanceState ) {
		// Inflate the layout for this fragment
		return inflater.inflate (R.layout.fragment_recycler_view, container, false);
	}
}