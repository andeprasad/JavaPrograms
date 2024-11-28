public class GFG_MinMaxUsingClass {
    public static void main(String[] args) {
        // int[] arr = {3, 2, 1, 56, 10000, 167};
        int[] arr = {1, 345, 234, 0, 21, 56789};
        System.out.println("The Output is : " + getMinMax(arr).getKey() + " and the Max Value is : " + getMinMax(arr).getValue());
    }
    
    @SuppressWarnings({ "rawtypes", "unchecked" })
    static public Pair<Long, Long> getMinMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];

        for(int i=1;i<arr.length;i++)
        {
            if(min < arr[i])
            {
                min = arr[i];
            }
            if(max > arr[i])
            {
                max = arr[i];
            }
        }

        // Pair p = new Pair(min, max);
        Pair p = new Pair<>(max, min);

        return p;
    }
}

class Pair<K, V> {
    private final K key;
    private final V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}
