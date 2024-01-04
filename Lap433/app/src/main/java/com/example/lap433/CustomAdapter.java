package com.example.lap433;

import android.content.Context;
import android.graphics.Color;
import android.icu.text.Transliterator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class CustomAdapter extends ArrayAdapter<Contact> {
    private Context context;
    private int resource;
    private List<Contact> objects;
    private LayoutInflater inflater;

    public CustomAdapter(Context context, int resource, List<Contact> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.objects = objects;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = new ViewHolder();
        if (convertView == null)//neu view chua co san
        {
            //thiet lap viewholder
            convertView = inflater.inflate(R.layout.item_listview, null);
            holder.tvAvatar = (TextView) convertView.findViewById(R.id.tvAvatar);
            holder.tvName = (TextView) convertView.findViewById(R.id.tvAvatar);
            holder.tvPhone = (TextView) convertView.findViewById(R.id.tvPhone);
            convertView.setTag(holder);
        } else {//neu view co san
            //lay ve viewholder
            holder = (ViewHolder) convertView.getTag();

        }

        //gan du lieu cho view
        Contact contact = objects.get(position);
        holder.tvAvatar.setText(String.valueOf(position));
        //holder.tvAvatar.setBackgroundColor(Color.GREEN);
        holder.tvName.setText(contact.getName());
        holder.tvPhone.setText(contact.getPhone());

        return convertView;
    }


    public class ViewHolder {
        TextView tvAvatar, tvName, tvPhone;
    }

}
