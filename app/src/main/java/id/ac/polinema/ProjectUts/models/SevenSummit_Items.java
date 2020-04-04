package id.ac.polinema.ProjectUts.models;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.mikepenz.fastadapter.FastAdapter;
import com.mikepenz.fastadapter.items.AbstractItem;
import com.squareup.picasso.Picasso;

import java.util.List;

import id.ac.polinema.ProjectUts.R;

public class SevenSummit_Items extends AbstractItem<SevenSummit_Items, SevenSummit_Items.MyViewHolder> {
    private String logo,name;

    public SevenSummit_Items(String logo, String name) {
        this.logo = logo;
        this.name = name;
    }

    @NonNull
    @Override
    public MyViewHolder getViewHolder(View v) {
        return new MyViewHolder(v);
    }

    @Override
    public int getType() {
        return R.id.rv_teams;
    }

    @Override
    public int getLayoutRes() {
        return R.layout.item_sevensummit;
    }

    public class MyViewHolder extends FastAdapter.ViewHolder<SevenSummit_Items> {
        ImageView imageView;
        TextView textView;
        public MyViewHolder(View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.image_logo);
            textView = itemView.findViewById(R.id.text_name);
        }

        @Override
        public void bindView(SevenSummit_Items item, List<Object> payloads) {
            Picasso.get().load(item.logo).into(imageView);
            textView.setText(item.name);
        }

        @Override
        public void unbindView(SevenSummit_Items item) {
            imageView.setImageBitmap(null);
            textView.setText(null);
        }
    }
}
