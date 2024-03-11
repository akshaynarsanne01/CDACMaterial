// Question 22
#include <iostream>

void printRectangle(int length, int breadth)
{
    for (int i = 0; i < length; ++i)
    {
        for (int j = 0; j < breadth; ++j)
        {
            std::cout << "* ";
        }
        std::cout << "\n";
    }
}

int main()
{
    int length, breadth;

    std::cout << "Enter length and breadth of the rectangle:\n";
    std::cin >> length >> breadth;

    printRectangle(length, breadth);

    return 0;
}

// Question 23
#include <iostream>

int main()
{
    int matchsticks = 21;
    int userChoice, computerChoice;

    while (matchsticks > 0)
    {
        std::cout << "Remaining matchsticks: " << matchsticks << "\n";
        std::cout << "Pick 1, 2, 3, or 4 matchsticks:\n";
        std::cin >> userChoice;

        if (userChoice < 1 || userChoice > 4 || userChoice > matchsticks)
        {
            std::cout << "Invalid choice. Try again.\n";
            continue;
        }

        matchsticks -= userChoice;

        if (matchsticks == 0)
        {
            std::cout << "You lose! Computer wins.\n";
            break;
        }

        computerChoice = 5 - userChoice;
        std::cout << "Computer picks " << computerChoice << " matchsticks.\n";
        matchsticks -= computerChoice;

        if (matchsticks == 0)
        {
            std::cout << "You win! Computer loses.\n";
        }
    }

    return 0;
}
