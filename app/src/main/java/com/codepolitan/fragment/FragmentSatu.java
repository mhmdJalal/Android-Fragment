package com.codepolitan.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentSatu extends Fragment {
    EditText etPanjang, etLebar;
    TextView tvHasil;
    Double panjang, lebar, hasil;
    Button btnHitung;


    public FragmentSatu() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_satu, container, false);

        etPanjang = v.findViewById(R.id.panjang);
        etLebar = v.findViewById(R.id.lebar);
        tvHasil = v.findViewById(R.id.hasil);
        btnHitung = v.findViewById(R.id.btnHitung);
        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (etPanjang.getText().toString().isEmpty() || etLebar.getText().toString().isEmpty()){
                    Toast.makeText(getContext(), "Isi dulu nilainya bro bro gore!!", Toast.LENGTH_SHORT).show();
                }else {
                    panjang = Double.valueOf(etPanjang.getText().toString());
                    lebar = Double.valueOf(etLebar.getText().toString());
                    hasil = panjang * lebar;
                    tvHasil.setText(String.valueOf(hasil));
                }
            }
        });
        return v;
    }

}
