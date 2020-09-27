package com.example.kazeemodukale_comp304lab1;

import android.content.Intent;
import android.os.Bundle;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.fragment.app.ListFragment;


public class TopFragment extends ListFragment {

    String[] activities = getResources().getStringArray(R.array.activities);
    //String[] activities = { "AIActivity", "VRActivity" };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_top, container, false);

        ListView lstView = getListView();

        lstView.setChoiceMode(ListView.CHOICE_MODE_NONE);
        lstView.setTextFilterEnabled(true);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, activities);
        //bind the list view with array adapter
        setListAdapter(adapter);

        return view;
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        Intent intent = null;
        switch (position) {
            case 0:
                intent = new Intent(getContext(), AIActivity.class);
                intent.putExtra("text", activities[0]);
                break;
            case 1:
                intent = new Intent(getContext(), VRActivity.class);
                intent.putExtra("text", activities[1]);
                break;
            default:
        }
        startActivity(intent);
    }
}