package me.dslztx.dp.pack;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

@Slf4j
class CompletePackTest {

    @Test
    public void test0() {
        try {
            int[] weight = new int[]{2, 3, 4, 5};
            int[] value = new int[]{2, 4, 5, 6};
            int volume = 8;

            CompletePack completePack = new CompletePack(volume, weight, value);
            completePack.buildDP();

            Assertions.assertTrue(completePack.obtainDPValue() == 10);
        } catch (Exception e) {
            log.error("", e);
            Assertions.fail();
        }
    }

    @Test
    public void test1() {
        try {
            int[] weight = new int[]{200, 600, 100, 180, 300, 450};
            int[] value = new int[]{6, 10, 3, 4, 5, 8};
            int volume = 1000;

            CompletePack completePack = new CompletePack(volume, weight, value);
            completePack.buildDP();

            Assertions.assertTrue(completePack.obtainDPValue() == 30);
        } catch (Exception e) {
            log.error("", e);
            Assertions.fail();
        }
    }

    @Test
    public void test2() {
        try {
            int[] weight = new int[]{201, 600, 100, 200, 300, 450};
            int[] value = new int[]{6, 6, 1, 1, 5, 8};
            int volume = 1000;

            CompletePack completePack = new CompletePack(volume, weight, value);
            completePack.buildDP();

            Assertions.assertTrue(completePack.obtainDPValue() == 25);
        } catch (Exception e) {
            log.error("", e);
            Assertions.fail();
        }
    }

    @Test
    public void test3() {
        try {
            int[] weight = new int[]{199, 600, 100, 200, 300, 450};
            int[] value = new int[]{6, 6, 1, 1, 5, 8};
            int volume = 1000;

            CompletePack completePack = new CompletePack(volume, weight, value);
            completePack.buildDP();

            Assertions.assertTrue(completePack.obtainDPValue() == 30);
        } catch (Exception e) {
            log.error("", e);
            Assertions.fail();
        }
    }

}