package ru.netology;

public class Radio {
    private int currentRadiation;
    private int currentVolume;

    public int getcurrentRadiation() {
        return currentRadiation;
    }

    public void setCurrentRadiation(int newCurrentRadiostation) {
        if (newCurrentRadiostation <= 9) {
            if (newCurrentRadiostation >= 0) {
                this.currentRadiation = newCurrentRadiostation;
            }
        }
    }

    public void next() {
        if (currentRadiation == 9) {
            currentRadiation = 0;
        } else {
            currentRadiation++;
        }
    }

    public void prev() {
        if (currentRadiation == 0) {
            currentRadiation = 9;
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

