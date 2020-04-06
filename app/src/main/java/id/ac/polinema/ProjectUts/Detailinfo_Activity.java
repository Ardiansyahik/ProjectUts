package id.ac.polinema.ProjectUts;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import id.ac.polinema.ProjectUts.models.Gunung_Logo;

public class Detailinfo_Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        RecyclerView listview = findViewById(R.id.rv_teams);

        List<Gunung_Logo> logos = new ArrayList<>();
        logos.add(new Gunung_Logo("", "Cartenz Pyramid", ""));
    }
}
