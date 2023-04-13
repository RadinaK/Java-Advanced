package Z01ExamPreparation.guild;

public class Player {
    private String name;

    public String getClazz() {
        return clazz;
    }

    private String clazz;
    private String rank;
    private String description;

    public Player(String name, String clazz) {
        this.name = name;
        this.clazz = clazz;
        this.rank = "Trial";
        this.description = "n/a";
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public void setDescription(String best_healer_eu) {
        this.description = best_healer_eu;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("Player %s: %s\n" +
                "Rank: %s\n" +
                "Description: %s", name, clazz, rank, description);
    }
}
