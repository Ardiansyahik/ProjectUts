package id.ac.polinema.ProjectUts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public void handleLogoButton(View view) {
		startActivity(new Intent(this, SevenSummit_Activity.class));
	}

	public void handleGridButton(View view) {

		startActivity(new Intent(this, Pemula_Activity.class));
	}


	public void handleFastAdapter(View view) {
		startActivity(new Intent(this, GoodViewActivity.class));
	}
}
