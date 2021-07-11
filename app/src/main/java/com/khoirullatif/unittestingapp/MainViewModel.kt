package com.khoirullatif.unittestingapp

class MainViewModel(private val cuboidModel: CuboidModel) {
    fun getCircumference(): Double = cuboidModel.getCircumference()

    fun getVolume(): Double = cuboidModel.getVolume()

    fun getSurfaceArea(): Double = cuboidModel.getSurfaceArea()

    fun save(length: Double, width: Double, height: Double) {
        cuboidModel.save(length, width, height)
    }
}