class Enemy(val name: String, var lives: Int, var hitpoints: Int, var speed: Int) {

//enemy class




// damage systeem
    fun takeDamage(damage: Int) {
        val remainingHitpoints = hitpoints - damage
        if (remainingHitpoints > 0) {
            hitpoints = remainingHitpoints
            println( "$name took $damage points of damage and has $hitpoints left")

        }else{

            println("$name lost a life.")
        }
    }

}