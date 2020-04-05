package id.ac.polinema.ProjectUts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import id.ac.polinema.ProjectUts.adapters.Pemula_Adapter;
import id.ac.polinema.ProjectUts.models.Pemula_Logo;

public class Pemula_Activity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_pemula);

		RecyclerView recyclerView = findViewById(R.id.rv_teams);

		List<Pemula_Logo> teams = new ArrayList<>();
		teams.add(new Pemula_Logo("https://upload.wikimedia.org/wikipedia/en/thumb/0/0c/Liverpool_FC.svg/360px-Liverpool_FC.svg.png", "Liverpool"));
		teams.add(new Pemula_Logo("https://upload.wikimedia.org/wikipedia/en/thumb/e/eb/Manchester_City_FC_badge.svg/360px-Manchester_City_FC_badge.svg.png", "Man. City"));
		teams.add(new Pemula_Logo("https://upload.wikimedia.org/wikipedia/en/thumb/f/f4/Atletico_Madrid_2017_logo.svg/800px-Atletico_Madrid_2017_logo.svg.png", "Atletico Madrid"));
		teams.add(new Pemula_Logo("https://upload.wikimedia.org/wikipedia/en/thumb/7/7a/Manchester_United_FC_crest.svg/1024px-Manchester_United_FC_crest.svg.png", "Manchester United"));

		Pemula_Adapter pemula_adapter = new Pemula_Adapter(teams);
		recyclerView.setAdapter(pemula_adapter);

		recyclerView.setLayoutManager(new LinearLayoutManager(this));
	}
}
