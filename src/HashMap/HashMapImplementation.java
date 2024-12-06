package HashMap;

import java.util.LinkedList;

public class HashMapImplementation {
    public static void main(String[] args) {
        HashMap<String, Integer> map1 = new HashMap<>();
        map1.put("a", 1);
        map1.put("b", 2);
        map1.put("c", 3);
        map1.put("d", 4);
        System.out.println("size " + map1.size());
        System.out.println("get " + map1.get("b"));
        System.out.println("get " + map1.get("f"));
        System.out.println(map1.remove("c"));

    }

    static class HashMap<K, V> {

        public static final int DEFAULT_CAPACITY = 4;
        public static final float DEFAULT_LOAD_FACTOR = 0.75F;
        public int n; // no of entries in bucket
        public LinkedList<Node>[] bucket;

        public HashMap() {
            initBuckets(DEFAULT_CAPACITY);
        }

        int size() {   // Return no of entries
            return n;
        }

        void initBuckets(int N) {
            bucket = new LinkedList[N];
            for (int i = 0; i < N; i++) {
                bucket[i] = new LinkedList<>();
            }
        }

        void put(K key, V value) {
            int bi = HashFunc(key);
            LinkedList<Node> currBucket = bucket[bi];
            int ei = searchInBuckets(currBucket, key);
            if (ei == -1) {
                Node node = new Node(key, value);
                currBucket.add(node);
                n++;
            } else {
                Node currNode = currBucket.get(ei);
                currNode.value = value;
            }
            if (n>= bucket.length*DEFAULT_LOAD_FACTOR){
                rehash();
            }
        }

        private void rehash() {
            LinkedList<Node>[] oldBucket=bucket;
            initBuckets(oldBucket.length*2);
            n=0;
            for (var bucket:oldBucket){
                for (var node:bucket){
                    put(node.key,node.value);
                }
            }
        }

        int searchInBuckets(LinkedList<Node> currBucketList, K key) {
            for (int i = 0; i < currBucketList.size(); i++) {
                if (currBucketList.get(i).key == key) {
                    return i;
                }
            }
            return -1;
        }

        int HashFunc(K key) {
            int hc = key.hashCode();
            return Math.abs(hc) % bucket.length;
        }

        V get(K key) {
            int bi = HashFunc(key);
            LinkedList<Node> currBucket = bucket[bi];
            int ei = searchInBuckets(currBucket, key);
            if (ei != -1) {  // key exists
                Node currNode = currBucket.get(ei);
                return currNode.value;
            }
            // key doesn't exist
            return null;
        }

        V remove(K key) {
            int bi = HashFunc(key);
            LinkedList<Node> currBucket = bucket[bi];
            int ei = searchInBuckets(currBucket, key);
            if (ei != -1) {
                Node currNode = currBucket.get(ei);
                V val = currNode.value;
                currBucket.remove(ei);
                n--;
                return val;
            }
            return null;
        }


        class Node {

            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }
    }
}
