// Student Report Card System
// Author: Nitish Kumar

import java.util.Scanner;

class Student {
    String name;
    String rollNo;
    int[] marks = new int[3];
    int total;
    double average;
    char grade;

    void inputDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        name = sc.nextLine();
        System.out.print("Enter Roll Number: ");
        rollNo = sc.nextLine();
        String[] subjects = {"Math", "Science", "English"};
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter marks for " + subjects[i] + ": ");
            marks[i] = sc.nextInt();
        }
    }

    void calculateResults() {
        total = 0;
        for (int mark : marks) total += mark;
        average = total / 3.0;

        if (average >= 90) grade = 'A';
        else if (average >= 75) grade = 'B';
        else if (average >= 60) grade = 'C';
        else if (average >= 50) grade = 'D';
        else grade = 'F';
    }

    void displayReport() {
        System.out.println("\n------------------------------");
        System.out.println("       REPORT CARD");
        System.out.println("------------------------------");
        System.out.println("Name      : " + name);
        System.out.println("Roll No   : " + rollNo);
        System.out.println("Marks     : ");
        System.out.println("  Math    : " + marks[0]);
        System.out.println("  Science : " + marks[1]);
        System.out.println("  English : " + marks[2]);
        System.out.println("Total     : " + total);
        System.out.println("Average   : " + average);
        System.out.println("Grade     : " + grade);
        System.out.println("------------------------------\n");
    }
}

public class ReportCardSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            students[i] = new Student();
            System.out.println("\nEnter details for Student " + (i + 1) + ":");
            students[i].inputDetails();
            students[i].calculateResults();
        }

        System.out.println("\n===== REPORT CARD DETAILS =====");
        for (Student s : students) {
            s.displayReport();
        }
    }
}
