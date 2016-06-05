package ru.topjunior.homework;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class CheckCont extends Fragment {

    public EditText edt;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_check_cont, null);
        edt = (EditText) v.findViewById(R.id.vida4a);

        Button button = (Button) v.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ((Button)getActivity().findViewById(R.id.btnFind)).setText("Остаток на счёте:");

                CharSequence text = "Остаток на счёте";
                Toast.makeText(getActivity(), text, Toast.LENGTH_LONG).show();

            }
        });

        return v;
    }

}
