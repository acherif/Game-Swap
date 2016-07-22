package com.example.hamid.sharevid.viewHolders;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.hamid.sharevid.R;
import com.example.hamid.sharevid.activities.GameDetailActivity;
import com.example.hamid.sharevid.adapters.GameAdapter;

/**
 * Created by hamid on 26/06/2016.
 */
public class GameViewHolders extends RecyclerView.ViewHolder implements View.OnClickListener {

    private TextView gameName;
    private TextView gameState;
    private ImageView gamePhoto;
private Context context;
    private GameAdapter gameAdapter;
    public GameViewHolders(View itemView, Context context){
        super(itemView);
        itemView.setOnClickListener(this);
        this.gameName = (TextView) itemView.findViewById(R.id.game_name);
        this.gameState = (TextView) itemView.findViewById(R.id.game_state);
        this.gamePhoto = (ImageView) itemView.findViewById(R.id.game_photo);
        this.context = context;
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(itemView.getContext(), "Clicked Position = " + getPosition(), Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(context, GameDetailActivity.class);
        intent.putExtra("Game", getPosition());
        context.startActivity(intent);
    }

    public TextView getGameState() {
        return gameState;
    }

    public void setGameState(TextView gameState) {
        this.gameState = gameState;
    }

    public TextView getGameName() {
        return gameName;
    }

    public void setGameName(TextView gameName) {
        this.gameName = gameName;
    }

    public ImageView getGamePhoto() {
        return gamePhoto;
    }

    public void setGamePhoto(ImageView gamePhoto) {
        this.gamePhoto = gamePhoto;
    }

    public void setGameAdapter(GameAdapter gameAdapter) {
        this.gameAdapter = gameAdapter;
    }
}
