package groupexercise

import models.Shoe
import util.Box

object GroupExercise {

  def getOneSizeBiggerAndTwoSizesSmaller(input: Box[Shoe]): Box[Box[Shoe]] = ???

  def getOneSizeBiggerAndTwoSizesSmallerFlattened(input: Box[Shoe]): Box[Shoe] = ???

  def swapPumaForNike(input: Box[Shoe]): Box[Shoe] = ???

  def generateShoesFromStringEither(input: Box[String]): Box[Either[String, Shoe]] = ???

  def getOnlyValidShoes(input: Box[Either[String, Shoe]]): Box[Shoe] = ???

  def swapPumaForNikeIfValid(input: Box[Either[String, Shoe]]): Box[Either[String, Shoe]] = ???
}
