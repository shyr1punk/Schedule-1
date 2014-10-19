package ru.mstuca.fragments;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.os.Bundle;

public class BaseFragment extends Fragment implements OnSharedPreferenceChangeListener {

	protected Context mContext;

	// protected AsipApplication mApp;
	// protected FragmentActivity mActivity;

	@Override
	public void onAttach(Activity activity) {
		super.onAttach(activity);
		this.mContext = activity.getApplicationContext();
		// this.mApp = (AsipApplication) activity.getApplication();
		// this.mActivity = (FragmentActivity) activity;
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setRetainInstance(true);

		// TODO or mb an mActivity?
		// mContext.getSharedPreferences(AsipPreferences.APP_SHARED_PREFERENCES, 0).registerOnSharedPreferenceChangeListener(this);
	}

	@Override
	public void onDestroy() {
		super.onDestroy();
		// mContext.getSharedPreferences(AsipPreferences.APP_SHARED_PREFERENCES, 0).unregisterOnSharedPreferenceChangeListener(this);
	}

	@Override
	public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String key) {
		// Empty. For override method;
	}
}
