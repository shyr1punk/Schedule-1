package ru.mstuca.fragments;

import ru.mstuca.MainActivity;
import ru.mstuca.R;
import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TabHost;

public class SearchFragment extends BaseFragment {

	public static SearchFragment newInstance() {
		SearchFragment fragment = new SearchFragment();
		return fragment;
	}

	public SearchFragment() {
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.search_fragment_tabs, container, false);

		TabHost tabHost = (TabHost) rootView.findViewById(android.R.id.tabhost);
		tabHost.setup();

		TabHost.TabSpec tabSpec;

		tabSpec = tabHost.newTabSpec("tag1");
		tabSpec.setIndicator(null, getResources().getDrawable(R.drawable.ic_action_group));
		tabSpec.setContent(R.id.tab1);
		tabHost.addTab(tabSpec);

		tabSpec = tabHost.newTabSpec("tag2");
		tabSpec.setIndicator(null, getResources().getDrawable(R.drawable.ic_action_teacher));
		tabSpec.setContent(R.id.tab2);
		tabHost.addTab(tabSpec);

		ListView listView1 = (ListView) rootView.findViewById(R.id.tab1);
		ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, new String[] { "��� 1-1",
				"��� 1-2", "��� 1-3", "��� 1-4", "��� 1-5", "��� 1-6", "��� 1-7", "��� 1-8", "��� 1-9", "��� 1-10", "��� 1-11", "��� 1-12" });
		listView1.setAdapter(adapter1);

		ListView listView2 = (ListView) rootView.findViewById(R.id.tab2);
		ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, new String[] { "������� 1-1",
				"������� 1-2", "������� 1-3", "������� 1-4", "������� 1-5", "������� 1-6", "������� 1-7", "������� 1-8", "������� 1-9",
				"������� 1-10", "������� 1-11", "������� 1-12" });
		listView2.setAdapter(adapter2);

		return rootView;
	}

}
