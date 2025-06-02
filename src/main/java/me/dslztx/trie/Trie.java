package me.dslztx.trie;

import java.util.ArrayList;
import java.util.List;

public class Trie<V> {

    Node<V> root = new Node<V>();

    public void addPath(char[] charArray, V value) {
        if (charArray == null) {
            return;
        }

        Node<V> parent = root;
        for (char c : charArray) {
            parent = parent.addChildNode(c);
        }

        parent.addValueForPathEndNode(value);
    }

    public List<V> findAllPrefixPathValueList(char[] charArray) {

        List<V> result = new ArrayList<>();

        if (charArray == null) {
            return result;
        }

        Node<V> parent = root;

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
