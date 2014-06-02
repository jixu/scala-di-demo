package com.yahoo.slingstone.demo

trait SensorDeviceComponent {
  val sensor: SensorDevice
  trait SensorDevice {
    def isCoffeePresent: Boolean
  }
}
