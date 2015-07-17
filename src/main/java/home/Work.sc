val lista=List(1,2,3,4,5)
lista.filter(_>3)

lista.foreach(println(_))
val lista1=List.range(1,10)
lista1.zipWithIndex.foreach(print(_))
type A
type B
type C
trait Functor[F[_]] {
  def map[A, B](fa: F[A])(f: A => B): F[B]
}
  val result=(1 to 100)
    .par //1
    .map(_*2)
    //.map(e=>{println(s"thread : ${Thread.currentThread()}");e}) //2
    .sum

  println(result)
