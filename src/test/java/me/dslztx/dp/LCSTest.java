package me.dslztx.dp;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
class LCSTest {

    @Test
    public void test0() {
        try {
            char[] sm = new char[] {'1', '5', '2', '6', '8', '7'};
            char[] sn = new char[] {'2', '3', '5', '6', '9', '8', '4'};

            LCS lcs = new LCS(sm, sn);
            lcs.buildDP();

            Assertions.assertTrue(lcs.obtainLCSValue() == 3);
        } catch (Exception e) {
            log.error("", e);
            Assertions.fail();
        }
    }
}