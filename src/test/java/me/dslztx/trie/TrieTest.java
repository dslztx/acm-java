package me.dslztx.trie;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

@Slf4j
public class TrieTest {

    @Test
    public void test0() {
        try {
            Trie<Long> trie = new Trie<Long>();
            trie.addPath("he".toCharArray(), 1L);
            trie.addPath("hello".toCharArray(), 2L);

            List<Long> result = trie.findAllPrefixPathValueList("hello".toCharArray());

            Assertions.assertTrue(result.size() == 2);
            Assertions.assertTrue(result.get(0).equals(1L));
            Assertions.assertTrue(result.get(1).equals(2L));
        } catch (Exception e) {
            log.error("", e);
            Assertions.fail();
        }
    }
}