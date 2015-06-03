package com.thoughtworks.tw101.exercises.exercise5;

public class RectangleAverager {
    private Rectangle[] rectangles;

    public float averageArea(Rectangle[] rectangles) {
        this.rectangles = rectangles;

        float totalArea = 0;

        for (int i =0; i < rectangles.length; i++) {
            totalArea += rectangles[i].area();
        }

        return totalArea / rectangles.length;
    }
}
