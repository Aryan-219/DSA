package Recursion.MyCode;

import java.util.ArrayList;

public class MazePath {
    public static void main(String[] args) {
        // path("", 3, 3);
        // System.out.println(mazePath("", 3, 3));
        // pathDiagonal("", 3, 3);

        boolean[][] maze = {
                { true, true, true },
                { true, false, true },
                { true, true, true }
        };
        pathRestrictions("", maze, 0, 0);
    }

    static void path(String p, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println(p);
            return;
        }

        if (r > 1) {
            path(p + "D", r - 1, c);
        }
        if (c > 1) {
            path(p + "R", r, c - 1);
        }

    }

    static ArrayList<String> mazePath(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if (r == 1 || c == 1) {
            if (r == 1) {

                list.addAll(mazePath(p + "R", r, c - 1));
            } else {

                list.addAll(mazePath(p + "D", r - 1, c));
            }
        } else {

            list.addAll(mazePath(p + "D", r - 1, c));
            list.addAll(mazePath(p + "R", r, c - 1));
        }

        return list;

    }

    static void pathDiagonal(String p, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.print(p + " ");
            return;
        }

        if (r > 1 && c > 1) {
            pathDiagonal(p + "D", r - 1, c - 1);
        }
        if (r > 1) {
            pathDiagonal(p + "V", r - 1, c);
        }
        if (c > 1) {
            pathDiagonal(p + "H", r, c - 1);
        }

    }

    static void pathRestrictions(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }

        if (!maze[r][c]) {
            return;
        }
        if (r < maze.length - 1) {
            pathRestrictions(p + "D", maze, r + 1, c);
        }
        if (c < maze[0].length - 1) {
            pathRestrictions(p + "R", maze, r, c + 1);
        }

    }
}
