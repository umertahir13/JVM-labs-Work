class FilePersistance(): Persistence() {
    override fun save(data: String) {
        println("Saving $data to File");
    }
}