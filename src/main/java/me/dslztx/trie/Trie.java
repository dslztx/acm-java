package me.dslztx.trie;

import java.util.ArrayList;
import java.util.List;

public class Trie<V> {

    TrieNode<V> root = new TrieNode<V>();

    public void addPath(char[] charArray, V value) {
        if (charArray == null || charArray.length == 0) {
            return;
        }

        TrieNode<V> parent = root;
        for (char c : charArray) {
            parent = parent.addChildNode(c);
        }

        parent.addValueForPathEndNode(value);
    }

    public List<V> findAllPrefixPathValueList(char[] charArray) {

        List<V> result = new ArrayList<>();

        if (charArray == null || charArray.length == 0) {
            return result;
        }

        TrieNode<V> parent = root;

        for (char c : charArray) {

            parent = parent.findChildNode(c);

            if (parent == null) {
                break;
            }

            if (parent.isPathEndNode()) {
                result.addAll(parent.obtainValueList());
            }

        }

        return result;
    }
}
