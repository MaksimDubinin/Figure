import figuri.Figure;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        boolean marker = true;
        System.out.println("Введите название фигуры.");
        Scanner sc = new Scanner(System.in);
        do {
            ArrayList <Integer> Point = new ArrayList<>();
            String input = sc.nextLine();
            Pattern figura = Pattern.compile("^(FIGURE|CIRCLE|SQUARE|RECTANGLE|PARALLELOGRAM|TRIANGLE|POLYGON|SPHERE|TRUNCATED_SPHERE|CYLINDER|CONE)$");
            Matcher m = figura.matcher(input);
            int count = 0;
            if (m.matches()) {
                System.out.println("Введите коорбинаты фигуры.");
                boolean marker1 = true;
                do {
                    String koor = sc.nextLine();
                    boolean flag = false;
                    String[] koord = koor.split("\\s");
                    Pattern koordinate = Pattern.compile("[1-9][0-9]*|-[1-9][0-9]*|0");
                    for (int i = 0; i < koord.length; ++i) {
                        Matcher match = koordinate.matcher(koord[i]);
                        if (!match.matches() && !koor.equals("STOP_INPUT")) {
                            System.out.println("Please retype");
                            flag = true;
                        }
                    }
                    if (!flag && !koor.equals("STOP_INPUT")) {
                        count += 1;
                        for (int i = 0; i < koord.length; ++i) {
                            Point.add(Integer.parseInt(koord[i]));
                        }
                    }

                    if (koor.equals("STOP_INPUT")) {
                        Figure figure = Figure.createNewFigure(input, Point, count);
                        if (figure.isFigureValid() && !input.equals("FIGURE")) {
                            System.out.println("The figure is valid");
                            System.out.print("The figure area ");
                            figure.areaFigure();
                            System.out.print("\n" + "The figure perimeter ");
                            figure.perimetrFigure();
                            marker1 = false;
                            marker = false;

                        } else if (figure.isFigureValid() && input.equals("FIGURE")) {
                            System.out.println("The figure is figyre");
                            figure.areaFigure();
                            figure.perimetrFigure();
                            System.out.println("Введите фигуру.");
                            marker1 = false;
                            Point.clear();
                        } else {
                            System.out.println("The figyre is invalid");
                            System.out.println("Введите фигуру.");
                            marker1 = false;
                            Point.clear();
                        }
                    }
                } while (marker1);
            }
            if (!m.matches() && !input.equals("END")) {
                System.out.println("Повторите ввод.");
            }
            if (input.equals("END")) {
                marker = false;
            }
        } while (marker);
    }
}