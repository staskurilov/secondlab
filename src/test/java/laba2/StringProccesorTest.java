package laba2;

import org.example.StringProccesor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringProccesorTest {
    @Test
    public void multiplyOfString() {
        Assertions.assertEquals("хихихи", StringProccesor.multiplyOfString("хи", 3));
        Assertions.assertEquals("123123123", StringProccesor.multiplyOfString("123", 3));
        Assertions.assertEquals("", StringProccesor.multiplyOfString("", 3));
        Assertions.assertEquals("", StringProccesor.multiplyOfString("", 0));
    }

    @Test
    public void multiplyOfError() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> StringProccesor.multiplyOfString("", -1));
    }


    @Test
    public void searchForSubstring() {
        Assertions.assertEquals(3, StringProccesor.searchForSubstring("123123123", "123"));
        Assertions.assertEquals(2, StringProccesor.searchForSubstring("aaa", "aa"));

    }

    @Test
    public void replaceNums() {
        Assertions.assertEquals("Дайте один самолет, два крыла и три пассажира", StringProccesor.replaceNums("Дайте 1 самолет, 2 крыла и 3 пассажира"));
        Assertions.assertEquals("одинодинодинодин4", StringProccesor.replaceNums("11114"));
    }

    @Test
    public void delStr() {
        Assertions.assertEquals(new StringBuilder("1111").toString(), StringProccesor.delStr(new StringBuilder("12121212")).toString());
    }

    @Test
    public void searchForSubstringErrors() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> StringProccesor.searchForSubstring("132", ""));
    }


}