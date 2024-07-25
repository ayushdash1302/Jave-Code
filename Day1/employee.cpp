#include <iostream>
using namespace std;

class Employee
{
    int age;
    char name[30];
    float salary;

public:
    void input()
    {
        cout << "Enter employee name: ";
        cin >> name;
        cout << "Enter employee age: ";
        cin >> age;
        cout << "Enter employee salary: ";
        cin >> salary;
    }

    void display()
    {
        cout << "\nEmployee details:\n";
        cout << "Name: " << name << endl;
        cout << "Age: " << age << endl;
        cout << "Salary: " << salary << endl;
    }
};

int main()
{
    Employee emp1, emp2, emp3;

    cout << "Enter details for the first employee:\n";
    emp1.input();
    cout << "Enter details for the second employee:\n";
    emp2.input();
    cout << "Enter details for the third employee:\n";
    emp3.input();

    cout << "\nEmployee Details:\n";
    emp1.display();
    emp2.display();
    emp3.display();

    return 0;
}

