package ru.topjunior.homework;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


public class CheckCont extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_check_cont, null);

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





       /* return inflater.inflate(R.layout.fragment_check_cont, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        Button button = (Button) getActivity().findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText = (EditText) getActivity().findViewById(R.id.text);
                TextView textView = (TextView) getActivity().findViewById(R.id.text);
                textView.setText(editText.getText());

            }
        });
    }
    */
}
