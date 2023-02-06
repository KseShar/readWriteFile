import scala.collection.mutable.ArrayBuffer
import scala.io.Source
import scala.io.StdIn.readLine
import java.io.PrintWriter

object Main {

  def main(args: Array[String]): Unit = {
    println("Enter the file name!")
    val fileName = readLine()

    val source = Source.fromFile(fileName, "UTF-8")
    val masStr = source.getLines.toArray.reverse

    val out = new PrintWriter(fileName, "UTF-8")
    for (i <- masStr) out.println(i)
    source.close()
    out.close()
  }
}