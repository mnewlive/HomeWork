package ru.topjunior.homework;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;


public class Withdraw extends Fragment {
 public    EditText et;

    /*public interface onSomeEventListener {
        public void someEvent(String s);
    }

    onSomeEventListener someEventListener;

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            someEventListener = (onSomeEventListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString() + " must implement onSomeEventListener");
        }
    }*/

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
      final  View v = inflater.inflate(R.layout.fragment_withdraw, null);
        et = (EditText) v.findViewById(R.id.vida4a);
        v.findViewById(R.id.ppDone).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v1) {


//              String text = ((MainActivity) getActivity()).fragment_add_money.tv.getText().toString();
                CharSequence text = "Ваши наличные";
                Toast.makeText(getActivity(), text, Toast.LENGTH_LONG).show();

                int balance = Integer.parseInt(et.getText().toString());

                mNominals = getNominals(balance, mNominals);

                LinearLayout viewById = (LinearLayout)v.findViewById(R.id.llAdd);
                viewById.removeAllViews();
                TextView textView = new TextView(getActivity());
                textView.setText("Balance:" + balance);
                        viewById.addView(textView);


                for (int i = 0; i < mNominals[0].length; i++) {
                    textView = new TextView(getActivity());
                    if (mNominals [1][i] > 0) textView.setText("Nominals " + mNominals[0][i] + " x " + mNominals[1][i]);
                    viewById.addView(textView);
                }
            }
        });

        Button button = (Button) v.findViewById(R.id.button);
        button.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
//                someEventListener.someEvent("тест");
            }
        });

        return v;
    }


    int mNominals[][] = {{100,50,10,5,1},{0,0,0,0,0}};

    int[][] getNominals (int balance, int[][] nominals) {

        for (int i = 0 ; i < nominals[0].length; i++ ) {
            nominals[1][i] = balance / nominals[0][i];
            balance = balance % nominals[0][i];
        }
        return nominals;
    }
}