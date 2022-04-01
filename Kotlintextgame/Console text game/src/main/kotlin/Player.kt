class Player(val name: String, var lives: Int, var hitpoints: Int, var speed: Int ) {

//player class
    open fun takeDamage(damage: Int) {
        val remainingHitpoints = hitpoints - damage
        if (remainingHitpoints > 0) {
            hitpoints = remainingHitpoints
            println( "$name took $damage points of damage and has $hitpoints left")

        }else{
     main()
        }
    }




}