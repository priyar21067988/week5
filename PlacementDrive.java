import java.util.Arrays;

class Candidate implements Comparable<Candidate> {

    private String name;
    private double cgpa;
    private int codingScore;

    // Constructor
    public Candidate(String name, double cgpa, int codingScore) {
        this.name = name;
        this.cgpa = cgpa;
        this.codingScore = codingScore;
    }

    // CGPA-only eligibility check
    static boolean isEligible(double cgpa) {
        return cgpa >= 7.0;
    }

    // CGPA + coding score eligibility check
    static boolean isEligible(double cgpa, int codingScore) {
        return cgpa >= 6.5 && codingScore >= 60;
    }

    // Composite score for ranking
    private double compositeScore() {
        return (cgpa * 10) + codingScore;
    }

    // Sort in descending order of composite score
    @Override
    public int compareTo(Candidate other) {
        return Double.compare(other.compositeScore(), this.compositeScore());
    }

    // Shortlist and rank candidates
    static String shortlistAndRank(Candidate[] candidates) {

        Candidate[] shortlisted = new Candidate[candidates.length];
        int count = 0;

        for (Candidate candidate : candidates) {

            if (isEligible(candidate.cgpa) ||
                isEligible(candidate.cgpa, candidate.codingScore)) {

                shortlisted[count] = candidate;
                count++;
            }
        }

        // Create array containing only shortlisted candidates
        Candidate[] result = Arrays.copyOf(shortlisted, count);

        // Java's built-in sort uses compareTo()
        Arrays.sort(result);

        String output = "";

        for (int i = 0; i < result.length; i++) {

            output += (i + 1) + ". "
                    + result[i].name + " ("
                    + String.format("%.1f", result[i].compositeScore())
                    + ")";

            if (i < result.length - 1) {
                output += " | ";
            }
        }

        return output;
    }

    public static void main(String[] args) {

        Candidate[] candidates = {
            new Candidate("Aisha", 8.2, 40),
            new Candidate("Rohit", 6.8, 65),
            new Candidate("Meena", 6.0, 90),
            new Candidate("Karan", 7.5, 20)
        };

        System.out.println(shortlistAndRank(candidates));
    }
}
