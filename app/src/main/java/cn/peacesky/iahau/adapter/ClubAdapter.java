package cn.peacesky.iahau.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import cn.peacesky.iahau.R;
import cn.peacesky.iahau.model.Club;

/**
 * Created by hc on 16-4-28.
 */
public class ClubAdapter extends ArrayAdapter<Club> {

    private int resourceId;

    public ClubAdapter(Context context, int textViewResourceId, List<Club> objects) {
        super(context, textViewResourceId, objects);
        resourceId = textViewResourceId;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        Club club = getItem(position);
        View view;
        if (convertView == null) {
            view = LayoutInflater.from(getContext()).inflate(resourceId, null);
        } else {
            view = convertView;
        }
        ImageView clubImage = (ImageView) view.findViewById(R.id.club_image);
        TextView clubName = (TextView) view.findViewById(R.id.club_name);
        clubImage.setImageResource(club.getImageId());
        clubName.setText(club.getName());
        return view;
    }
}
