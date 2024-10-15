package me.dslztx.dp.pack;

import lombok.extern.slf4j.Slf4j;
import me.dslztx.dp.pack.OneZeroPack;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

@Slf4j
class OneZeroPackTest {

    @Test
    public void test0() {
        try {
            int[] weight = new int[] {2, 3, 4, 5};
            int[] value = new int[] {3, 4, 5, 6};
            int volume = 8;

            OneZeroPack oneZeroPack = new OneZeroPack(volume, weight, value);
            oneZeroPack.buildDP();

            Assertions.assertTrue(oneZeroPack.obtainDPValue() == 10);
        } catch (Exception e) {
            log.error("", e);
            Assertions.fail();
        }
    }

    @Test
    public void test1() {
        try {
            int[] weight = new int[] {200, 600, 100, 180, 300, 450};
            int[] value = new int[] {6, 10, 3, 4, 5, 8};
            int volume = 1000;

            OneZeroPack oneZeroPack = new OneZeroPack(volume, weight, value);
            oneZeroPack.buildDP();

            Assertions.assertTrue(oneZeroPack.obtainDPValue() == 21);
        } catch (Exception e) {
            log.error("", e);
            Assertions.fail();
        }
    }

    @Test
    public void test2() {
        try {
            int[] weight = new int[] {95, 4, 60, 32, 23, 72, 80, 62, 65, 46};
            int[] value = new int[] {55, 10, 47, 5, 4, 50, 8, 61, 85, 87};
            int volume = 269;

            OneZeroPack oneZeroPack = new OneZeroPack(volume, weight, value);
            oneZeroPack.buildDP();

            Assertions.assertTrue(oneZeroPack.obtainDPValue() == 295);
        } catch (Exception e) {
            log.error("", e);
            Assertions.fail();
        }
    }

    @Test
    public void test3() {
        try {
            int[] weight = new int[] {92, 4, 43, 83, 84, 68, 92, 82, 6, 44, 32, 18, 56, 83, 25, 96, 70, 48, 14, 58};
            int[] value = new int[] {44, 46, 90, 72, 91, 40, 75, 35, 8, 54, 78, 40, 77, 15, 61, 17, 75, 29, 75, 63};
            int volume = 878;

            OneZeroPack oneZeroPack = new OneZeroPack(volume, weight, value);
            oneZeroPack.buildDP();

            Assertions.assertTrue(oneZeroPack.obtainDPValue() == 1024);
        } catch (Exception e) {
            log.error("", e);
            Assertions.fail();
        }
    }
}