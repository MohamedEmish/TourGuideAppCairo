package com.example.amosh.tourguideapp_cairo;

public class Place {

    /**
     * Constant value that represents no image was provided for this word
     */
    private static final int NO_IMAGE_PROVIDED = -1;
    /**
     * visit place name
     */
    private String mPlaceName;
    /**
     * visit place address
     */
    private String mPlaceAddress;
    private int mPlaceImageId = NO_IMAGE_PROVIDED;

    public Place(String placeName, String placeAddress) {
        mPlaceName = placeName;
        mPlaceAddress = placeAddress;
    }

    public Place(String placeName, String placeAddress, int placeImageId) {
        mPlaceName = placeName;
        mPlaceAddress = placeAddress;
        mPlaceImageId = placeImageId;
    }

    /**
     * Get the Place Name
     */

    public String getmPlaceName() {
        return mPlaceName;
    }

    /**
     * Get the Place address
     */
    public String getmPlaceAddress() {
        return mPlaceAddress;
    }


    public int getmPlaceImageId() {
        return mPlaceImageId;
    }

    public boolean hasImage() {
        return mPlaceImageId != NO_IMAGE_PROVIDED;
    }


}
