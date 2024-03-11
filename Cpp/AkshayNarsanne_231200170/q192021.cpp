// Question 19
#include <iostream>

void areaCircum(double radius, double &area, double &circumference)
{
    const double PI = 3.142;
    area = PI * radius * radius;
    circumference = 2 * PI * radius;
}

void areaPeri(double length, double breadth, double &area, double &perimeter)
{
    area = length * breadth;
    perimeter = 2 * (length + breadth);
}

int main()
{
    int choice;
    double radius, length, breadth, area, circumference, perimeter;

    std::cout << "Menu:\n";
    std::cout << "1. Circle\n";
    std::cout << "2. Rectangle\n";
    std::cout << "Enter your choice (1-2):\n";
    std::cin >> choice;

    switch (choice)
    {
    case 1:
        std::cout << "Enter the radius of the circle:\n";
        std::cin >> radius;
        areaCircum(radius, area, circumference);
        std::cout << "Area: " << area << "\n";
        std::cout << "Circumference: " << circumference << "\n";
        break;
    case 2:
        std::cout << "Enter the length and breadth of the rectangle:\n";
        std::cin >> length >> breadth;
        areaPeri(length, breadth, area, perimeter);
        std::cout << "Area: " << area << "\n";
        std::cout << "Perimeter: " << perimeter << "\n";
        break;
    default:
        std::cout << "Invalid choice.\n";
        return 1;
    }

    return 0;
}

// Question 20
#include <iostream>

struct Date
{
    int day, month, year;
};

void getDate(Date &date)
{
    std::cout << "Enter date (dd mm yy):\n";
    std::cin >> date.day >> date.month >> date.year;
}

int main()
{
    Date date;
    getDate(date);
    std::cout << "Date: " << date.day << "/" << date.month << "/" << date.year << "\n";
    return 0;
}

// Question 21
#include <iostream>

int *max(int *num1, int *num2)
{
    return (*num1 > *num2) ? num1 : num2;
}

int main()
{
    int num1, num2;

    std::cout << "Enter two numbers:\n";
    std::cin >> num1 >> num2;

    int *result = max(&num1, &num2);

    std::cout << "Maximum: " << *result << "\n";

    return 0;
}
