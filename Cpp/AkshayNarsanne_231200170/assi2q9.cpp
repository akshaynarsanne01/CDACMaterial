#include <iostream>

int main()
{
    int choice, num1, num2, result;

    std::cout << "Menu:\n";
    std::cout << "1. Addition\n";
    std::cout << "2. Subtraction\n";
    std::cout << "3. Multiplication\n";
    std::cout << "4. Division\n";
    std::cout << "Enter your choice (1-4):\n";
    std::cin >> choice;

    std::cout << "Enter two numbers:\n";
    std::cin >> num1 >> num2;

    switch (choice)
    {
    case 1:
        result = num1 + num2;
        break;
    case 2:
        result = num1 - num2;
        break;
    case 3:
        result = num1 * num2;
        break;
    case 4:
        if (num2 != 0)
        {
            result = num1 / num2;
        }
        else
        {
            std::cout << "Division by zero is undefined.\n";
            return 1;
        }
        break;
    default:
        std::cout << "Invalid choice.\n";
        return 1;
    }

    std::cout << "Result: " << result << "\n";

    return 0;
}
