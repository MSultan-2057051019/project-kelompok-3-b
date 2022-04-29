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

public class KerucutFragment extends Fragment {

    private static final String STATE_HASIL = "state_hasil";
    private EditText edt1, edt2;
    private ImageButton btnCalculate;
    private TextView tvResult, diket1, diket2, input1, input2, input3;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_kerucut, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        edt1 = (EditText) getView().findViewById(R.id.edt1);
        edt2 = (EditText) getView().findViewById(R.id.edt2);
        btnCalculate = (ImageButton) getView().findViewById(R.id.btn_calculate);
        tvResult = (TextView) getView().findViewById(R.id.tv_result);
        diket1 = (TextView) getView().findViewById(R.id.diket1);
        diket2 = (TextView) getView().findViewById(R.id.diket2);
        input1 = (TextView) getView().findViewById(R.id.input1);
        input2 = (TextView) getView().findViewById(R.id.input2);
        input3 = (TextView) getView().findViewById(R.id.input3);
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
                String base = edt1.getText().toString().trim();
                String base1 = edt2.getText().toString().trim();
                boolean isEmptyFields = false;
                if (TextUtils.isEmpty(base)) {
                    isEmptyFields = true;
                    edt1.setError("Field ini tidak boleh kosong");
                }
                if (TextUtils.isEmpty(base)) {
                    isEmptyFields = true;
                    edt2.setError("Field ini tidak boleh kosong");
                }
                if (!isEmptyFields) {
                    double input = Double.parseDouble(base);
                    double input_ = Double.parseDouble(base1);
                    double luas = 0.33 * 3.14 * input * input * input_;
                    tvResult.setText(String.valueOf(luas));
                    diket1.setText(String.valueOf(input));
                    diket2.setText(String.valueOf(input_));
                    input1.setText(String.valueOf(input));
                    input2.setText(String.valueOf(input));
                    input3.setText(String.valueOf(input_));

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