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
import id.ac.polinema.ProjectUts.models.Pemula_Logo;

public class Pemula_Adapter extends RecyclerView.Adapter<Pemula_Adapter.MyViewHolder> {
    private List<Pemula_Logo> items;

    public Pemula_Adapter(List<Pemula_Logo> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public Pemula_Adapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_pemula, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Pemula_Adapter.MyViewHolder holder, int position) {
        Pemula_Logo pemula_logo = items.get(position);
        holder.textView.setText(pemula_logo.getNama());
        Picasso.get().load(pemula_logo.getLogo()).into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return items == null ? 0 : items.size();
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
