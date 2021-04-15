package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio();

    @Test
    void SwitchStationUp() {
        radio.switchStationUp();
        radio.switchStationUp();
        radio.switchStationUp();
        radio.switchStationUp();
        radio.switchStationUp();
        radio.switchStationUp();
        radio.switchStationUp();
        radio.switchStationUp();
        radio.switchStationUp();
        radio.switchStationUp();
        assertEquals(0, radio.getStation());

    }

    @Test
    void SwitchStationDown() {
        radio.switchStationDown();
        radio.switchStationDown();
        assertEquals(8, radio.getStation());
    }

    @Test
    void SetStationPositive() {
        radio.setStation(7);
        assertEquals(7, radio.getStation());
    }
    @Test
    void SetStationNegative() {
        radio.setStation(60);
        assertEquals(0, radio.getStation());
    }

    @Test
    void SetStationNegative2() {
        radio.setStation(-90);
        assertEquals(0, radio.getStation());
    }

    @Test
    void UpVolume() {
        radio.upVolume();
        radio.upVolume();
        radio.upVolume();
        radio.upVolume();
        radio.upVolume();
        radio.upVolume();
        radio.upVolume();
        radio.upVolume();
        assertEquals(10, radio.getVolume());
    }

    @Test
    void DownVolume() {
        radio.downVolume();
        radio.downVolume();
        radio.downVolume();
        radio.downVolume();

        assertEquals(0, radio.getVolume());
    }
}