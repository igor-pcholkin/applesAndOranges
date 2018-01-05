
/**
 * Offer allows to apply special rules on shopping cart
 * As a result it produces new shopping cart with new list (containing added) products.
 */
abstract class Offer {
  def apply(shoppingCart: ShoppingCart): ShoppingCart
}

object BuyOneGetOneFreeForApples extends Offer {
  def apply(shoppingCart: ShoppingCart): ShoppingCart = {
    val products = shoppingCart.products
    val numApples = products.count(_ == Apple)
    val newProducts = products ++ Seq.fill(numApples)(Apple)
    new ShoppingCart(shoppingCart.shop, newProducts)
  }
}

object BuyTwoGetOneFreeForOranges extends Offer {
  def apply(shoppingCart: ShoppingCart): ShoppingCart = {
    val products = shoppingCart.products
    val numOranges = products.count(_ == Orange)
    val newProducts = products ++ Seq.fill(numOranges / 2)(Orange)
    new ShoppingCart(shoppingCart.shop, newProducts)
  }
}
