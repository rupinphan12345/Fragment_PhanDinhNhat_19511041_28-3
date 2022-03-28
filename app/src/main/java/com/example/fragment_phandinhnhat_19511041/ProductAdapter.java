package com.example.fragment_phandinhnhat_19511041;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ProductAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<Product> productList;


    public ProductAdapter(Context context, int layout, List<Product> productList) {
        this.context = context;
        this.layout = layout;
        this.productList = productList;
    }

    @Override
    public int getCount() {
        return productList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(layout,null);

        TextView txtTitle = (TextView) view.findViewById(R.id.txtitle);
        ImageView imgPicture = (ImageView) view.findViewById(R.id.imgProduct);

        Product product = productList.get(i);
        txtTitle.setText(product.getTitle());
        imgPicture.setImageResource(product.getImgProduct());

        return view;
    }
}
