package eaut.it.mobileappdev.jetpacknavigationdemo;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Fragment1 extends Fragment {

    public Fragment1() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_1, container, false);

        Button button = view.findViewById(R.id.button1);
        button.setOnClickListener(v -> Navigation.findNavController(v).navigate(R.id.action_fragment1_to_fragment2));
        return view;
    }
}