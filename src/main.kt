fun main(){
    var me =Human("Tessa",25, 75)
    println(me.eat(3))
    me.speak("I love food.")
    me.birthday(1)
    var mimi = User("Tessa","Marie","angaramarie@gmail.com",716507709,333)
    println(mimi.firstName)
    println(mimi.email)
}
//Create a class called Human with these attributes: name, age, weight.
class Human(var name:String,var age:Int,var weight:Int){
    fun eat(foodWeight:Int):Int{
        weight+=foodWeight
        println("I am eating $foodWeight kgs of food")
        return  weight
    }
    fun speak(speech:String){
        println(speech)
    }
    fun birthday(increment:Int):Int{
        age+=increment
        println(age)
        return age
    }
}
data class User(var firstName:String, var lastName:String, var email:String, var phoneNumber:Int,var password:Int)
