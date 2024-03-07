import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;
import ru.netology.Radio;

public class RadioTest {

    @Test
    public void shouldtSetRadiostation() {
        Radio radio = new Radio();
        radio.setCurrentRadiation(6);
        int expected = 6;
        int actual = radio.getcurrentRadiation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldtSetRadiostationOverMax() {
        Radio radio = new Radio();
        radio.setCurrentRadiation(6);
        radio.setCurrentRadiation(15);
        int expected = 6;
        int actual = radio.getcurrentRadiation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldtSetRadiostationUnderMin() {
        Radio radio = new Radio();
        radio.setCurrentRadiation(6);
        radio.setCurrentRadiation(-2);
        int expected = 6;
        int actual = radio.getcurrentRadiation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldtSetNextRadiostation() {
        Radio radio = new Radio();
        radio.setCurrentRadiation(6);
        radio.next();
        int expected = 7;
        int actual = radio.getcurrentRadiation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldtSetNextRadiostationIfNinth() {
        Radio radio = new Radio();
        radio.setCurrentRadiation(9);
        radio.next();
        int expected = 0;
        int actual = radio.getcurrentRadiation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldtSetPrevRadiostation() {
        Radio radio = new Radio();
        radio.setCurrentRadiation(6);
        radio.prev();
        int expected = 5;
        int actual = radio.getcurrentRadiation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldtSetPrevRadiostationIfZero() {
        Radio radio = new Radio();
        radio.setCurrentRadiation(0);
        radio.prev();
        int expected = 9;
        int actual = radio.getcurrentRadiation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();
        for (int i = 0; i < 3; i++) {
            radio.volumeUp();
        }
        int expected = 3;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseVolumeOverMax() {
        Radio radio = new Radio();
        for (int i = 0; i < 300; i++) {
            radio.volumeUp();
        }
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotDecreaseVolumeOverMin() {
        Radio radio = new Radio();
        for (int i = 0; i < 3; i++) {
            radio.volumeDown();
        }
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio();
        for (int i = 0; i < 55; i++) {
            radio.volumeUp();
        }
        for (int i = 0; i < 20; i++) {
            radio.volumeDown();
        }
        int expected = 35;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}

