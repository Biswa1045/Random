package com.biswa1045.random_tdn;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.Random;

public class fragment2 extends Fragment {
    Animation rotateAnimation;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_layout2,container,false);
        ImageView diceImage;
        Random randomm = new Random();
        diceImage = view.findViewById(R.id.dice);

        diceImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int i = randomm.nextInt(5)+1;
                rotateAnimation = new RotateAnimation(
                        0,
                        720,
                        Animation.RELATIVE_TO_SELF,
                        0.5f,
                        Animation.RELATIVE_TO_SELF,
                        0.5f);

                rotateAnimation.setDuration(500);
                diceImage.startAnimation(rotateAnimation);
                //  Animation anim = AnimationUtils.loadAnimation(this, R.anim.rotate);
                //  diceImage.startAnimation(anim);
                switch (i){
                    case 1:
                        diceImage.setImageResource(R.drawable.dice1);
                        break;
                    case 2:
                        diceImage.setImageResource(R.drawable.dice2);
                        break;
                    case 3:
                        diceImage.setImageResource(R.drawable.dice3);
                        break;
                    case 4:
                        diceImage.setImageResource(R.drawable.dice4);
                        break;
                    case 5:
                        diceImage.setImageResource(R.drawable.dice5);
                        break;
                    case 6:
                        diceImage.setImageResource(R.drawable.dice6);
                        break;
                }
            }
        });
        return view;
    }

}
