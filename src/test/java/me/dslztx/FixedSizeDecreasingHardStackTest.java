package me.dslztx;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

@Slf4j
class FixedSizeDecreasingHardStackTest {

    @Test
    public void test0() {
        try {
            FixedSizeDecreasingHardStack fixedSizeDecreasingHardStack = new FixedSizeDecreasingHardStack(3);

            fixedSizeDecreasingHardStack.push(3, 8);
            fixedSizeDecreasingHardStack.push(2, 7);
            fixedSizeDecreasingHardStack.push(4, 6);
            fixedSizeDecreasingHardStack.push(5, 5);
            fixedSizeDecreasingHardStack.push(7, 4);
            fixedSizeDecreasingHardStack.push(6, 3);
            fixedSizeDecreasingHardStack.push(5, 2);
            fixedSizeDecreasingHardStack.push(8, 1);

            Assertions.assertTrue(Arrays.equals(fixedSizeDecreasingHardStack.obtainData(), new int[] {7, 6, 8}));
            
        } catch (Exception e) {
            log.error("", e);
            Assertions.fail();
        }
    }
}