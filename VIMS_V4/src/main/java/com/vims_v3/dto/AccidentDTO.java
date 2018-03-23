package com.vims_v3.dto;


import java.io.Serializable;



public class AccidentDTO implements Serializable{
    private Integer accidentId;
    private String latitude;
    private String longtitude;

    public Integer getAccidentId() {
        return accidentId;
    }

    public void setAccidentId(Integer accidentId) {
        this.accidentId = accidentId;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongtitude() {
        return longtitude;
    }

    public void setLongtitude(String longtitude) {
        this.longtitude = longtitude;
    }

    public AccidentDTO(Integer id,String lat,String longt)
    {
        this.accidentId = id;
        this.latitude = lat;
        this.longtitude = longt;
    }

}
