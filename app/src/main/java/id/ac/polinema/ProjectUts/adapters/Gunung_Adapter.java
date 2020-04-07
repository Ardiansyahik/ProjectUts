package id.ac.polinema.ProjectUts.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

import id.ac.polinema.ProjectUts.InfoActivity;
import id.ac.polinema.ProjectUts.R;
import id.ac.polinema.ProjectUts.models.Gunung_Logo;

public class Gunung_Adapter extends RecyclerView.Adapter<Gunung_Adapter.MyViewHolder> {
    private List<Gunung_Logo> items;
    private Context context;



    public Gunung_Adapter(List<Gunung_Logo> items) {
        this.items = items;
        this.context = context;

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_gunung, parent, false);
        return new Gunung_Adapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        final Gunung_Logo gunung_logo = items.get(position);
        holder.namaText.setText(gunung_logo.getName());
        holder.parent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, InfoActivity.class);
                intent.putExtra("image_url", gunung_logo.getLogo());
                intent.putExtra("image_name", gunung_logo.getName());
                intent.putExtra("image_desc", gunung_logo.getDescription());
                context.startActivity(intent);
            }
        });
        Picasso.get().load(gunung_logo.getLogo()).into(holder.logoImage);
    }

    @Override
    public int getItemCount() {
        return items == null ? 0 : items.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView logoImage;
        TextView namaText;
        CardView parent;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            logoImage = itemView.findViewById(R.id.image_logo);
            namaText = itemView.findViewById(R.id.text_name);
            parent = itemView.findViewById(R.id.parent);
         }
    }
}
