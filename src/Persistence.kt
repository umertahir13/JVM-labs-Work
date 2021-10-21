abstract class Persistence {
    companion object {
        fun createDBPersistence() : DBPersistance {
            return DBPersistance();
        }
        fun createFilePersistence() : FilePersistance{
            return FilePersistance();
        }
    }

    abstract  fun save(data: String);
}
