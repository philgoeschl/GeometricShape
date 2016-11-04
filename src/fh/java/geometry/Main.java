package fh.java.geometry;

import fh.java.geometry.model.GeometricShape;
import fh.java.geometry.model.curved.Circle;
import fh.java.geometry.model.quadrilateral.Rectangle;
import fh.java.geometry.model.trilateral.RightTriangle;
import fh.java.geometry.model.trilateral.TriangularShape;


import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.doIt();
    }

    private void doIt() {

        List<GeometricShape> shapeList = new ArrayList<>();

        fillList(shapeList);

        printList(shapeList);



    }


    public void fillList(List<GeometricShape> shapeList) {

        shapeList.add(new Circle(1,2,2.0));
        shapeList.add(new Circle(3,1,2.0));
        shapeList.add(new Circle(4,2,2.0));

        shapeList.add(new Rectangle(3,4,10.2,12.1));
        shapeList.add(new Rectangle(5,2,10.2,12.1));
        shapeList.add(new Rectangle(6,3,10.2,12.1));

        shapeList.add(new RightTriangle(3,4,6.4,7.3));


    }


    public void printList(List<GeometricShape> shapeList) {

        System.out.println("-----------------for loop--------------");
        for (int pos = 0; pos < shapeList.size(); pos++) {
            System.out.println(shapeList.get(pos));

        }
        System.out.println("-----------------for each--------------");
        for (GeometricShape geometricShape : shapeList) {
            System.out.println(geometricShape);
        }
        System.out.println("-----------------stream 1--------------");
        shapeList.stream().forEach(geometricShape -> System.out.println(geometricShape));
        System.out.println("-----------------stream 2--------------");
        shapeList.stream().forEach(System.out ::println);

    }

}
