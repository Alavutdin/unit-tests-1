package seminars.first.Shop;

import static org.assertj.core.api.FactoryBasedNavigableListAssert.assertThat;

public class ShopTest {

    /*
   1. Напишите тесты, чтобы проверить, что магазин хранит верный список продуктов (правильное количество продуктов, верное содержимое корзины).
   2. Напишите тесты для проверки корректности работы метода getMostExpensiveProduct.
   3. Напишите тесты для проверки корректности работы метода sortProductsByPrice (проверьте правильность сортировки).
   */
    public static void main(String[] args) {
        // Подготовка:
        Shop testShop = new Shop();
        testShop.setProducts(getShuffleListProducts(getTestListProducts()));

        // Действие и проверка результата:
        // Проверяем, что магазин хранит верный список продуктов (количество продуктов)
        assertThat(testShop.getProducts()).hasSize(4);

        // Проверить, что магазин возвращает верный самый дорогой продукт getMostExpensiveProduct
        assertThat(testShop.getMostExpensiveProduct().getTitle()).isEqualTo(getTestListProducts().get(3).getTitle());

        // Проверить, что магазин возвращает верный отсортированный по цене список продуктов
        assertThat(testShop.sortProductsByPrice().get(1).getCost()).isEqualTo(100);
        assertThat(testShop.sortProductsByPrice().get(1).getCost()).isEqualTo(150);
        assertThat(testShop.sortProductsByPrice().get(2).getCost()).isEqualTo(299);
        assertThat(testShop.sortProductsByPrice().get(3).getCost()).isEqualTo(500);

        //  for (Product product : getTestListProducts()) {
        //      System.out.println(product.getTitle() +" - "  + product.getCost());
        //  }

//        System.out.println("До сортировки:");
//        for (Product product : getTestListProducts()) {
//            System.out.println(product.getTitle() + " - " + product.getCost());
//        }
//
//        System.out.println("После Перемешивания:");
//        for (Product product : getShuffleListProducts(getTestListProducts())) {
//            System.out.println(product.getTitle() + " - " + product.getCost());
//        }
//
//        System.out.println("После сортировки:");
//        for (Product product : testShop.getSortedListProducts()) {
//            System.out.println(product.getTitle() + " - " + product.getCost());
//        }

}