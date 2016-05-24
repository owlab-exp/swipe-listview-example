package com.owlab.swipelistviewsample;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

/**
 * Created by ernest on 5/24/16.
 */
public class PlayListFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.audio_object_list_layout, container, false);
        return view;
    }

    @Override
    public void onViewCreated(final View view, Bundle savedInstanceState) {
        ListView playListView = (ListView)view.findViewById(R.id.audioObjectListView);
        PlayListObjectAdapter playListObjectAdapter = new PlayListObjectAdapter(getActivity(), R.layout.audio_object_layout);
        //Sample audio objects
        playListObjectAdapter.add(new AudioObject());
        playListObjectAdapter.add(new AudioObject());

        playListView.setAdapter(playListObjectAdapter);
        playListObjectAdapter.setListView(playListView);

    }
}
