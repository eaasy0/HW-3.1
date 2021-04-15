package ru.netology.domain;

public class Radio {

    private String radioName = "ROCKET";
    private int station;
    private short stationNumber = 10;
    private int volume = 20;


    public Radio() {
    }

    public Radio(int volume) {
        if (volume > 100) {
            return;
        }
        if (volume < 0) {
            return;
        }
        this.volume = volume;
    }
    public Radio(short stationNumber) {
        setStationNumber(stationNumber);
    }

    public Radio(String radioName, int station) {
        this.radioName = radioName;
        setStation(station);
    }
    public void setStationNumber(short stationNumber) {

        if (stationNumber < 1) {
            return;
        }
        this.stationNumber = stationNumber;
    }

    public short getStationNumber() {
        return stationNumber;
    }

    public void setStation(int station) {
        if (station > stationNumber) {
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
        if (station == stationNumber) {
            setStation(0);
            return;
        }
        setStation(++station);
    }

    public void switchStationDown() {
        if (station == 0) {
            setStation(stationNumber);
            return;
        }
        setStation(--station);
    }

    public void upVolume() {
        if (volume == 100) {
            return;
        }
        setVolume(++volume);
    }

    public void downVolume() {
        if (volume == 0) {
            return;
        }
        setVolume(--volume);
    }

    public int getVolume() {
        return volume;
    }


    public int getStation() {
        return station;
    }
}



