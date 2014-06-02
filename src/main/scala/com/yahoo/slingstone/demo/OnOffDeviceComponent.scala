package com.yahoo.slingstone.demo

trait OnOffDeviceComponent {
  val onOff: OnOffDevice
  trait OnOffDevice {
    def on: Unit
    def off: Unit
  }
}
