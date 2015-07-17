package home

import java.util.concurrent.{TimeUnit, CountDownLatch}

import scala.util.Random

/**
 * Created by K on 2015-07-17.
 */
class CountDownLatchExercise {
  def main(args: Array[String]) {
    val cl=new CountDownLatch(2)

    val c1=new Controller(5,cl)
    val c2=new Controller(6,cl)

    val rockets=(1 to 10).map(new Rocket(_,cl))
    rockets.foreach(_.start)

    c1.start()
    c2.start()

    rockets.foreach(_.join)
  }

  class Rocket(n:Int,cl:CountDownLatch) extends Thread{

    private val r=new Random()

    override def run()={
      TimeUnit.SECONDS.sleep(r.nextInt(4))
      println(s"przygotowania rakiety ${n}")
      cl.await()
      println(s"start rakiety ${n}")
    }
  }

  class Controller(sleep:Int,cl:CountDownLatch) extends Thread{
    override def run()={
      TimeUnit.SECONDS.sleep(sleep)
      println(s"kontroler zwolniony po ${sleep} sekundach")
      cl.countDown()
    }
  }
}
