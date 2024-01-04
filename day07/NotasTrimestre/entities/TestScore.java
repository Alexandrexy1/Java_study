package NotasTrimestre.entities;

public class TestScore {
    public String name;
    public float testScore1;
    public float testScore2;
    public float testScore3;

    public String toString() {
        float total = testScore1 + testScore2 + testScore3;
        if (total > 100) total = 100;
        if (total < 60) return "Failed. U need more " + (60 - total) + " score points to pass.";
        return "Pass.";
    }
}
