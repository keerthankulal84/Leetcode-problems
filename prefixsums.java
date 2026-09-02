import java.util.HashMap;

class prefixsums {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, -2, 2};
        int k = 3;

        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);

        int prefixSum = 0;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            prefixSum += arr[i];

            int need = prefixSum - k;

            if (map.containsKey(need)) {
                count += map.get(need);
            }

            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }

        System.out.println(count);
    }
}