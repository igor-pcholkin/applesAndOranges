/**
 * All value class representing business domain.
 */
abstract class Product

case object Apple extends Product
case object Orange extends Product

abstract class Currency {
  def toString: String
}

case object BRITISH_POUND extends Currency {
  override def toString = "£"
}

case class Money(amount: Int, currency: Currency = BRITISH_POUND) {
  def +(money: Money) = Money(amount + money.amount)

  override def toString = currency + (amount.toFloat / 100).toString
}
