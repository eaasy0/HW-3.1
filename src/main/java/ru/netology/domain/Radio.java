package ru.netology.domain;

public class Radio {

    private int station = 0;
    private int volume = 3;

    public void setStation(int station) {
        if (station > 9) {
            return;
        }
        if (station < 0) {
            return;
        }
        this.station = station;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void switchStationUp() {
        if (station == 9) {
            setStation(0);
            return;
        }
        setStation(station + 1);
    }

    public void switchStationDown() {
        if (station == 0) {
            setStation(9);
            return;
        }
        setStation(station - 1);
    }

    public void upVolume() {
        if (volume == 10) {
            return;
        }
        setVolume(volume + 1);
    }

    public void downVolume() {
        if (volume == 0) {
            return;
        }
        setVolume(volume - 1);
    }

    public int getVolume() {
        return volume;
    }


    public int getStation() {
        return station;
    }
}



