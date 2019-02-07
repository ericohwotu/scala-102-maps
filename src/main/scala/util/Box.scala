package util

case class Box[T](content: T*) {
  def map[O](f: T => O): Box[O] = Box(content map f: _*)
  def fold[O](default: O)(f: (O, T) => O): O = content.foldLeft(default)(f)
  def flatMap[O](f: T => Box[O]): Box[O] = Box(
    Box(content map f: _*)
      .fold(Seq.empty[O]){
        case (seq, box) => seq ++ box.content
      }:_*
  )
  override def toString: String = s"Box(${content.mkString(", ")})"
}
