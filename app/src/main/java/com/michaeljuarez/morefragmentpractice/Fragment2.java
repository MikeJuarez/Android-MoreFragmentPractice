package com.michaeljuarez.morefragmentpractice;


import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Fragment2 extends Fragment implements View.OnClickListener{

    private View view;
    private TextView label;
    private EditText editText2;
    private Button mButton2;
    private OnFragmentInteractionListener2 mListener;

    public Fragment2() {
        // Required empty public constructor
    }
    public void onAttach(Activity activity){
        super.onAttach(activity);

        try {
            mListener = (OnFragmentInteractionListener2) activity;
        }
        catch (ClassCastException e) {
            throw new ClassCastException(activity.toString() + " must implement OnFragmentInteraction Listener");
        }

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_fragment2, container, false);
        label = (TextView) view.findViewById(R.id.textView4);
        editText2 = (EditText) view.findViewById(R.id.textView);

        mButton2 = (Button) view.findViewById(R.id.button2);
        mButton2.setOnClickListener(this);

        return view;
    }

    public void onClick(View v){
        mListener.onFragmentInteraction2(editText2.getText().toString());
    }

    public void setLabel(String text){
        label.setText(text);
    }

    public interface OnFragmentInteractionListener2 {
        public void onFragmentInteraction2(String uri);
    }



}
