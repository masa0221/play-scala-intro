package models

import play.api.libs.json.Json
case class Person(name: String)

object Person {
  implicit val parsonFormat = Json.format[Person]
}

