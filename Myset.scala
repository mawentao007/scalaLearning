import scala.collection.mutable
object  Myset {
  def main(args:Array[String]) = {
    val text = "See Spot run.Run,Spot.Run!"
    val wordsArray = text.split("[!,. ]+")
    val wordsSet = mutable.Set.empty[String]
    for(word <- wordsArray)
      wordsSet += word.toLowerCase
    println(wordsSet.toList)
  }
 }
