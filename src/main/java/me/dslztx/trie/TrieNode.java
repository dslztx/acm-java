package me.dslztx.trie;

import java.util.*;

public class TrieNode<V> {

    private Map<Character, TrieNode<V>> childrenMap;

    private List<V> valueList;

    public TrieNode<V> addChildNode(Character c) {
        if (childrenMap == null) {
            childrenMap = new HashMap<>();
        }

        if (childrenMap.get(c) == null) {
            TrieNode<V> trieNode = new TrieNode<V>();
            childrenMap.put(c, trieNode);
        }

        return childrenMap.get(c);
    }

    public TrieNode<V> findChildNode(Character c) {
        if (childrenMap == null) {
            return null;
        }

        return childrenMap.get(c);
    }

    public boolean isPathEndNode() {
        return valueList != null && !valueList.isEmpty();
    }

    public void addValueForPathEndNode(V value) {

        if (valueList == null) {
            valueList = new ArrayList<>();
        }

        valueList.add(value);
    }

    public List<V> obtainValueList() {
        return valueList;
    }

}
