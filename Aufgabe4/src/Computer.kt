class Computer {

    var power: Boolean

    constructor(power:Boolean){
        this.power = power
    }

    fun pressOnButton() {
        if (power == false) {
            println("Der Computer ist jetzt eingeschaltet.")
            power = true
        } else
            println("Der Computer ist bereits eingeschaltet.")
    }
    fun pressOffButton(){
        if (power == true){
            println("Der Computer wird ausgeschaltet.")
            power = false
        } else
            println("Der Computer ist bereits ausgeschaltet.")
    }
    fun sentMail() {
        if (power) {
            println("EMail sent.")
        } else
            println("Wenn der Computer aus ist, lässt sich keine Mail verschicken!!!")
    }
}