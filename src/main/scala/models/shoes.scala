package models

trait Shoe {
  val brand: String
  val size: Int
  def newShoe(size: Int): Shoe
}

case class Nike(size: Int) extends Shoe {
  val brand: String = "Nike"

  override def newShoe(size: Int): Shoe = this.copy(size = size)
}

case class Puma(size: Int) extends Shoe {
  val brand: String = "Puma"

  override def newShoe(size: Int): Shoe = this.copy(size = size)
}

case class Adidas(size: Int) extends Shoe {
  val brand: String = "Adidas"

  override def newShoe(size: Int): Shoe = this.copy(size = size)
}
