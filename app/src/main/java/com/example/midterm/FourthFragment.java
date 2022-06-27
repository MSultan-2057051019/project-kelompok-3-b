package com.example.midterm;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


public class FourthFragment extends Fragment {
    private EditText etn1;
    private EditText etn2;
    private TextView result;
    private ImageButton sum, sub, mul, div;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_calc, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        etn1 = (EditText) getView().findViewById(R.id.etn1);
        etn2 = (EditText) getView().findViewById(R.id.etn2);
        result = (TextView) getView().findViewById(R.id.tvResult);
        sum = (ImageButton) getView().findViewById(R.id.button);
        sub = (ImageButton) getView().findViewById(R.id.button2);
        mul = (ImageButton) getView().findViewById(R.id.button3);
        div = (ImageButton) getView().findViewById(R.id.button4);

        sum.setOnClickListener(sumListener);
        sub.setOnClickListener(subListener);
        mul.setOnClickListener(mulListener);
        div.setOnClickListener(divListener);

    }

    private View.OnClickListener sumListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (view.getId() == R.id.button) {
                String base = etn1.getText().toString().trim();
                String base1 = etn2.getText().toString().trim();
                boolean isEmptyFields = false;
                if (TextUtils.isEmpty(base)) {
                    isEmptyFields = true;
                    etn1.setError("Field ini tidak boleh kosong");
                }
                if (TextUtils.isEmpty(base1)) {
                    isEmptyFields = true;
                    etn2.setError("Field ini tidak boleh kosong");
                }
                if (!isEmptyFields) {
                    int n1 = Integer.parseInt(etn1.getText().toString());
                    int n2 = Integer.parseInt(etn2.getText().toString());
                    int sum = n1 + n2;
                    result.setText(String.valueOf(sum));

                    Context context = getActivity();
                    CharSequence text = "Perhitungan Selesai";
                    int duration = Toast.LENGTH_SHORT;
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
            }
        }
    };

    private View.OnClickListener subListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (view.getId() == R.id.button2) {
                String base = etn1.getText().toString().trim();
                String base1 = etn2.getText().toString().trim();
                boolean isEmptyFields = false;
                if (TextUtils.isEmpty(base)) {
                    isEmptyFields = true;
                    etn1.setError("Field ini tidak boleh kosong");
                }
                if (TextUtils.isEmpty(base1)) {
                    isEmptyFields = true;
                    etn2.setError("Field ini tidak boleh kosong");
                }
                if (!isEmptyFields) {
                    int n1 = Integer.parseInt(etn1.getText().toString());
                    int n2 = Integer.parseInt(etn2.getText().toString());
                    int sum = n1 - n2;
                    result.setText(String.valueOf(sum));

                    Context context = getActivity();
                    CharSequence text = "Perhitungan Selesai";
                    int duration = Toast.LENGTH_SHORT;
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
            }
        }
    };

    private View.OnClickListener mulListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (view.getId() == R.id.button3) {
                String base = etn1.getText().toString().trim();
                String base1 = etn2.getText().toString().trim();
                boolean isEmptyFields = false;
                if (TextUtils.isEmpty(base)) {
                    isEmptyFields = true;
                    etn1.setError("Field ini tidak boleh kosong");
                }
                if (TextUtils.isEmpty(base1)) {
                    isEmptyFields = true;
                    etn2.setError("Field ini tidak boleh kosong");
                }
                if (!isEmptyFields) {
                    int n1 = Integer.parseInt(etn1.getText().toString());
                    int n2 = Integer.parseInt(etn2.getText().toString());
                    int sum = n1 * n2;
                    result.setText(String.valueOf(sum));

                    Context context = getActivity();
                    CharSequence text = "Perhitungan Selesai";
                    int duration = Toast.LENGTH_SHORT;
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
            }

        }
    };

    private View.OnClickListener divListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (view.getId() == R.id.button4) {
                String base = etn1.getText().toString().trim();
                String base1 = etn2.getText().toString().trim();
                boolean isEmptyFields = false;
                if (TextUtils.isEmpty(base)) {
                    isEmptyFields = true;
                    etn1.setError("Field ini tidak boleh kosong");
                }
                if (TextUtils.isEmpty(base1)) {
                    isEmptyFields = true;
                    etn2.setError("Field ini tidak boleh kosong");
                }
                if (!isEmptyFields) {
                    int n1 = Integer.parseInt(etn1.getText().toString());
                    int n2 = Integer.parseInt(etn2.getText().toString());
                    double sum = n1 / n2;
                    result.setText(String.valueOf(sum));

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


