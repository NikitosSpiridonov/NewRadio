package ru.netology;

public class Radio {
    private int currentRadiation;
    private int currentVolume;
    private final int limitOfRadiostation;

    public Radio() {
        this.limitOfRadiostation = 10;
    }

    public Radio(int limitOfRadiostation) {
        this.limitOfRadiostation = limitOfRadiostation;
    }

    public int getcurrentRadiation() {
        return currentRadiation;
    }

    public void setCurrentRadiation(int newCurrentRadiostation) {
        if (newCurrentRadiostation <= limitOfRadiostation - 1) {
            if (newCurrentRadiostation >= 0) {
                this.currentRadiation = newCurrentRadiostation;
            }
        }
    }

    public void next() {
        if (currentRadiation == limitOfRadiostation - 1) {
            currentRadiation = 0;
        } else {
            currentRadiation++;
        }
    }

    public void prev() {
        if (currentRadiation == 0) {
            currentRadiation = limitOfRadiostation - 1;
        } else {
            currentRadiation--;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }


    public void volumeUp() {
        if (currentVolume < 100) {
            currentVolume++;
        }
    }

    public void volumeDown() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }
}

