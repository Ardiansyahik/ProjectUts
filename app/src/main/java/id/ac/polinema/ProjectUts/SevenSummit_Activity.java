package id.ac.polinema.ProjectUts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import id.ac.polinema.ProjectUts.adapters.SevenSummit_Adapter;
import id.ac.polinema.ProjectUts.models.SevenSummit_Logo;

public class SevenSummit_Activity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sevensummit);

		RecyclerView recyclerView = findViewById(R.id.rv_teams);

		List<SevenSummit_Logo> teams = new ArrayList<>();
		teams.add(new SevenSummit_Logo("https://upload.wikimedia.org/wikipedia/commons/3/3f/Puncakjaya.jpg", "Cartenz Pyramid"));
		teams.add(new SevenSummit_Logo("https://en.wikipedia.org/wiki/Mount_Kerinci#/media/File:Uprising-mount_kerinci.jpg", "Gunung Kerinci"));
		teams.add(new SevenSummit_Logo("https://en.wikipedia.org/wiki/Mount_Rinjani#/media/File:Rinjani_Volcano,_Lombok.JPG", "Gunung Rinjani"));
		teams.add(new SevenSummit_Logo("https://en.wikipedia.org/wiki/Semeru#/media/File:Semeru.jpg", "Gunung Semeru"));
		teams.add(new SevenSummit_Logo("https://indonesiatrip.id/wp-content/uploads/2016/02/trip-gunung-latimojong-820x690.jpg", "Gunung Latimojong"));
		teams.add(new SevenSummit_Logo("https://id.wikipedia.org/wiki/Berkas:Binaiya.jpg", "Gunung Binaiya"));
		teams.add(new SevenSummit_Logo("https://www.gunungbagging.com/wp-content/NEXTGEN/bukit-raya/DSCN1912.JPG", "Gunung Bukit Raya"));
		SevenSummit_Adapter logoAdapter = new SevenSummit_Adapter(teams);
		recyclerView.setAdapter(logoAdapter);

		recyclerView.setLayoutManager(new LinearLayoutManager(this));
	}
}
