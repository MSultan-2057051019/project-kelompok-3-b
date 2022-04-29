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


public class SquareFragment extends Fragment {
    private static final String STATE_HASIL = "state_hasil";

    private EditText edtSides;
    private ImageButton btnCalculate;
    private TextView tvResult, sisiDiket, sisi1, sisi2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_square, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        edtSides = (EditText) getView().findViewById(R.id.edt_sides);
        btnCalculate = (ImageButton) getView().findViewById(R.id.btn_calculate);
        tvResult = (TextView) getView().findViewById(R.id.tv_result);
        sisiDiket = (TextView) getView().findViewById(R.id.sisi_diket);
        sisi1 = (TextView) getView().findViewById(R.id.sisi1);
        sisi2 = (TextView) getView().findViewById(R.id.sisi2);
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
                String base = edtSides.getText().toString().trim();
                boolean isEmptyFields = false;
                if (TextUtils.isEmpty(base)) {
                    isEmptyFields = true;
                    edtSides.setError("Field ini tidak boleh kosong");
                }
                if (!isEmptyFields) {
                    double sisi = Double.parseDouble(base);
                    double luas = sisi * sisi;
                    tvResult.setText(String.valueOf(luas));
                    sisiDiket.setText(String.valueOf(sisi));
                    sisi1.setText(String.valueOf(sisi));
                    sisi2.setText(String.valueOf(sisi));

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