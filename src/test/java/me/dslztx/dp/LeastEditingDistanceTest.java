package me.dslztx.dp;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

@Slf4j
class LeastEditingDistanceTest {


    @Test
    public void test0() {
        try {
            char[] s = "abcdefg".toCharArray();
            char[] e = "abcedf".toCharArray();

            LeastEditingDistance leastEditingDistance = new LeastEditingDistance(s, e);
            leastEditingDistance.buildDP();

            Assertions.assertTrue(leastEditingDistance.obtainLeastEditingDistanceValue() == 3);

        } catch (Exception e) {
            log.error("", e);
            Assertions.fail();
        }
    }


    @Test
    public void test1() {
        try {
            char[] s = "horse".toCharArray();
            char[] e = "ros".toCharArray();

            LeastEditingDistance leastEditingDistance = new LeastEditingDistance(s, e);
            leastEditingDistance.buildDP();

            Assertions.assertTrue(leastEditingDistance.obtainLeastEditingDistanceValue() == 3);

        } catch (Exception e) {
            log.error("", e);
            Assertions.fail();
        }
    }

    @Test
    public void test2() {
        try {
            char[] s = "intention".toCharArray();
            char[] e = "execution".toCharArray();

            LeastEditingDistance leastEditingDistance = new LeastEditingDistance(s, e);
            leastEditingDistance.buildDP();

            Assertions.assertTrue(leastEditingDistance.obtainLeastEditingDistanceValue() == 5);

        } catch (Exception e) {
            log.error("", e);
            Assertions.fail();
        }
    }
}