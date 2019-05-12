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
public class FragmentDua extends Fragment {

    EditText etPanjang, etTinggi;
    TextView tvHasil;
    Double panjang, lebar, hasil;
    Button btnHitung;

    public FragmentDua() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_dua, container, false);

        etPanjang = v.findViewById(R.id.panjang);
        etTinggi = v.findViewById(R.id.tinggi);
        tvHasil = v.findViewById(R.id.hasil);
        btnHitung = v.findViewById(R.id.btnHitung);
        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (etPanjang.getText().toString().isEmpty() || etTinggi.getText().toString().isEmpty()){
                    Toast.makeText(getContext(), "Isi dulu nilainya bro bro gore!!", Toast.LENGTH_SHORT).show();
                }else {
                    panjang = Double.valueOf(etPanjang.getText().toString());
                    lebar = Double.valueOf(etTinggi.getText().toString());
                    hasil = 0.5 * panjang * lebar;
                    tvHasil.setText(String.valueOf(hasil));
                }
            }
        });

        return v;
    }

}
