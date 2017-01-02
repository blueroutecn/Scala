/**
  * Created by 54675 on 2016/11/10.
  */
trait Action{
  def doAction = println("Working1...")
}
trait BeforeAfter extends Action{
  abstract override def doAction: Unit ={
    println("Initialization")
    super.doAction
    println("Destroyed")
  }
}
class Work extends Action{
  override def doAction: Unit = println("Working2...")
}
object Trait3 {
  def main(args: Array[String]): Unit = {
    val work = new Work with BeforeAfter
    work.doAction
  }
}