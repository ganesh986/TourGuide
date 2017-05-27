package com.example.android.tourguide;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * {@link InformationAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link Informations} objects.
 */
public class InformationAdapter extends ArrayAdapter<Informations>  {

    /** Resource ID for the background color for this list of words */
    private int mColorResourceId;

    /**
     * Create a new {@link InformationAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param info is the list of {@link Informations}s to be displayed.
     * @param colorResourceId is the resource ID for the background color for this list of words
     */
    public InformationAdapter(Context context, ArrayList<Informations> info, int colorResourceId) {
        super(context, 0, info);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.activity_item, parent, false);
        }

        // Get the {@link Informations} object located at this position in the list
        Informations currentInfo = getItem(position);

        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        imageView.setImageResource(currentInfo.getImageResourceId());

        // Find the TextView in the activity_item.xml layout with the title.
        TextView titleTextView = (TextView) listItemView.findViewById(R.id.title);
        titleTextView.setText(currentInfo.getPlaceTitle());

        // Find the TextView in the activity_item.xml layout with the descriptions.
        TextView descriptionTextView = (TextView) listItemView.findViewById(R.id.subtext);
        descriptionTextView.setText(currentInfo.getPlaceDescription());

        // Find the TextView in the activity_item.xml layout with the address.
        TextView addressTextView = (TextView) listItemView.findViewById(R.id.address);
        addressTextView.setText(currentInfo.getPlaceAddress());

        // Find the TextView in the activity_item.xml layout with the phone.
        TextView phoneTextView = (TextView) listItemView.findViewById(R.id.phone_number);
        phoneTextView.setText(currentInfo.getPlacePhone());

        // Find the TextView in the activity_item.xml layout with the website.
        TextView websiteTextView = (TextView) listItemView.findViewById(R.id.website);
        websiteTextView.setText(currentInfo.getPlaceWeb());
        
        // Set the theme color for the activity item
        View textContainer = listItemView.findViewById(R.id.item);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }
}