/**
 * Shop represents products with their prices, a way to buy those products and offers used during checkout.
 */
class Shop(val offers: Seq[Offer] = Nil) {
  val productPrices: Map[Product, Money] = Map (
      Apple -> Money(60),
      Orange -> Money(25)
  )

  // buy method calculates amount to pay and a resulting list of products buyer will take
  def buy(products: Seq[Product]): (Money, Seq[Product]) = {
    val shoppingCart = new ShoppingCart(this, products)
    val amount2Pay = shoppingCart.checkout()
    val resultingShoppingCart = offers.foldLeft(shoppingCart) { (shoppingCart, offer) =>
      offer.apply(shoppingCart)
    }
    (amount2Pay, resultingShoppingCart.products)
  }
}
