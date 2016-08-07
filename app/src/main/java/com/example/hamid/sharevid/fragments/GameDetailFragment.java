package com.example.hamid.sharevid.fragments;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.hamid.sharevid.R;
import com.example.hamid.sharevid.model.GameObject;
import com.example.hamid.sharevid.utils.ImageHelper;

import static com.example.hamid.sharevid.model.GameObject.getListItemData;

/**
 * Created by hamid on 27/06/2016.
 */
public class GameDetailFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.game_detail_fragment, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RelativeLayout gameDetailView = (RelativeLayout) view.findViewById(R.id.game_detail);
        GameObject game = getListItemData().get(getArguments().getInt("Game"));


        TextView gameName = (TextView) gameDetailView.findViewById(R.id.game_name);
        gameName.setText(game.getName());
        TextView gameYear = (TextView) gameDetailView.findViewById(R.id.game_year);
        gameYear.setText(String.valueOf(game.getYear()));
        TextView gameStyle = (TextView) gameDetailView.findViewById(R.id.game_style);
        gameStyle.setText(game.getStyle());
        TextView gameState = (TextView) gameDetailView.findViewById(R.id.game_state);
        gameState.setText(game.getState());
        ImageView gamePhoto = (ImageView) gameDetailView.findViewById(R.id.game_photo);
        gamePhoto.setImageResource(game.getPhoto());
//        Bitmap image = BitmapFactory.decodeResource(getContext().getResources(), game.getPhoto());
//        gamePhoto.setImageBitmap(ImageHelper.getRoundedCornerBitmap(image, 60));
        TextView gameDescription = (TextView) gameDetailView.findViewById(R.id.game_description);
        gameDescription.setText(game.getDescription());

    }
}
