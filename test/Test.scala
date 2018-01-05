/*
 * Simple test without any external dependencies
 */
object Test extends App {
  def test1 = {
    val shop = new Shop()
    val products = Seq(Apple, Apple, Orange, Apple)
    val (money, _) = shop.buy(products)

    assert(money == Money(205))
  }

  test1
}
