class DBPersistance(): Persistence() {

    override fun save(data: String) {
        println("Saving $data to DB");
    }
}