package com.tts;

public class Holiday {

    private String season;
    private int date;
    private String colors;
    private boolean celebration;

    public Holiday() {

    }

    public Holiday(String season, int date) {
        this.season = season;
        this.date = date;
    }

    public Holiday(String season, int date, String colors){
         this.season = season;
         this.date = date;
         this.colors= colors;
        if (celebration) this.celebration = true;
        else {
            this.celebration = false;
        }
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getColors() {
        return colors;
    }

    public void setColors(String colors) {
        this.colors = colors;
    }

    public boolean isCelebration() {
        return celebration;
    }

    public void setCelebration(boolean celebration) {
        this.celebration = celebration;
    }
}
