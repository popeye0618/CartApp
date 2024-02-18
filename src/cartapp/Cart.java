package cartapp;

import java.util.HashMap;
import java.util.Map;

public class Cart {

    private Map<Product, Integer> items = new HashMap<>();

    //상품 추가
    public void addProduct(Product product, int cnt) {
        items.put(product, items.getOrDefault(product, 0) + cnt);
        System.out.println(product.getName() + " 이(가)" + cnt + "개 추가되었습니다.");
    }

    //상품 제거
    public void removeProduct(Product product, int cnt) {
        if (items.containsKey(product)) {
            int count = items.get(product);
            if (count >= cnt) {
                items.put(product, count - cnt);
            } else {
                items.remove(product);
            }
            System.out.println(product.getName() + " 이(가) 삭제되었습니다.");
        }
    }

    //장바구니 조회
    public void showItems() {
        if (items.isEmpty()) {
            System.out.println("장바구니가 비어있습니다.");
        } else {
            System.out.println("장바구니 내용: ");
            for (Map.Entry<Product, Integer> entry : items.entrySet()) {
                System.out.println("상품명: " + entry.getKey().getName() + ", 수량: " + entry.getValue());
            }
        }
    }
}
