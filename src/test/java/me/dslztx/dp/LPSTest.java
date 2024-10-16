package me.dslztx.dp;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

@Slf4j
class LPSTest {

    @Test
    public void test0() {
        try {
            char[] c = "111111abcdefggfedcbaxxx00000fdas".toCharArray();

            LPS lps = new LPS(c);
            lps.buildDP();

            Assertions.assertTrue(lps.obtainLPSValue() == 14);
        } catch (Exception e) {
            log.error("", e);
            Assertions.fail();
        }
    }
}