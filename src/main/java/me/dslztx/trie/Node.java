package me.dslztx.trie;

import java.util.*;

public class Node<V> {

    private Map<Character, Node<V>> childrenMap;

    private List<V> valueList;

    public Node<V> addChildNode(Character c) {
        if (childrenMap == null) {
            childrenMap = new HashMap<>();
        }

        if (childrenMap.get(c) == null) {
            Node<V> node = new Node<V>();
            childrenMap.put(c, node);
        }

        return childrenMap.get(c);
    }

    public Node<V> findChildNode(Character c) {
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
