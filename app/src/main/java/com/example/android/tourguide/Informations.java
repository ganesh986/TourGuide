package com.example.android.tourguide;

/**
 * {@link Informations} represents a container of places Information about the places.
 * It contains an image for the places, a name (title) of the places, a descriptions of the places,
 * the address, the phone number and the website address
 */

public class Informations {

    /** Image resource ID for the word */
    private int mImageResourceId;

    /** Place title */
    private String mPlaceTitle;

    /** Place description */
    private String mPlaceDescription;

    /** Place address */
    private String mPlaceAddress;

    /** Place phone number */
    private String mPlacePhone;

    /** Place website address */
    private String mPlaceWebsite;

    /**
     * Create a new Word object.
     *
     * @param imageResourceId is the image of the place
     * @param placeTitle is name of the place
     * @param placeDescription a description of the place
     * @param placeAddress address of the place
     * @param placePhone is the phone number of the place
     * @param placeWeb is the website address of the place
     */
    public Informations(int imageResourceId, String placeTitle, String placeDescription,String placeAddress, String placePhone,
                        String placeWeb) {
        mImageResourceId = imageResourceId;
        mPlaceTitle = placeTitle;
        mPlaceDescription = placeDescription;
        mPlaceAddress = placeAddress;
        mPlacePhone = placePhone;
        mPlaceWebsite = placeWeb;
    }

    /**
     * Return the image resource ID of the place.
     */
    public int getImageResourceId() {

        return mImageResourceId;
    }

    /**
     * Return the place name string.
     */
    public String getPlaceTitle() {
        return mPlaceTitle;
    }

    /**
     * Return the place description string.
     */
    public String getPlaceDescription() {

        return mPlaceDescription;
    }

    /**
     * Return the place address string.
     */
    public String getPlaceAddress() {

        return mPlaceAddress;
    }

    /**
     * Return the place phone string.
     */
    public String getPlacePhone() {

        return mPlacePhone;
    }

    /**
     * Return the place phone string.
     */
    public String getPlaceWeb() {

        return mPlaceWebsite;
    }

}
