package com.example.midterm;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;


public class SecondFragment extends Fragment {
    private ImageButton btnPersegi, btnPersegiP,btnSegitiga,btnTrap, btnBK, btnLayang, btnJG, btnLingkaran;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false);
    }
    private View.OnClickListener btnPersegiListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Fragment fragment = new SquareFragment();
            getParentFragmentManager().beginTransaction().replace(R.id.fragment_container, fragment).commit();
        }
    };
    private View.OnClickListener btnPersegiPListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Fragment fragment = new RectangleFragment();
            getParentFragmentManager().beginTransaction().replace(R.id.fragment_container, fragment).commit();
        }
    };
    private View.OnClickListener btnSegitigaListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Fragment fragment = new TriangleFragment();
            getParentFragmentManager().beginTransaction().replace(R.id.fragment_container, fragment).commit();
        }
    };
    private View.OnClickListener btnTrapListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Fragment fragment = new TrapFragment();
            getParentFragmentManager().beginTransaction().replace(R.id.fragment_container, fragment).commit();
        }
    };
    private View.OnClickListener btnBKListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Fragment fragment = new BKFragment();
            getParentFragmentManager().beginTransaction().replace(R.id.fragment_container, fragment).commit();
        }
    };
    private View.OnClickListener btnLayangListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Fragment fragment = new LayangFragment();
            getParentFragmentManager().beginTransaction().replace(R.id.fragment_container, fragment).commit();
        }
    };
    private View.OnClickListener btnJGListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Fragment fragment = new JGFragment();
            getParentFragmentManager().beginTransaction().replace(R.id.fragment_container, fragment).commit();
        }
    };
    private View.OnClickListener btnLingkaranListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Fragment fragment = new LingkaranFragment();
            getParentFragmentManager().beginTransaction().replace(R.id.fragment_container, fragment).commit();
        }
    };
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        btnPersegi = (ImageButton) getView().findViewById(R.id.tombol_p);
        btnPersegi.setOnClickListener(btnPersegiListener);
        btnPersegiP = (ImageButton) getView().findViewById(R.id.tombol_pp);
        btnPersegiP.setOnClickListener(btnPersegiPListener);
        btnSegitiga = (ImageButton) getView().findViewById(R.id.tombol_s);
        btnSegitiga.setOnClickListener(btnSegitigaListener);
        btnTrap = (ImageButton) getView().findViewById(R.id.tombol_tr);
        btnTrap.setOnClickListener(btnTrapListener);
        btnBK = (ImageButton) getView().findViewById(R.id.tombol_bk);
        btnBK.setOnClickListener(btnBKListener);
        btnLayang = (ImageButton) getView().findViewById(R.id.tombol_l);
        btnLayang.setOnClickListener(btnLayangListener);
        btnJG = (ImageButton) getView().findViewById(R.id.tombol_jg);
        btnJG.setOnClickListener(btnJGListener);
        btnLingkaran = (ImageButton) getView().findViewById(R.id.tombol_o);
        btnLingkaran.setOnClickListener(btnLingkaranListener);
    }
}