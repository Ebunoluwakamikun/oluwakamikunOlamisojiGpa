package oluwakamikunOlamisoji;

import java.util.Scanner;

public class OluwakamikunOlamisoji {
    private static int GP1 = 0;
    private static int GP2 = 0;
    private static int GP3 = 0;
    private static int GP4 = 0;
    private static int GP5 = 0;

    /*GF = Grade
      GP = Grade point
      G = Score
      U = Course unit
      GPA = Grade point average
      C = Course code
      QP = Quality print
      TQP = Total quality point
     */

    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.print("Input your Course code: ");
        String C1 = i.next();
        System.out.print("Input your Score (100): ");
        double G1 = i.nextDouble();
        System.out.print("Input the Course Unit: ");
        int U1 = i.nextInt();

        System.out.print("Input your Course code: ");
        String C2 = i.next();
        System.out.print("Input your Score (100): ");
        double G2 = i.nextDouble();
        System.out.print("Input the Course Unit: ");
        int U2 = i.nextInt();

        System.out.print("Input your Course code: ");
        String C3 = i.next();
        System.out.print("Input your Score (100): ");
        double G3 = i.nextDouble();
        System.out.print("Input the Course Unit: ");
        int U3 = i.nextInt();

        System.out.print("Input your Course code: ");
        String C4 = i.next();
        System.out.print("Input your Score (100): ");
        double G4 = i.nextDouble();
        System.out.print("Input the Course Unit: ");
        int U4 = i.nextInt();

        System.out.print("Input your Course code: ");
        String C5 = i.next();
        System.out.print("Input your Score (100): ");
        double G5 = i.nextDouble();
        System.out.print("Input the Course Unit: ");
        int U5 = i.nextInt();

        String GF1 = null;
        if (G1 >= 70) {
            GP1 = 5;
            GF1 = "A";
        } else if ((G1 >= 60) && (G1 <= 69)) {
            GP1 = 4;
            GF1 = "B";
        } else if ((G1 >= 50) && (G1 <= 59)) {
            GP1 = 3;
            GF1 = "C";
        } else if ((G1 >= 45) && (G1 <= 49)) {
            GP1 = 2;
            GF1 = "D";
        } else if ((G1 >= 40) && (G1 <= 44)) {
            GP1 = 1;
            GF1 = "E";
        } else {
            GP1 = 0;
            GF1 = "F";
        }

        String GF2 = null;
        if (G2 >= 70) {
            GP2 = 5;
            GF2 = "A";
        } else if ((G2 >= 60) && (G2 <= 69)) {
            GP2 = 4;
            GF2 = "B";
        } else if ((G2 >= 50) && (G2 <= 59)) {
            GP2 = 3;
            GF2 = "C";
        } else if ((G2 >= 45) && (G2 <= 49)) {
            GP2 = 2;
            GF2 = "D";
        } else if ((G2 >= 40) && (G2 <= 44)) {
            GP2 = 1;
            GF2 = "E";
        } else {
            GP2 = 0;
            GF2 = "F";
        }

        String GF3 = null;
        if (G3 >= 70) {
            GP3 = 5;
            GF3 = "A";
        } else if ((G3 >= 60) && (G3 <= 69)) {
            GP3 = 4;
            GF3 = "B";
        } else if ((G3 >= 50) && (G3 <= 59)) {
            GP3 = 3;
            GF3 = "C";
        } else if ((G3 >= 45) && (G3 <= 49)) {
            GP3 = 2;
            GF3 = "D";
        } else if ((G3 >= 40) && (G3 <= 44)) {
            GP3 = 1;
            GF3 = "E";
        } else {
            GP3 = 0;
            GF3 = "F";
        }

        String GF4 = null;
        if (G4 >= 70) {
            GP4 = 5;
            GF4 = "A";
        } else if ((G4 >= 60) && (G4 <= 69)) {
            GP4 = 4;
            GF4 = "B";
        } else if ((G4 >= 50) && (G4 <= 59)) {
            GP4 = 3;
            GF4 = "C";
        } else if ((G4 >= 45) && (G4 <= 49)) {
            GP4 = 2;
            GF4 = "D";
        } else if ((G4 >= 40) && (G4 <= 44)) {
            GP4 = 1;
            GF4 = "E";
        } else {
            GP4 = 0;
            GF4 = "F";
        }

        String GF5 = null;
        if (G5 >= 70) {
            GP5 = 5;
            GF5 = "A";
        } else if ((G5 >= 60) && (G5 <= 69)) {
            GP5 = 4;
            GF5 = "B";
        } else if ((G5 >= 50) && (G5 <= 59)) {
            GP5 = 3;
            GF5 = "C";
        } else if ((G5 >= 45) && (G5 <= 49)) {
            GP5 = 2;
            GF5 = "D";
        } else if ((G5 >= 40) && (G5 <= 44)) {
            GP5 = 1;
            GF5 = "E";
        } else {
            GP5 = 0;
            GF5 = "F";
        }

        double QP1 = GP1 * U1;
        double QP2 = GP2 * U2;
        double QP3 = GP3 * U3;
        double QP4 = GP4 * U4;
        double QP5 = GP5 * U5;

        double TQP = QP1 + QP2 + QP3 + QP4 + QP5;

        double TGU = U1 + U2 + U3 + U4 + U5;

        double GPA = TQP / TGU;

        System.out.println("|-------------|-------------|-------|------------|");
        System.out.println("| COURSE CODE | COURSE UNIT | GRADE | GRADE-UNIT |");
        System.out.println("|-------------|-------------|-------|------------|");
        System.out.println("|  "+C1+"    | "+U1+"           | "+GF1+"     | "+GP1+"          |");
        System.out.println("|  "+C2+"    | "+U2+"           | "+GF2+"     | "+GP2+"          |");
        System.out.println("|  "+C3+"    | "+U3+"           | "+GF3+"     | "+GP3+"          |");
        System.out.println("|  "+C4+"    | "+U4+"           | "+GF4+"     | "+GP4+"          |");
        System.out.println("|  "+C5+"    | "+U5+"           | "+GF5+"     | "+GP5+"          |");
        System.out.println("|----------------------------------------------|");

        System.out.printf("Your GPA is = %.2f to 2 decimal places.", GPA);
    }
}
