package com.example.hr.app;

import com.example.hr.entity.ColorPoint;
import com.example.hr.entity.Employee;
import com.example.hr.entity.Point;
import com.example.hr.entity.SoftwareEngineer;

import java.util.List;

public class TestEquals {
    public static void main(String[] args) {
        Point p1 = new Point(1,2);
        Point p2 = new Point(1,2);
        ColorPoint p3 = new ColorPoint(new Point(1,2), "Red");
        System.out.println("p1.equals(p2): "+p1.equals(p2));
        System.out.println("p1.equals(p3): "+p1.equals(p3));
        System.out.println("p3.equals(p1): "+p3.equals(p1));
        System.out.println("p2.equals(p3): "+p2.equals(p3));
        System.out.println("p3.equals(p2): "+p3.equals(p2));
    }
}
