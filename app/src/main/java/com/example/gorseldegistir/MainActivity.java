package com.example.gorseldegistir;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.gorseldegistir.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    ArrayList<Gorsel> gorselArrayList;

    int seciliSiraNo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        Gorsel a = new Gorsel("codefur calışması 1",1,R.drawable.a);
        Gorsel b = new Gorsel("codefur calışması 2",2,R.drawable.b);
        Gorsel c = new Gorsel("codefur calışması 3",3,R.drawable.c);
        Gorsel d = new Gorsel("codefur calışması 4",4,R.drawable.d);

        gorselArrayList = new ArrayList<>();

        gorselArrayList.add(a);
        gorselArrayList.add(b);
        gorselArrayList.add(c);
        gorselArrayList.add(d);

        binding.imageViewGorsel.setImageResource(gorselArrayList.get(0).foto);
        binding.textViewBilgi.setText("Bilgi : " + gorselArrayList.get(0).bilgi);
        seciliSiraNo=0;
    }

    public void geriGelme(View view) {
        if(seciliSiraNo>0) {
            seciliSiraNo--;
            binding.imageViewGorsel.setImageResource(gorselArrayList.get(seciliSiraNo).foto);
            binding.textViewBilgi.setText("Bilgi : " + gorselArrayList.get(seciliSiraNo).bilgi);
        }
    }

    public void ileriGitme(View view) {
        if(seciliSiraNo<gorselArrayList.size()-1) {
            seciliSiraNo++;
            binding.imageViewGorsel.setImageResource(gorselArrayList.get(seciliSiraNo).foto);
            binding.textViewBilgi.setText("Bilgi : " + gorselArrayList.get(seciliSiraNo).bilgi);
        }
    }



}