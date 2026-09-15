# week5
Java Problem Solutions – Hackathon & Placement Exercises

This repository contains solutions to the last five Java programming problems completed.

Problems Covered
-Hackathon Score Curve Booster
-Duplicate Team Name Finder
-Top-3 Podium Finder
-Hackathon Seating Grid Optimizer
-Placement Drive Shortlisting & Ranking Engine

1. Hackathon Score Curve Booster
Description:
The judging panel wants to add a flat bonus to every team's score.

Key Concepts: Arrays, Methods, Pass-by-reference behavior of arrays, void methods, Arrays.toString() 

Method:

static void curveScores(int[] scores, int bonus)

The method directly modifies the original array by adding the bonus to every score.

Example

Input:

{70, 85, 60}, bonus = 10

Output:

[80, 95, 70]

2. Duplicate Team Name Finder

Description

The program scans a list of team names and reports the first duplicate found.

Key Concepts

String arrays

Nested loops

String.equals()

Returning values from methods

Method

static String findDuplicateTeam(String[] teamNames)

The outer loop selects a name and the inner loop compares it only with names appearing after it.

Example

Input:

{"ByteForce", "CodeCrafters", "ByteForce"}

Output:

Duplicate Found: ByteForce

If no duplicate exists:

No Duplicates Found

3. Top-3 Podium Finder

Description

The program finds the three highest scores in a single pass without sorting the original array.

Key Concepts

Arrays

One-pass traversal

Integer.MIN_VALUE

Maintaining first, second, and third positions

Arrays.toString()

Method

static int[] findTopThreeScores(int[] scores)

The method maintains three variables:

first
second
third

Whenever a new score is found, the values are shifted into the correct positions.

Example

Input:

{45, 82, 79, 90, 33, 90, 61}

Output:

[90, 90, 82]

The solution correctly handles duplicate scores.

4. Hackathon Seating Grid Optimizer

Description

The program calculates the average score of each seating row and classifies the row as either a Quiet Zone or Buzzing Zone.

Key Concepts

2D arrays

Jagged arrays

Helper methods

double

Nested/foreach loops

Method reuse

Methods

private static double rowAverage(int[] row)

static String classifyRows(int[][] seatingScores, int threshold)

rowAverage() calculates the average of one row. The main classification method calls it once for every row.

A row is:

Quiet Zone if average < threshold

Buzzing Zone if average >= threshold

Example

Input:

{
    {40, 50, 45},
    {85, 90, 95},
    {30, 20, 25}
}
threshold = 60

Output:

Row 0: Quiet Zone | Row 1: Buzzing Zone | Row 2: Quiet Zone

The solution uses row.length, so it can handle rows of different lengths.

5. Placement Drive Shortlisting & Ranking Engine

Description

The program determines candidate eligibility and ranks eligible candidates using Java's built-in Arrays.sort().

Key Concepts

Classes and objects

Constructors

Encapsulation

Method overloading

Static methods

Comparable

compareTo()

Arrays.sort()

Arrays

Class

class Candidate implements Comparable<Candidate>

Constructor

public Candidate(String name, double cgpa, int codingScore)

The constructor initializes the candidate's name, CGPA, and coding score.

Overloaded Eligibility Methods

static boolean isEligible(double cgpa)

static boolean isEligible(double cgpa, int codingScore)

The first method performs a CGPA-only check.

The overloaded method performs a combined CGPA and coding-score check for borderline candidates.

Ranking

The Candidate class implements:

Comparable<Candidate>

and defines:

int compareTo(Candidate other)

This allows:

Arrays.sort(shortlistedCandidates);

to rank candidates without writing a separate sorting algorithm.

Important Note

The problem statement shown in the question does not explicitly provide the formula used to calculate the composite score. The eligibility thresholds and composite-score formula should therefore be set according to the exact specification provided by the instructor/platform.

Topics Practiced

Across these five problems, the following Java concepts were practiced:

Arrays

2D arrays

Jagged arrays

Methods

Helper methods

Method overloading

Static methods

Constructors

Classes and objects

Encapsulation

this keyword

final keyword

Comparable

compareTo()

Arrays.sort()

Arrays.toString()

Nested loops

Enhanced for loops

String comparison using equals()

One-pass algorithms

Returning arrays and strings

Direct modification of arrays

How to Run

Each solution can be placed in a Java file named:

Main.java

Compile:

javac Main.java

Run:

java Main

Summary

These exercises focus on applying fundamental Java concepts to practical hackathon and placement scenarios. The solutions emphasize reusable methods, appropriate use of Java's standard library, and simple algorithmic approaches that satisfy the given constraints.
