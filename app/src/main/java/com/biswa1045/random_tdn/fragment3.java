package com.biswa1045.random_tdn;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.Random;

public class fragment3 extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_layout3,container,false);
        final Random myrandom  = new Random();
        final Random myrandom2  = new Random();
        Button button=(Button) view.findViewById(R.id.random_btn);
        Button button2=(Button) view.findViewById(R.id.random_btn2);
        TextView ran=(TextView) view.findViewById(R.id.random_text);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ran.setText(String.valueOf(myrandom.nextInt(10)));
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ran.setText(String.valueOf(myrandom2.nextInt(100)));
            }
        });
        return view;
    }
}
