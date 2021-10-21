import kotlin.random.Random

data class Person internal constructor(var name: String, var age: Int, var email: String, var height: Int, var weight: Int) {

    var username: String;
    var password: String = "";

    init {
        this.username = this.name + Random.nextInt(100);
    }

    constructor(name: String, passwordStrength: Int, age: Int, email: String, height: Int, weight: Int) : this(name, age, email, height, weight) {

        val rand = Random
        for(i in 1..passwordStrength) {
            password += rand.nextInt(10 )
        }
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val person = Person("Umer", 25, "test@gmail.com", 34, 34)
        }
    }

//    override fun toString(): String {
//        return name + " " + age + " " + email + " " + height + " " + weight;
//    }
}