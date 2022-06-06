import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.radio.Radio;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    // ПЕРЕКЛЮЧЕНИЕ СТАНЦИЙ
    @ParameterizedTest
    @CsvFileSource(resources = "/testDataStationSetCurrent.csv")
    void StationNumberSetCurrentTest(int currentStation, int expected) {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(currentStation);


        int actual = radio.getStationNumber();

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/testDataStationSet.csv")
    void StationNumberSetTest(int currentStation, int expected) {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(currentStation);

        int actual = radio.setNumber(currentStation);

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/testDataStationPrev.csv")
    void StationNumberPrevTest(int currentStation, int expected) {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(currentStation);
        radio.pressPrev();

        int actual = radio.getStationNumber();
        //int expected = 9;

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/testDataStationNext.csv")
    void StationNumberNextTest(int currentStation, int expected) {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(currentStation);
        radio.pressNext();
        int actual = radio.getStationNumber();
        //int expected = 9;

        assertEquals(expected, actual);
    }

    // РЕГУЛИРОВКА ГРОМКОСТИ
    @ParameterizedTest
    @CsvFileSource(resources = "/testDataVolumeSetCurrent.csv")
    void StationVolCurrentSetTest(int currentVolume, int expected) {
        Radio radio = new Radio();
        radio.setCurrentVolume(currentVolume);

        int actual = radio.getVolume();

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/testDataVolumeUp.csv")
    void StationVolUpTest(int currentVolume, int expected) {
        Radio radio = new Radio();
        radio.setCurrentVolume(currentVolume);

        int actual = radio.volumeUp(currentVolume);
        ;

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/testDataVolumeDown.csv")
    void StationVolDownTest(int currentVolume, int expected) {
        Radio radio = new Radio();
        radio.setCurrentVolume(currentVolume);

        int actual = radio.volumeDown(currentVolume);
        ;

        assertEquals(expected, actual);
    }

}
