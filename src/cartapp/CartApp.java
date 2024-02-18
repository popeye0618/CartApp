package cartapp;

import java.util.HashSet;
import java.util.Set;

public class CartApp {
    public static void main(String[] args) {
        //상품 목록 생성
        Set<Product> productSet = new HashSet<>();
        //Todo: 상품 클래스를 생성하여 상품목록에 넣는다.
        int currentKey = 0;

        Product product1 = new Product(++currentKey, "milk", 3000);
        productSet.add(product1);

        Product productDuplicate = new Product(currentKey, "milk", 3000);
        productSet.add(productDuplicate); //추가 안됨

        Product product2 = new Product(++currentKey, "tissue", 10000);
        productSet.add(product2);

        //상품 목록 확인
        System.out.println("고유한 상품 목록: ");
        for (Product product : productSet) {
            System.out.println(product.getName() + " : " + product.getPrice());
        }

        System.out.println("--------------------");

        //장바구니 생성
        Cart myCart = new Cart();

        //Todo: 상품을 장바구니에 추가
        myCart.addProduct(product1, 3);
        myCart.addProduct(product2, 2);

        //Todo: 상품을 장바구니에서 제거
        myCart.removeProduct(product1, 1);
        myCart.removeProduct(product2, 2);

        //Todo: 장바구에 현재 담긴 상품들을 출력(상품이름, 각 상품의 개수)
        myCart.showItems();
    }
}
