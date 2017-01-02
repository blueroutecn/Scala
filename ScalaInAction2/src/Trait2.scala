class Human{
  println("Human")
}
trait Teacher3 extends Human{
  println("Teacher")
  def teach
}
trait PianoPlayer extends Human{
  println("PianoPlayer")
  def playPiano = println("I'm playing piano")
}
class PianoTeacher extends Human with Teacher3 with PianoPlayer{
  override def teach = {println("I'm training students.")}
}
object Trait2 {
  def main(args: Array[String]): Unit = {
    val t1 = new PianoTeacher
    t1.playPiano
    t1.teach
  }
}