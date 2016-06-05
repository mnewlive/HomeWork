package ru.topjunior.homework;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class AddMoney extends Fragment {


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_add_money, null);

        final View lpan = v.findViewById(R.id.lpan);
        final View lpan1 = v.findViewById(R.id.lpan1);
        final TextView tv = (TextView) v.findViewById(R.id.test);
        final TextView tv1 = (TextView) v.findViewById(R.id.test1);

        v.findViewById(R.id.ppDone).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO check
                tv.setError("error");
                lpan1.setVisibility(View.VISIBLE);
            }
        });

        v.findViewById(R.id.ppDone1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int i = Integer.parseInt(tv.getText().toString());
                int i1 = Integer.parseInt(tv1.getText().toString());
                int res = i*i1;

                lpan.setVisibility(View.GONE);
                lpan1.setVisibility(View.GONE);

                ((MainActivity)getActivity()).fragment2.et.setText(String.valueOf(res));
                ((MainActivity)getActivity()).fragment3.edt.setText(String.valueOf(res));

                Toast.makeText(getActivity(), String.valueOf(res), Toast.LENGTH_LONG).show();


            }
        });

        v.findViewById(R.id.ppCancel).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                lpan.setVisibility(View.GONE);
            }
        });

        v.findViewById(R.id.ppCancel1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                lpan.setVisibility(View.GONE);
                lpan1.setVisibility(View.GONE);
            }
        });

        Button button = (Button) v.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ((Button)getActivity().findViewById(R.id.btnFind)).setText("Ваш баланс:");
                lpan.setVisibility(View.VISIBLE);
            }
        });

        return v;
    }
}
