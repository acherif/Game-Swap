package com.example.hamid.sharevid.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hamid.sharevid.R;
import com.example.hamid.sharevid.adapters.GameAdapter;
import com.example.hamid.sharevid.model.GameObject;

import java.util.List;

import static com.example.hamid.sharevid.model.GameObject.getListItemData;

/**
 * Created by hamid on 26/06/2016.
 */
public class GameFragment extends Fragment implements LoaderManager.LoaderCallbacks<List<GameObject>> {

    private GameAdapter gameAdapter;
    private StaggeredGridLayoutManager staggeredGridLayoutManager;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        return inflater.inflate(R.layout.game_fragment, container, false);

    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

//        FloatingActionButton fab = (FloatingActionButton) view.findViewById(R.id.myFAB);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toolbar toolbar = (Toolbar) v.findViewById(R.id.toolbar);
//                toolbar.setVisibility(View.VISIBLE);// show the searchbox and bla bla...
//            }
//        });
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);

        staggeredGridLayoutManager = new StaggeredGridLayoutManager(3, 1);
        recyclerView.setLayoutManager(staggeredGridLayoutManager);
        List<GameObject> staggeredList = getListItemData();

        gameAdapter = new GameAdapter(getActivity(), staggeredList);
        recyclerView.setAdapter(gameAdapter);
    }

    @Override
    public Loader<List<GameObject>> onCreateLoader(int id, Bundle args) {
        return null;
    }

    @Override
    public void onLoadFinished(Loader<List<GameObject>> loader, List<GameObject> data) {

    }

    @Override
    public void onLoaderReset(Loader<List<GameObject>> loader) {

    }
}
