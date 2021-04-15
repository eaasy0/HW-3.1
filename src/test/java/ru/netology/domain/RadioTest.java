package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio();

    @Test
    void stationNumberPositive() {
        Radio radio = new Radio((short) 10);
        radio.setStationNumber((short) 1);
        assertEquals(1, radio.getStationNumber());
    }

    @Test
    void stationNumberNegative2() {
        Radio radio = new Radio((short) 10);
        radio.setStationNumber((short) 0);
        assertEquals(10, radio.getStationNumber());
    }
    @Test
    void stationWithDefaultNumberPositive() {
        radio.setStation(5);
        assertEquals(5, radio.getStation());
    }
    @Test
    void stationWithDefaultNumberNegative() {
        radio.setStation(11);
        assertEquals(0, radio.getStation());
    }

    @Test
    void stationWithDefaultNumberNegative2() {
        radio.setStation(-1);
        assertEquals(0, radio.getStation());
    }


    @Test
    void stationWithCustomNumberPositive() {
        Radio radio = new Radio((short) 120);
        radio.setStationNumber((short) 60);
        radio.setStation(30);
        assertEquals(30, radio.getStation());
    }

    @Test
    void stationWithCustomNumberNegative() {
        Radio radio = new Radio((short) 120);
        radio.setStationNumber((short) 60);
        radio.setStation(61);
        assertEquals(0, radio.getStation());
    }
    @Test
    void stationWithCustomNumberNegative2() {
        Radio radio = new Radio((short) 120);
        radio.setStationNumber((short) 60);
        radio.setStation(-1);
        assertEquals(0, radio.getStation());
    }
    @Test
    void switchStationUpDefault() {
        Radio radio = new Radio("Max", 9);
        radio.switchStationUp();
        radio.switchStationUp();
        assertEquals(0, radio.getStation());
    }
    @Test
    void switchStationDownDefault() {
        Radio radio = new Radio("Min", 1);
        radio.switchStationDown();
        radio.switchStationDown();
        assertEquals(10, radio.getStation());
    }



    @Test
    void upVolumeToMax() {
        Radio radio = new Radio(99);
        radio.upVolume();
        radio.upVolume();
        assertEquals(100, radio.getVolume());
    }

    @Test
    void downVolumeToMin() {
        Radio radio = new Radio(1);
        radio.downVolume();
        radio.downVolume();
        assertEquals(0, radio.getVolume());
    }



    @Test
    void setVolumeNegative() {
        Radio radio = new Radio(101);
        assertEquals(20, radio.getVolume());
    }

    @Test
    void setVolumeNegative2() {
        Radio radio = new Radio(-1);
        assertEquals(20, radio.getVolume());
    }


}

