class person {

    var name: String
    var age: Int
    var phoneNumber: Int

    constructor(name: String, age: Int, phoneNumber: Int) {
        this.name = name
        this.age = age
        this.phoneNumber = phoneNumber
    }

    fun sayHello(){
        println("Hallo an alle.")
    }
}