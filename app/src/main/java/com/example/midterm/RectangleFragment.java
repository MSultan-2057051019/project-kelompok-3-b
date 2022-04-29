package com.example.midterm;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class RectangleFragment extends Fragment {
    private static final String STATE_HASIL = "state_hasil";

    private EditText edtPanjang, edtLebar;
    private ImageButton btnCalculate;
    private TextView tvResult, panjangDiket, lebarDiket, panjang1, lebar1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_rectangle, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        edtPanjang = (EditText) getView().findViewById(R.id.edt1);
        edtLebar = (EditText) getView().findViewById(R.id.edt2);
        btnCalculate = (ImageButton) getView().findViewById(R.id.btn_calculate);
        tvResult = (TextView) getView().findViewById(R.id.tv_result);
        panjangDiket = (TextView) getView().findViewById(R.id.diket1);
        lebarDiket = (TextView) getView().findViewById(R.id.diket2);
        panjang1 = (TextView) getView().findViewById(R.id.input1);
        lebar1 = (TextView) getView().findViewById(R.id.input2);
        btnCalculate.setOnClickListener(btnCalculateListener);

        if (savedInstanceState != null) {
            String hasil = savedInstanceState.getString(STATE_HASIL);
            tvResult.setText(hasil);
        }
    }
    private View.OnClickListener btnCalculateListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (view.getId() == R.id.btn_calculate) {
                String base = edtPanjang.getText().toString().trim();
                String base1 = edtLebar.getText().toString().trim();
                boolean isEmptyFields = false;
                if (TextUtils.isEmpty(base)) {
                    isEmptyFields = true;
                    edtPanjang.setError("Field ini tidak boleh kosong");
                }
                if (TextUtils.isEmpty(base)) {
                    isEmptyFields = true;
                    edtLebar.setError("Field ini tidak boleh kosong");
                }
                if (!isEmptyFields) {
                    double panjang = Double.parseDouble(base);
                    double lebar = Double.parseDouble(base1);
                    double luas = panjang * lebar;
                    tvResult.setText(String.valueOf(luas));
                    panjangDiket.setText(String.valueOf(panjang));
                    lebarDiket.setText(String.valueOf(lebar));
                    panjang1.setText(String.valueOf(panjang));
                    lebar1.setText(String.valueOf(lebar));

                    Context context = getActivity();
                    CharSequence text = "Perhitungan Selesai";
                    int duration = Toast.LENGTH_SHORT;
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();

                }
            }

        }
    };
}