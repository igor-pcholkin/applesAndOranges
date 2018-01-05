/*
 * Shopping cart provides functionality of estimation of total cost of products placed into it.
 */
class ShoppingCart(val shop: Shop, val products: Seq[Product]) {
  def checkout(): Money = {
    products.foldLeft(Money(0)) { (sum, product) =>
      sum + shop.productPrices(product)
    }
  }
}
