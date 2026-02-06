public double calculateClassAverage(double score1, double score2) {
    return (score1 + score2) / 2.0;
}

public double calculateClassAverage(double score1, double score2, double score3) {
    return (score1 + score2 + score3) / 3.0;
}

public double calculateClassAverage(double[] scores) {
    if (scores.length == 0) return 0.0;
    double sum = 0;
    for (double s : scores) {
        sum += s;
    }
    return sum / scores.length;
}
