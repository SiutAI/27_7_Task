package enums;

public enum StudyProfile {
    MEDICINE ("Медицина"),
    BIOLOGY ("Биология"),
    PHILOSOPHY ("Философия"),
    MATHEMATICS ("Математика"),
    PHYSICS ("Физика"),
    LINGUISTICS("Лингвистика");

    private final String profileName;

    StudyProfile(String profileName) {
        this.profileName = profileName;
    }

    public String getProfileName() {
        return this.profileName;
    }
}
