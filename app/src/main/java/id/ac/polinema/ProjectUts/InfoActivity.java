package id.ac.polinema.ProjectUts;

import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class InfoActivity extends AppCompatActivity {
    private static final String TAG = "InfoActivity";
    List gunung_logos = new ArrayList<>();
    
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        
        getInComingIntent();
        
    }

    private void getInComingIntent() {
        Log.d(TAG,"getIncomingIntent");

        if (getIntent().hasExtra("image_url")&& getIntent().hasExtra("image_name"));
            Log.d(TAG, "getIncomingIntent:found.");
        String imageUrl = getIntent().getStringExtra("image_url");
        String imageName = getIntent().getStringExtra("image_name");
        String imageDescription = getIntent().getStringExtra("image_desc");
        setLogo(imageUrl,imageName,imageDescription);
    }

    private void setLogo(String image_Url, String imageName, String imageDescription) {
        Log.d(TAG, "setImage: setting te image and name to widgets.");
        ImageView image = findViewById(R.id.image);
        Picasso.get().load(image_Url).into(image);
        TextView name = findViewById(R.id.titleText);
        TextView desc = findViewById(R.id.textDeskripsi);
        desc.setText(imageDescription);
        name.setText(imageName);
    }
}
