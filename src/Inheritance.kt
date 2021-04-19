fun main() {

    var myCar=Car("BMW","X6","Blue",6)
    myCar.carry(10)
    myCar.identity()
    println(myCar.calculateParkingFees(8))

    var myBus=Bus("Toyota","Scania","Yellow",62)
    myBus.identity()
    println(myBus.maxTripFare(150.50896.toDouble()))
    println(myBus.calculateParkingFees(2))

}
open class Motorcars(var make:String,var model:String,var color:String, var capacity:Int){
   open fun carry(people: Int){
        if (people<=capacity){
            println("Carrying $people passengers")
        }
        else{
            var x=people-capacity
            println("Overcapacity by $x people")
        }
    }
    fun identity(){
        println("I am a $color $make $model")
    }
   open fun calculateParkingFees(hours:Int):String{
        var parkingFees=hours*20
        return "KES $parkingFees"
    }
}

class Car(make:String,model:String,color:String,capacity:Int):Motorcars(make,model,color,capacity) {

}
class Bus(make:String,model:String,color:String,capacity:Int):Motorcars(make,model,color,capacity){
    fun maxTripFare(fare:Double):String{
     var maximumFare=fare*capacity
        return "The maximum fare per trip fare is KES $maximumFare"
    }

    override fun calculateParkingFees(hours: Int):String {
        var parkingFees=hours*capacity
        return "KES $parkingFees"
    }
}