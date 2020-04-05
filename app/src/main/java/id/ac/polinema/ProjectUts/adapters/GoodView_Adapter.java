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
import id.ac.polinema.ProjectUts.models.GoodView_Logo;

public class GoodView_Adapter extends RecyclerView.Adapter<GoodView_Adapter.MyViewHolder> {
    private List<GoodView_Logo> items;

    public GoodView_Adapter(List<GoodView_Logo> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public GoodView_Adapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_goodview, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GoodView_Adapter.MyViewHolder holder, int position) {
        GoodView_Logo goodView_logo = items.get(position);
        holder.textView.setText(goodView_logo.getNama());
        Picasso.get().load(goodView_logo.getLogo()).into(holder.imageView);
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
