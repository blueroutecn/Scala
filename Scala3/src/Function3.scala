/**
  * Created by 54675 on 2016/11/15.
  */
import javax.swing.JButton
import java.awt.event.ActionListener
import java.awt.event.ActionEvent
import javax.swing.JFrame
object Function3 {
  def main(args: Array[String]): Unit = {
    var data = 0
    val frame = new JFrame("SAM")
    val jButton = new JButton("Counter")
    implicit def convertedAction(action:(ActionEvent) => Unit) =new ActionListener {
      override def actionPerformed(event: ActionEvent){ action(event)}
    }
    jButton.addActionListener((event:ActionEvent) => {data += 1;println(data)})
    frame.setContentPane(jButton)
    frame.pack()
    frame.setVisible(true)
  }
}
