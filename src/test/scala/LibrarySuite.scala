/*
 * This Scala Testsuite was auto generated by running 'gradle init --type scala-library'
 * by 'lena' at '12/10/15 12:56 PM' with Gradle 2.9
 *
 * @author lena, @date 12/10/15 12:56 PM
 */

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class LibrarySuite extends FunSuite {
  test("someLibraryMethod is always true") {
    def library = new Library()
    assert(library.someLibraryMethod)
  }
}
