package com.yahoo.slingstone.demo

object Demo extends App {
  val warmer = ComponentRegistry.warmer
  warmer.trigger()
}
