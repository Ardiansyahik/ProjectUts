package id.ac.polinema.ProjectUts.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import id.ac.polinema.ProjectUts.R;
import id.ac.polinema.ProjectUts.models.Pemula_Logo;
import id.ac.polinema.ProjectUts.models.SevenSummit_Logo;

public class Pemula_Adapter extends RecyclerView.Adapter<Pemula_Adapter.MyViewHolder> {
    private List<Pemula_Logo> lists= new ArrayList<>();

    public Pemula_Adapter(List<Pemula_Logo> teams) {
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_pemula, parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Pemula_Logo teams = lists.get(position);
        holder.textView.setText(teams.getNama());
        Picasso.get().load(teams.getLogo()).into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return lists.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.image_logo);
            textView = itemView.findViewById(R.id.text_name);
        }
    }
}
