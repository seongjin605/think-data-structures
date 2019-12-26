package data.structure;

import java.util.LinkedList;

class HashTable {
    class Node {
        String key; // 검색할 키
        String value; // 검색 결과 value
        public Node(String key, String value) {
            this.key = key;
            this.value = value;
        }
        String getValue() {
            return value;
        }
        void value(String value) {
            this.value = value;
        }
    }
    LinkedList<Node>[] data;
    // 해시 테이블을 생성할 때, 얼마의 크기로 만들건지 배열의 방을 미리 만들어 놓음.
    HashTable(int size) {
        this.data = new LinkedList[size];
    }
    int getHashCode(String key) {
        int hashcode = 0;
        for(char c : key.toCharArray()) {
            hashcode +=c;
        }
        return hashcode;
    }
    // 해시코드를 받아서 배열의 인덱스로 변환
    int convertToIndex(int hashcode) {
         return hashcode % data.length;
    }
    // 인덱스로 배열 방을 찾은 이후, 배열방의 노드가 여러개 존재하는 경우, 검색 키를 가지고 해당 노드를 찾는다.
    Node searchKey(LinkedList<Node> list, String key) {
        if(list == null) return null;
        for(Node node : list) {
            if(node.key.equals(key)) {
                return node;
            }
        }
        return null;
    }
    void put(String key, String value) {
        int haschdoe = getHashCode(key);
        int index = convertToIndex(haschdoe);
        LinkedList<Node> list = data[index];
        if(list == null) {
            list = new LinkedList<Node>();
            data[index] = list;
        }
        Node node = searchKey(list, key);
        if(node == null) {
            list.addLast(new Node(key, value));
        } else {
            node.value(value);
        }
    }
    String get(String key) {
        int hashcode = getHashCode(key);
        int index = convertToIndex(hashcode);
        LinkedList<Node> list = data[index];
        Node node = searchKey(list, key);
        return node == null ? "Not Found" : node.getValue();
    }
}

public class HashTableMain {
    public static void main(String[] args) {
        HashTable hashTable = new HashTable(3);
        hashTable.put("key1","value1");
        hashTable.put("key2","value2");
        hashTable.put("key3","value3");

        String key = hashTable.get("key1");
        System.out.println(key);
    }
}
