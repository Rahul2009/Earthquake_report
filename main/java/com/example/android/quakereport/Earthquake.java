package com.example.android.quakereport;



/**

 * An {@link Earthquake} object contains information related to a single earthquake.

 */

public class Earthquake {



    /** Magnitude of the earthquake */

    private double mMagnitude;



    /** Location of the earthquake */

    private String mLocation;



    /** Time of the earthquake */

    private long mTimeInMilliseconds;

 private String mUrl;

    /**

     * Constructs a new {@link Earthquake} object.

     *

     * @param magnitude is the magnitude (size) of the earthquake

     * @param location is the location where the earthquake happened

     * @param timeInMilliseconds is the time in milliseconds (from the Epoch) when the

     *                           earthquake happened

     */

    public Earthquake(double magnitude, String location, long timeInMilliseconds, String url) {

        mMagnitude = magnitude;

        mLocation = location;

        mTimeInMilliseconds = timeInMilliseconds;

        mUrl = url;

    }



    /**

     * Returns the magnitude of the earthquake.

     */

    public double getMagnitude() {

        return mMagnitude;

    }



    /**

     * Returns the location of the earthquake.

     */

    public String getLocation() {

        return mLocation;

    }



    /**

     * Returns the time of the earthquake.

     */

    public long getTimeInMilliseconds() {

        return mTimeInMilliseconds;

    }
    public String getUrl(){
        return mUrl;
    }

}