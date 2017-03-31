package com.michaeljuarez.morefragmentpractice;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.widget.Toast;

import static com.michaeljuarez.morefragmentpractice.R.id.frag1;
import static com.michaeljuarez.morefragmentpractice.R.id.frag2;
import static com.michaeljuarez.morefragmentpractice.R.id.textView4;

public class MainActivity extends FragmentActivity implements Fragment1.OnFragmentInteractionListener1, Fragment2.OnFragmentInteractionListener2 {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.normal);
    }

    public void onFragmentInteraction1(String uri){
        Fragment2 frg2 = (Fragment2) getSupportFragmentManager().findFragmentById(frag2);
        frg2.setLabel(uri);
    }

    public void onFragmentInteraction2(String uri){
        Fragment1 frg1 = (Fragment1) getSupportFragmentManager().findFragmentById(frag1);
        frg1.setLabel(uri);
    }


}
