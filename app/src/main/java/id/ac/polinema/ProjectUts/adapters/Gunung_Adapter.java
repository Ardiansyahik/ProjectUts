package id.ac.polinema.ProjectUts.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

import id.ac.polinema.ProjectUts.R;
import id.ac.polinema.ProjectUts.models.Gunung_Logo;

public class Gunung_Adapter extends RecyclerView.Adapter<Gunung_Adapter.MyViewHolder> {
    private List<Gunung_Logo> items;

    public Gunung_Adapter(List<Gunung_Logo> items) {

        this.items = items;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_sevensummit, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Gunung_Logo teamLogo = items.get(position);

        holder.namaText.setText(teamLogo.getNama());
        Picasso.get().load(teamLogo.getLogo()).into(holder.logoImage);
    }

    @Override
    public int getItemCount() {
        return items == null ? 0 : items.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView logoImage;
        TextView namaText;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            logoImage = itemView.findViewById(R.id.image_logo);
            namaText  = itemView.findViewById(R.id.text_name);
        }


    }
}
