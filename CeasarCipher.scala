import scala.io.StdIn.readInt;
import scala.io.StdIn.readLine;

object CeasarCipher{

  val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

  def encryption(a: Int): Unit = {
    print("shifted by : ")
    val s = readInt()

    val shift = (s*a + alphabet.size) % alphabet.size

    val inputText =readLine("Secret Message: ").toUpperCase()

    val outputText = inputText.map( (c: Char) => {

      val i = alphabet.indexOf(c)

      if (i == -1){
        c
      }
      else{
        alphabet((i + shift) % alphabet.size)
      }
    });

    println("Message :"+outputText);

  }


  def main(args: Array[String]) :Unit={

    println("  1  Encryption \n  2  Decryption ")
    print("Enter your choice:")
    val n: Int = readInt();
    n match {
      case 1 => encryption(1);              //to encrypt
      case 2 => encryption(-1);             //to decrypt
      case _ => println("Invalid entry")
    }
  }

}