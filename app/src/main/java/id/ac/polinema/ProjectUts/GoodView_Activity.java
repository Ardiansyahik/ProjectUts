package id.ac.polinema.ProjectUts;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import id.ac.polinema.ProjectUts.adapters.GoodView_Adapter;
import id.ac.polinema.ProjectUts.models.GoodView_Logo;

public class GoodView_Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goodview);

        RecyclerView recyclerView = findViewById(R.id.rv_teams);
        List<GoodView_Logo> Good = new ArrayList<>();

        Good.add(new GoodView_Logo("https://upload.wikimedia.org/wikipedia/commons/3/3f/Puncakjaya.jpg", "Cartenz Pyramid"));

        GoodView_Adapter goodView_adapter = new GoodView_Adapter(Good);
        recyclerView.setAdapter(goodView_adapter);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
