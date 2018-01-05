/*
 * Test app.
 */
object ShoppingCartTest extends App {
  {
    val shop = new Shop()
    val products = Seq(Apple, Apple, Orange, Apple)
    val money = shop.buy(products)
    println(money)
  }

  {
    val shop = new Shop(Seq(BuyOneGetOneFreeForApples))
    val products = Seq(Apple, Apple, Orange, Apple)
    val (money, newProducts) = shop.buy(products)
    println(money, newProducts)
  }

  {
    val shop = new Shop(Seq(BuyTwoGetOneFreeForOranges))
    val products = Seq(Apple, Apple, Orange, Apple)
    val (money, newProducts) = shop.buy(products)
    println(money, newProducts)
  }

  {
    val shop = new Shop(Seq(BuyOneGetOneFreeForApples, BuyTwoGetOneFreeForOranges))
    val products = Seq(Apple, Apple, Orange, Apple)
    val (money, newProducts) = shop.buy(products)
    println(money, newProducts)
  }

  {
    val shop = new Shop(Seq(BuyOneGetOneFreeForApples, BuyTwoGetOneFreeForOranges))
    val products = Seq(Apple, Apple, Orange, Orange, Apple)
    val (money, newProducts) = shop.buy(products)
    println(money, newProducts)
  }

  {
    val shop = new Shop(Seq(BuyOneGetOneFreeForApples, BuyTwoGetOneFreeForOranges))
    val products = Seq(Apple, Apple, Orange, Orange, Apple, Orange)
    val (money, newProducts) = shop.buy(products)
    println(money, newProducts)
  }

}
