// Question 15
#include <iostream>

int main()
{
    for (int i = 1; i <= 3; ++i)
    {
        for (int j = 1; j <= i; ++j)
        {
            std::cout << j << " ";
        }
        for (int k = i - 1; k >= 1; --k)
        {
            std::cout << k << " ";
        }
        std::cout << "\n";
    }

    return 0;
}

// Question 16
#include <iostream>

void charLine(char ch, int length)
{
    for (int i = 0; i < length; ++i)
    {
        std::cout << ch;
    }
    std::cout << "\n";
}

int main()
{
    charLine('-', 22);
    std::cout << "| Data Type  | Size in Bytes |\n";
    charLine('-', 22);
    std::cout << "| Integer    |       4        |\n";
    std::cout << "| Character  |       1        |\n";
    std::cout << "| Float      |       4        |\n";
    charLine('-', 22);

    return 0;
}

// Question 17
#include <iostream>

void fibonacci(int n)
{
    int t1 = 0, t2 = 1, nextTerm;

    std::cout << "Fibonacci Series:\n";

    for (int i = 1; i <= n; ++i)
    {
        std::cout << t1 << ", ";
        nextTerm = t1 + t2;
        t1 = t2;
        t2 = nextTerm;
    }
    std::cout << "\n";
}

int main()
{
    int terms;

    std::cout << "Enter the number of terms in the Fibonacci series:\n";
    std::cin >> terms;

    fibonacci(terms);

    return 0;
}

// Question 18
#include <iostream>
#include <cmath>

const double PI = 3.142;

int factorial(int n)
{
    if (n == 0 || n == 1)
        return 1;
    else
        return n * factorial(n - 1);
}

int power(int base, int exponent)
{
    return static_cast<int>(std::pow(base, exponent));
}

int main()
{
    double angle;
    std::cout << "Enter the angle in degrees:\n";
    std::cin >> angle;

    double radian = angle * PI / 180;

    double result = radian - power(radian, 3) / factorial(3) + power(radian, 5) / factorial(5) -
                    power(radian, 7) / factorial(7) + power(radian, 9) / factorial(9);

    std::cout << "sin(" << angle << " degrees) = " << result << "\n";

    return 0;
}
