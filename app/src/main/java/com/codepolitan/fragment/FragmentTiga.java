package com.codepolitan.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FragmentTiga extends Fragment implements View.OnClickListener {

    EditText etAngka1, etAngka2;
    TextView tvHasil;
    Button btnKali, btnTambah, btnKurang, btnBagi;
    String angkasatu, angkadua;
    Double hasil;

    public FragmentTiga() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_tiga, container, false);
        etAngka1 = v.findViewById(R.id.angka1);
        etAngka2 = v.findViewById(R.id.angka2);
        tvHasil = v.findViewById(R.id.hasil);
        btnKali = v.findViewById(R.id.btnKali);
        btnTambah = v.findViewById(R.id.btnTambah);
        btnKurang = v.findViewById(R.id.btnKurang);
        btnBagi = v.findViewById(R.id.btnBagi);
        btnKali.setOnClickListener(this);
        btnTambah.setOnClickListener(this);
        btnBagi.setOnClickListener(this);
        btnKurang.setOnClickListener(this);

        return v;
    }

    @Override
    public void onClick(View v) {
        angkasatu = etAngka1.getText().toString();
        angkadua = etAngka2.getText().toString();
        hasil = 0d;
        switch (v.getId()){
            case R.id.btnTambah:
                if (angkasatu.isEmpty() || angkadua.isEmpty()) Toast.makeText(getContext(), "Angka Pertama dan Angka Kedua harus diisi", Toast.LENGTH_SHORT).show();
                else hasil = Double.valueOf(angkasatu) + Double.valueOf(angkadua);
                break;
            case R.id.btnKurang:
                if (angkasatu.isEmpty() || angkadua.isEmpty()) Toast.makeText(getContext(), "Angka Pertama dan Angka Kedua harus diisi", Toast.LENGTH_SHORT).show();
                else hasil = Double.valueOf(angkasatu) - Double.valueOf(angkadua);
                break;
            case R.id.btnKali:
                if (angkasatu.isEmpty() || angkadua.isEmpty()) Toast.makeText(getContext(), "Angka Pertama dan Angka Kedua harus diisi", Toast.LENGTH_SHORT).show();
                else hasil = Double.valueOf(angkasatu) * Double.valueOf(angkadua);
                break;
            case R.id.btnBagi:
                if (angkasatu.isEmpty() || angkadua.isEmpty()) Toast.makeText(getContext(), "Angka Pertama dan Angka Kedua harus diisi", Toast.LENGTH_SHORT).show();
                else hasil = Double.valueOf(angkasatu) / Double.valueOf(angkadua);
                break;
        }
        tvHasil.setText(String.valueOf(hasil));
    }
}
