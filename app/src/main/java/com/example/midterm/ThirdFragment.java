package com.example.midterm;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;


public class ThirdFragment extends Fragment {
    private ImageButton btnKubus, btnBalok, btnPrisma, btnLimas, btnKerucut, btnTabung, btnBola;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_third, container, false);
    }
    private View.OnClickListener btnKubusListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Fragment fragment = new KubusFragment();
            getParentFragmentManager().beginTransaction().replace(R.id.fragment_container, fragment).commit();
        }
    };
    private View.OnClickListener btnBalokListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Fragment fragment = new BalokFragment();
            getParentFragmentManager().beginTransaction().replace(R.id.fragment_container, fragment).commit();
        }
    };
    private View.OnClickListener btnPrismaListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Fragment fragment = new PrismaFragment();
            getParentFragmentManager().beginTransaction().replace(R.id.fragment_container, fragment).commit();
        }
    };
    private View.OnClickListener btnLimasListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Fragment fragment = new LimasFragment();
            getParentFragmentManager().beginTransaction().replace(R.id.fragment_container, fragment).commit();
        }
    };
    private View.OnClickListener btnKerucutListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Fragment fragment = new KerucutFragment();
            getParentFragmentManager().beginTransaction().replace(R.id.fragment_container, fragment).commit();
        }
    };
    private View.OnClickListener btnTabungListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Fragment fragment = new TabungFragment();
            getParentFragmentManager().beginTransaction().replace(R.id.fragment_container, fragment).commit();
        }
    };
    private View.OnClickListener btnBolaListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Fragment fragment = new BolaFragment();
            getParentFragmentManager().beginTransaction().replace(R.id.fragment_container, fragment).commit();
        }
    };
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        btnKubus = (ImageButton) getView().findViewById(R.id.tombol_kubus);
        btnKubus.setOnClickListener(btnKubusListener);
        btnBalok = (ImageButton) getView().findViewById(R.id.tombol_balok);
        btnBalok.setOnClickListener(btnBalokListener);
        btnPrisma = (ImageButton) getView().findViewById(R.id.tombol_prisma);
        btnPrisma.setOnClickListener(btnPrismaListener);
        btnLimas = (ImageButton) getView().findViewById(R.id.tombol_limas);
        btnLimas.setOnClickListener(btnLimasListener);
        btnKerucut = (ImageButton) getView().findViewById(R.id.tombol_kerucut);
        btnKerucut.setOnClickListener(btnKerucutListener);
        btnTabung = (ImageButton) getView().findViewById(R.id.tombol_tabung);
        btnTabung.setOnClickListener(btnTabungListener);
        btnBola = (ImageButton) getView().findViewById(R.id.tombol_bola);
        btnBola.setOnClickListener(btnBolaListener);
    }
}