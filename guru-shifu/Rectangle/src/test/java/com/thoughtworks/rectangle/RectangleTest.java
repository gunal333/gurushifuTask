package com.thoughtworks.rectangle;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.closeTo;
import static org.junit.jupiter.api.Assertions.*;

public class RectangleTest
{
    @Test
    void shouldTestPerimeterOfRectangleWhenLengthandBreadthareInDouble()
    {

        Rectangle rectangle = new Rectangle(2.23,3.65);
        double area = rectangle.perimeter();
        assertThat(area,closeTo(11.76,0.001));
    }
    @Test
    void shouldTestAreaOfRectangleWhenLengthandBreadthareInDouble()
    {

        Rectangle rectangle = new Rectangle(2.23,3.65);
        double area = rectangle.area();
        assertThat(area,closeTo(8.1395,0.00001));
    }
}