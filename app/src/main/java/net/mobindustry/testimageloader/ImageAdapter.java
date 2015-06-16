package net.mobindustry.testimageloader;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

public class ImageAdapter extends ArrayAdapter<String> {

    private final LayoutInflater inflater;

    public ImageAdapter(Context context) {
        super(context, 0);
        inflater = LayoutInflater.from(context);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.item_list_main, parent, false);
        }
        String item = getItem(position);
        ImageView imageView = (ImageView) convertView.findViewById(R.id.image);
        ImageLoaderHelper.displayImage(item, imageView);
        return convertView;
    }
}
