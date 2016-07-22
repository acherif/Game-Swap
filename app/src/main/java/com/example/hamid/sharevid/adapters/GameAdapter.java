package com.example.hamid.sharevid.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hamid.sharevid.R;
import com.example.hamid.sharevid.model.GameObject;
import com.example.hamid.sharevid.viewHolders.GameViewHolders;

import java.util.List;

/**
 * Created by hamid on 26/06/2016.
 */
public class GameAdapter extends RecyclerView.Adapter<GameViewHolders> {
    private List<GameObject> itemList;
    private Context context;

    public GameAdapter(Context context, List<GameObject> itemList){
        this.itemList = itemList;
        this.context = context;
    }
    @Override
    public GameViewHolders onCreateViewHolder(ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.game_list, null);
        GameViewHolders gvh = new GameViewHolders(layoutView, context);
        gvh.setGameAdapter(this);
        return gvh;
    }

    @Override
    public void onBindViewHolder(GameViewHolders holder, int position) {
        holder.getGameName().setText(itemList.get(position).getName());
        holder.getGameState().setText(itemList.get(position).getState());
        holder.getGamePhoto().setImageResource(itemList.get(position).getPhoto());
    }

    @Override
    public int getItemCount() {
        return this.itemList.size();
    }
}
