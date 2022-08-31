package enums;

public enum StudyProfile {
    MEDICINE ("Медицина"),
    BIOLOGY ("Биология"),
    PHILOSOPHY ("Философия"),
    MATH ("Математика");

    private String profileName;

    StudyProfile(String profileName) {
        this.profileName = profileName;
    }

}
