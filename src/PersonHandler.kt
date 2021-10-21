class PersonHandler {

    fun createPerson(name: String, age: Int, email: String, height: Int, weight: Int): Person {
        val person = Person(name, age, email, height, weight);
        return person;
    }

    fun Person.heightInInches(): Float {
        return this.height * (1f/2.54f);
    }

    fun getHeightInInches(person: Person): Float {
        return person.heightInInches();
    }

    fun savePerson(saveToDB: Boolean, person: Person) {
        val persistance: Persistence
        if(saveToDB) {
            persistance = Persistence.createDBPersistence()
        }else {
            persistance = Persistence.createFilePersistence()
        }
        persistance.save(person.toString())
    }
}