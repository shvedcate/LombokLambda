package ru.netology;

import lombok.val;
import ru.netology.model.PurchaseItem;
import ru.netology.service.CartService;
import ru.netology.util.PriceAskComparator;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        /*val item = new PurchaseItem(1, 1000, 1);
        System.out.println(item);*/

        CartService service = new CartService();
        service.add(new PurchaseItem(1, 1000, 1));
        service.add(new PurchaseItem(2, 5000, 5));
        service.add(new PurchaseItem(3, 5000, 1));
        service.add(new PurchaseItem(4, 9000, 9));
        service.add(new PurchaseItem(5, 2000, 10));
        service.add(new PurchaseItem(6, 7000, 1));

        /*class LocalPriceAskComparator implements Comparator<PurchaseItem> {
            @Override
            public int compare(PurchaseItem o1, PurchaseItem o2) {
                return o1.getItemPrice() - o2.getItemPrice();
            }
        }

        System.out.println(service.sortedBy(new LocalPriceAskComparator()));*/

        /*Comparator<PurchaseItem> comparator = new Comparator<PurchaseItem>() {
            @Override
            public int compare(PurchaseItem o1, PurchaseItem o2) {
                return o1.getItemPrice() - o2.getItemPrice();
            }
        };

        System.out.println(service.sortedBy(comparator));*/



        /*System.out.println(service.sortedBy(new Comparator<PurchaseItem>() {
            @Override
            public int compare(PurchaseItem o1, PurchaseItem o2) {
                return o1.getItemPrice() - o2.getItemPrice();
            }
        }
        ));*/

//        System.out.println(service.sortedBy((PurchaseItem o1, PurchaseItem o2) -> {
//                    return o1.getItemPrice() - o2.getItemPrice();
//                }
//        ));

//        Comparator<PurchaseItem> comparator = (PurchaseItem o1, PurchaseItem o2) -> {
//            return o1.getItemPrice() - o2.getItemPrice();
//        };

        /*Comparator<PurchaseItem> comparator = ( o1, o2) -> {
            return o1.getItemPrice() - o2.getItemPrice();
        };*/

//        System.out.println(service.sortedBy((o1, o2) -> {
//                    return o1.getItemPrice() - o2.getItemPrice();
//                }
//        ));

//        System.out.println(service.sortedBy((o1, o2) -> {
//                    return o1.getItemPrice() - o2.getItemPrice();
//                }
//        ));

        System.out.println(service.sortedBy((o1, o2) -> o1.getItemPrice() - o2.getItemPrice()));

//        System.out.println(service.sortedBy(Comparator.comparingInt(PurchaseItem::getItemPrice)));




    }
}
