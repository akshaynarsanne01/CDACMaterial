#include <iostream>
#include <cmath>
using namespace std;

const double PI = 3.14159265358979323846;

double circleArea(double radius)
{
    return PI * radius * radius;
}

double rectangleArea(double length, double width)
{
    return length * width;
}

double squareArea(double side)
{
    return side * side;
}

int main()
{
    double radius, length, width, side;
    cout << "Enter the radius of the circle: ";
    cin >> radius;
    cout << "Area of Circle: " << circleArea(radius) << endl;
    cout << "Enter the length and width of the rectangle: ";
    cin >> length >> width;
    cout << "Area of Rectangle: " << rectangleArea(length, width) << endl;
    cout << "Enter the side length of the square: ";
    cin >> side;
    cout << "Area of Square: " << squareArea(side) << endl;

    return 0;
}
