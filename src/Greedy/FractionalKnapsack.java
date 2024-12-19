package Greedy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FractionalKnapsack {
    static class Item {
        int weight;
        int profit;
        public Item(int weight, int profit) {
            this.weight = weight;
            this.profit = profit;
        }

        @Override
        public String toString() {
            return "Item{" +
                    "weight=" + weight +
                    ", profit=" + profit +
                    '}';
        }

    }
    static class ItemComparator implements Comparator<Item> {
        @Override
        public int compare(Item i1, Item i2) {
            return i2.profit/i2.weight-i1.profit/ i1.weight;
        }
    }

    public static void main(String[] args) {
        List<Integer> profit = List.of(60,100,120);
        List<Integer> weight = List.of(10,20,30);
        int w=50;
        int ans=0;
        List<Item> itemsList = new ArrayList<>();
        for (int i = 0; i < profit.size(); i++) {
            Item item = new Item(weight.get(i), profit.get(i));
            itemsList.add(item);
        }
        itemsList.sort(new ItemComparator());
        System.out.println(itemsList);
        while (w>0){
            for (int i = 0; i < itemsList.size(); i++) {
                Item item = itemsList.get(i);
                if (item.weight<=w){
                    ans+=item.profit;
                    w-=item.weight;
                }else {
                    ans+=(item.profit/item.weight)*w;
                    w=0;
                }
            }
        }
        System.out.println(ans);
    }
}
