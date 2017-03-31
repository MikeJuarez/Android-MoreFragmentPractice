package com.michaeljuarez.morefragmentpractice;


import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.attr.id;
import static android.R.attr.label;

public class Fragment1 extends Fragment implements Button.OnClickListener{

    private Button mButton;
    private OnFragmentInteractionListener1 mListener;
    private View view;
    private EditText editText1;
    private TextView label;


    public Fragment1() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            mListener = (OnFragmentInteractionListener1) activity;
        }
        catch (ClassCastException e) {
            throw new ClassCastException(activity.toString() + " must implement OnFragmentInteraction Listener");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_fragment1, container, false);
        label = (TextView) view.findViewById(R.id.textView3);
        editText1 = (EditText) view.findViewById(R.id.textView2);
        mButton = (Button) view.findViewById(R.id.button1);
        mButton.setOnClickListener(this);

        return view;
    }

    public void onClick(View v) {
        mListener.onFragmentInteraction1(editText1.getText().toString());
    }

    public interface OnFragmentInteractionListener1 {
        public void onFragmentInteraction1(String uri);
    }

    public void setLabel(String text){
        label.setText(text);
    }


}
