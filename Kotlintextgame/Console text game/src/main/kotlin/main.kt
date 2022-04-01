fun main() {
    println(
        //begin"je speelt als Maurice een gorilla die in een geexpirimenteerde pack leeft.\n" +
            "deze gorillas zijn slimmer, sterker en hebben betere stamina dan andere gorillas.")

    print("je loopt naar caeser je vraagt wat je kan doen de aapje ceaser \n" +
            "jij kan eten gaan halen maurice heel veel succes daarmee")

    println("je gaat eten halen")
//begin room
    fun keuzekant() {
        println("[noord] [oost] [zuid] [west].")
        var keuze = readLine()

        if (keuze == "noord") {
            println("je loopt noord de boomhut uit het bos in")
            //zuidroom 2 wolf
            bos()
        } else if (keuze == "oost") {
            println("je loopt naar het oosten je ziet wat gansen," +
                    "maar die vind je heel eng dus je gaat weer terug")
            keuzekant()
        }
        else if (keuze == "zuid"){
            println("je loopt naar het zuiden de boomhut uit")
            println("in de richting van een cave")
            //room 1 beer
            cave()
        }
        else if (keuze == "west"){
            println("Je kijkt naar het westen je ziet daar heel veel mensen " +
                    "en besluit dus niet daar naartoe te gaan")
            keuzekant()
        }
    }



    keuzekant()
}