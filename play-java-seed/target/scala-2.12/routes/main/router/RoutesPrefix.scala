
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/paul/sdev4Project/sdev4Project/play-java-seed/conf/routes
// @DATE:Mon Mar 12 00:05:59 GMT 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
