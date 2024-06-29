import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void test1() {
        Radio radio = new Radio();

        radio.setCurrentStation(6);

        int actual = radio.getCurrentStation();
        int expected = 6;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void test2() {
        Radio radio = new Radio();

        radio.setCurrentStation(-1);

        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);

        int actual = radio.getCurrentStation();
        int expected = -0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test4() {
        Radio radio = new Radio();

        radio.setCurrentStation(1);

        int actual = radio.getCurrentStation();
        int expected = 1;
        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void testRadioNext1() {
        Radio radio = new Radio();

        radio.setCurrentStation(6);
        radio.nex();

        int actual = radio.getCurrentStation();
        int expected = 7;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testRadioNext2() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);
        radio.nex();

        int actual = radio.getCurrentStation();
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testRadioNext3() {
        Radio radio = new Radio();

        radio.setCurrentStation(1);
        radio.nex();

        int actual = radio.getCurrentStation();
        int expected = 2;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testRadioNext4() {
        Radio radio = new Radio();

        radio.setCurrentStation(8);
        radio.nex();

        int actual = radio.getCurrentStation();
        int expected = 9;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testRadioNext5() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);
        radio.nex();

        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testRadioPrev() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);
        radio.prev();

        int actual = radio.getCurrentStation();
        int expected = 9;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testRadioPrev1() {
        Radio radio = new Radio();

        radio.setCurrentStation(1);
        radio.prev();

        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testRadioPrev2() {
        Radio radio = new Radio();

        radio.setCurrentStation(2);
        radio.prev();

        int actual = radio.getCurrentStation();
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testRadioPrev3() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);
        radio.prev();

        int actual = radio.getCurrentStation();
        int expected = 8;
        Assertions.assertEquals(expected, actual);
    }
}



