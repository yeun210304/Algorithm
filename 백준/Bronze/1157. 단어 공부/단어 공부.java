import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.next().toUpperCase().split("");
        sc.close();
        
        Map<String, Integer> map = new HashMap<>();
        int idx = 0;
        
        for (int i=0; i<input.length; i++) {
            String s = input[i];
            map.put(s, map.getOrDefault(s, 0)+1);
        }
        
        int max = map.values().stream()
                    .max(Integer::compareTo).orElse(0);
        
        List<String> lst = map.keySet().stream()
                            .filter(e -> map.get(e) == max)
                            .collect(Collectors.toList());
        
        System.out.print(lst.size()>1?"?":lst.get(0));
    }
}