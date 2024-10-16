package me.dslztx.dp;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

@Slf4j
class LISTest {

    @Test
    public void test0() {
        try {

            int[] nums = new int[]{10, 9, 2, 5, 3, 7, 101, 18};

            LIS lis = new LIS(nums);
            lis.buildDP();

            Assertions.assertTrue(lis.obtainLISValue() == 4);

        } catch (Exception e) {
            log.error("", e);
            Assertions.fail();
        }
    }
}