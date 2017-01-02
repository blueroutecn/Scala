/**
  * Created by 54675 on 2016/11/10.
  */
trait Logger{
  def log(msg:String){}
}
class ConcreteLogger extends Logger with Cloneable{
  //override def log(msg: String): Unit = println("Log:"+msg)
  def concreteLog: Unit ={
    log("It's me!!!")
  }
}
trait TraitLogger extends Logger{
  override def log(msg: String): Unit = println("TraitLogger Loge is:"+msg)
}
object Trait {
  def main(args: Array[String]): Unit = {
    val logger = new ConcreteLogger with TraitLogger
    logger.log("hehe")
  }
}
