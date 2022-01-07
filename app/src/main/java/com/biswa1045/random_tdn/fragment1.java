package com.biswa1045.random_tdn;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.Random;

public class fragment1 extends Fragment {
    Button coin_btn;
    ImageView coin_img;
    int rn;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_layout,container,false);
        ImageView coin;
        Random r = new Random();

        coin_btn=view.findViewById(R.id.coin_btn);
        coin_img=view.findViewById(R.id.coin_img);
        coin_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rn=r.nextInt(2);
                if(rn==0)
                {
                    coin_img.setImageResource(R.drawable.head);
                }else
                {
                    coin_img.setImageResource(R.drawable.tail);
                }
                RotateAnimation rotate=new RotateAnimation(0,360,RotateAnimation.RELATIVE_TO_SELF,0.5f,RotateAnimation.RELATIVE_TO_SELF,0.5f);
                rotate.setDuration(1000);
                coin_img.startAnimation(rotate);



            }
        });


        return view;
    }

}
