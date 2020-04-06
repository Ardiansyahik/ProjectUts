package id.ac.polinema.ProjectUts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import id.ac.polinema.ProjectUts.adapters.Gunung_Adapter;
import id.ac.polinema.ProjectUts.models.Gunung_Logo;

public class Gunung_Activity extends AppCompatActivity {


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_gunung);

		RecyclerView recyclerView = findViewById(R.id.rv_teams);

		List<Gunung_Logo> teams = new ArrayList<>();
		teams.add(new Gunung_Logo("https://upload.wikimedia.org/wikipedia/commons/3/3f/Puncakjaya.jpg", "Cartenz Pyramid"));
		teams.add(new Gunung_Logo("D:/KULIAH/SEM 4/android/ProjectUts/appsrc/main/res/drawable/puncakindrapura", "Gunung Kerinci"));
		teams.add(new Gunung_Logo("https://en.wikipedia.org/wiki/Mount_Rinjani#/media/File:Rinjani_Volcano,_Lombok.JPG", "Gunung Rinjani"));
		teams.add(new Gunung_Logo("https://en.wikipedia.org/wiki/Semeru#/media/File:Semeru.jpg", "Gunung Semeru"));
		teams.add(new Gunung_Logo("https://indonesiatrip.id/wp-content/uploads/2016/02/trip-gunung-latimojong-820x690.jpg", "Gunung Latimojong"));
		teams.add(new Gunung_Logo("https://id.wikipedia.org/wiki/Berkas:Binaiya.jpg", "Gunung Binaiya"));
		teams.add(new Gunung_Logo("https://www.gunungbagging.com/wp-content/NEXTGEN/bukit-raya/DSCN1912.JPG", "Gunung Bukit Raya"));
		Gunung_Adapter sevenSummit_adapter = new Gunung_Adapter(teams);
		recyclerView.setAdapter(sevenSummit_adapter);

		recyclerView.setLayoutManager(new LinearLayoutManager(this));
	}
}
