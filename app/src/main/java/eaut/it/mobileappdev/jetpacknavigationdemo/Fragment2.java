package eaut.it.mobileappdev.jetpacknavigationdemo;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Fragment2 extends Fragment {

    public Fragment2() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_2, container, false);

        Button btn = view.findViewById(R.id.button2);
        btn.setOnClickListener(v -> Navigation.findNavController(v).navigate(R.id.action_fragment2_to_fragment1));

        return view;
    }
}