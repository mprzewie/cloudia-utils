package communication

import java.io.File

import io.Chunkifier

import scala.math.ceil

/**
  * Created by marcin on 5/8/17.
  */
case class Request[T](element: T) extends Serializable

case class Confirmation(fileManifesto: FileManifesto) extends Serializable

case class FileManifesto(file: File, implicit val chunkSize: Int) extends Serializable {
  val chunkCount: Int = Chunkifier.chunksCount(file, chunkSize)
  val name: String = file.getName


}

