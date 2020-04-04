package id.ac.polinema.ProjectUts.models;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.mikepenz.fastadapter.FastAdapter;
import com.mikepenz.fastadapter.IItem;
import com.mikepenz.fastadapter.items.AbstractItem;
import com.mikepenz.fastadapter.listeners.OnClickListener;
import com.squareup.picasso.Picasso;

import java.util.List;

import id.ac.polinema.ProjectUts.R;

public class Pemula_Items extends AbstractItem<Pemula_Items, Pemula_Items.MyViewHolder> {
    String Logo;
    String Name;

    public Pemula_Items(String logo, String name) {
        Logo = logo;
        Name = name;
    }

    @NonNull
    @Override
    public Pemula_Items.MyViewHolder getViewHolder(View v) {
        return new MyViewHolder(v);
    }

    @Override
    public int getType() {
        return R.id.rv_teams;
    }

    @Override
    public int getLayoutRes() {
        return R.layout.item_pemula;
    }

    public class MyViewHolder extends FastAdapter.ViewHolder<Pemula_Items>{
       ImageView imageView;
       TextView textView;
        public MyViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image_logo);
            textView = itemView.findViewById(R.id.text_name);
        }

        @Override
        public void bindView(Pemula_Items item, List<Object> payloads) {
            Picasso.get().load(item.Logo).into(imageView);
            textView.setText(item.Name);
        }

        @Override
        public void unbindView(Pemula_Items item) {
            imageView.setImageBitmap(null);
            textView.setText(null);
        }
    }
}
