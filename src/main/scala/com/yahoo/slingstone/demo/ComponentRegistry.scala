package com.yahoo.slingstone.demo

object ComponentRegistry
  extends OnOffDeviceComponentImpl
  with SensorDeviceComponentImpl
  with WarmerComponentImpl {
  val onOff = new Heater
  val sensor = new PotSensor
  val warmer = new Warmer
}
