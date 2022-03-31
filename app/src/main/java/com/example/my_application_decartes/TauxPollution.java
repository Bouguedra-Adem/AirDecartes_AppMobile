package com.example.my_application_decartes;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
public class TauxPollution {

    //private int id;
    private int codecapteur;
    private String capteurfullname;
    private String dimension ;
    private String batterylifetime ;
    private String instalation ;
    private float temperature ;
    private float co2 ;
    private float pression ;
    private float humidity ;
    private float lat ;
    private float lng ;
    private String address ;
    private String capteurdistance ;
    private int yearobservation ;
    private int  monthobservation ;
    private int  dayobservation ;
    private int  hourobservation ;
    private int  minuteobservation ;

    //Getters
    //public int getId() {
        //return id;
    //}

    public int getCodecapteur() {
        return codecapteur;
    }

    public String getCapteurfullname() {
        return capteurfullname;
    }

    public String getDimension() {
        return dimension;
    }

    public String getBatterylifetime() {
        return batterylifetime;
    }

    public String getInstalation() {
        return instalation;
    }

    public float getTemperature() {
        return temperature;
    }

    public float getCo2() {
        return co2;
    }

    public float getPression() {
        return pression;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getLat() {
        return lat;
    }

    public float getLng() {
        return lng;
    }

    public String getAddress() {
        return address;
    }

    public String getCapteurdistance() {
        return capteurdistance;
    }

    public int getYearobservation() {
        return yearobservation;
    }

    public int getMonthobservation() {
        return monthobservation;
    }

    public int getDayobservation() {
        return dayobservation;
    }

    public int getHourobservation() {
        return hourobservation;
    }

    public int getMinuteobservation() {
        return minuteobservation;
    }

    //Setters

   //public void setId(int id) {
       // this.id = id;
    //}

    public void setCodecapteur(int codecapteur) {
        this.codecapteur = codecapteur;
    }

    public void setCapteurfullname(String capteurfullname) {
        this.capteurfullname = capteurfullname;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    public void setBatterylifetime(String batterylifetime) {
        this.batterylifetime = batterylifetime;
    }

    public void setInstalation(String instalation) {
        this.instalation = instalation;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public void setCo2(float co2) {
        this.co2 = co2;
    }

    public void setPression(float pression) {
        this.pression = pression;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public void setLat(float lat) {
        this.lat = lat;
    }

    public void setLng(float lng) {
        this.lng = lng;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCapteurdistance(String capteurdistance) {
        this.capteurdistance = capteurdistance;
    }

    public void setYearobservation(int yearobservation) {
        this.yearobservation = yearobservation;
    }

    public void setMonthobservation(int monthobservation) {
        this.monthobservation = monthobservation;
    }

    public void setDayobservation(int dayobservation) {
        this.dayobservation = dayobservation;
    }

    public void setHourobservation(int hourobservation) {
        this.hourobservation = hourobservation;
    }

    public void setMinuteobservation(int minuteobservation) {
        this.minuteobservation = minuteobservation;
    }


    //toString

    @Override
    public String toString() {
        return "TauxPollution{" +
                //"id=" + id +
                ", codecapteur=" + codecapteur +
                ", capteurfullname='" + capteurfullname + '\'' +
                ", dimension='" + dimension + '\'' +
                ", batterylifetime='" + batterylifetime + '\'' +
                ", instalation='" + instalation + '\'' +
                ", temperature=" + temperature +
                ", co2=" + co2 +
                ", pression=" + pression +
                ", humidity=" + humidity +
                ", lat=" + lat +
                ", lng=" + lng +
                ", address='" + address + '\'' +
                ", capteurdistance='" + capteurdistance + '\'' +
                ", yearobservation=" + yearobservation +
                ", monthobservation=" + monthobservation +
                ", dayobservation=" + dayobservation +
                ", hourobservation=" + hourobservation +
                ", minuteobservation=" + minuteobservation +
                '}';
    }





    // Anciens data
    /*
    private String Year;
    private String Month;
    private String Day;
    private String Location;
    private String Country;
    private String Latitude;
    private String Longitude;
    private String CO2;
    private String Pollution;
    private String Temperature;
    private String Humidite;

    @Override
    public String toString() {
        return "TauxPollution{" +
                "Year='" + Year + '\'' +
                ", Month='" + Month + '\'' +
                ", Day='" + Day + '\'' +
                ", Location='" + Location + '\'' +
                ", Country='" + Country + '\'' +
                ", Latitude='" + Latitude + '\'' +
                ", Longitude='" + Longitude + '\'' +
                ", CO2='" + CO2 + '\'' +
                ", Pollution='" + Pollution + '\'' +
                ", Temperature='" + Temperature + '\'' +
                ", Humidite='" + Humidite + '\'' +
                '}';
    }



    public String getYear() {
        return Year;
    }

    public void setYear(String year) {
        Year = year;
    }

    public String getMonth() {
        return Month;
    }

    public void setMonth(String month) {
        Month = month;
    }

    public String getDay() {
        return Day;
    }

    public void setDay(String day) {
        Day = day;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getLatitude() {
        return Latitude;
    }

    public void setLatitude(String latitude) {
        Latitude = latitude;
    }

    public String getLongitude() {
        return Longitude;
    }

    public void setLongitude(String longitude) {
        Longitude = longitude;
    }

    public String getCO2() {
        return CO2;
    }

    public void setCO2(String CO2) {
        this.CO2 = CO2;
    }

    public String getPollution() {
        return Pollution;
    }

    public void setPollution(String pollution) {
        Pollution = pollution;
    }

    public String getTemperature() {
        return Temperature;
    }

    public void setTemperature(String temperature) {
        Temperature = temperature;
    }

    public String getHumidite() {
        return Humidite;
    }

    public void setHumidite(String humidite) {
        Humidite = humidite;
    }*/
}
