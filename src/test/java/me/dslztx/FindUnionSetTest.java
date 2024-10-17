package me.dslztx;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

@Slf4j
class FindUnionSetTest {

    @Test
    public void test0() {
        try {

            FindUnionSet fus = new FindUnionSet(new int[100]);

            Assertions.assertTrue(fus.find(10) == 10);

            fus.union(10, 20);
            fus.union(30, 20);
            fus.union(30, 40);
            fus.union(99, 10);
            fus.union(40, 10);

            Assertions.assertTrue(fus.find(10) == fus.find(40));
        } catch (Exception e) {
            log.error("", e);
            Assertions.fail();
        }
    }
}