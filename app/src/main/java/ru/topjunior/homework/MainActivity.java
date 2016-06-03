package ru.topjunior.homework;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;

public class MainActivity extends Activity {

    public AddMoney fragment1;
    public Withdraw fragment2;

//    public CheckCont fragment3;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragment1 = (AddMoney) getFragmentManager().findFragmentById(R.id.fragment1);


        Fragment frag2 = new Withdraw();
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        ft.add(R.id.fragment2, frag2);
        ft.commit();

        fragment2 = (Withdraw) frag2;
    }

    /*@Override
    public void someEvent(String s) {
        Fragment frag2 = getFragmentManager().findFragmentById(R.id.fragment2);
        ((TextView)frag2.getView().findViewById(R.id.textView)).setText("Номиналы x количество " + s);
    }
*/

}
