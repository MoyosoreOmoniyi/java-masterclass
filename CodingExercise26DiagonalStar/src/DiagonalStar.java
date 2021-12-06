public class DiagonalStar {
    public static void printSquareStar (int number){

        // Rows and Column are loops.
        // Max number of loops is the number.

        if(number<5){
            System.out.println("Invalid Value");
        }else{
            for (int rowNum = 1; rowNum <= number; rowNum++) {
                for (int colNum = 1; colNum <= number; colNum++) {
                    if (rowNum == 1 || rowNum == number) {
                        System.out.print("*");             // Use this to print on the same line.
                    } else if (colNum == 1 || colNum == number) {
                        System.out.print("*");
                    } else if (rowNum == colNum) {
                        System.out.print("*");
                    } else if (colNum + rowNum == (number  + 1)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }

                System.out.println();   // After the inner loop has terminated, the code executes on the next line.
                // The Outer loop runs again and the inner loop is restarted from the initialized value. i.e 1.
            }
        }
    }

    public static void main(String[] args) {
        printSquareStar(6);
    }
}


// When a loop is nested inside another loop, the inner loop is runs many times inside the outer loop...
// In each iteration of the outer loop, the inner loop will be re-started.
// The inner loop must finish all of its iterations before the outer loop can continue to its next iteration.