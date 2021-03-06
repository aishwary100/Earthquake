package com.example.earthquake;

public class Earthquake {

    //private String mMagnitude;
    private double mMagnitude;
    private String mLocation;
    //private String mDate;
    private long mTimeInMilliseconds;
    private String mUrl;

    public Earthquake(double magnitude , String location, long timeInMilliseconds,String url)
    {
        mMagnitude = magnitude;
        mLocation = location;
        //mDate = date;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
    }

    public double getMagnitude()    {return mMagnitude;}

    public String getLocation()    {return mLocation;}

    //public String getDate()    {return mDate;}

    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    public String getUrl()  {return mUrl;}
}
