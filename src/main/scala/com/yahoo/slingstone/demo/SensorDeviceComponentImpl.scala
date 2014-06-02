package com.yahoo.slingstone.demo

trait SensorDeviceComponentImpl extends SensorDeviceComponent {
  class PotSensor extends SensorDevice {
    def isCoffeePresent = true
  }
}
