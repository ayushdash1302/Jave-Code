#include<iostream>
using namespace std;

class Student

{
	public:
		static void show()
		{
			cout<<"Hello Ayush";
		}
};
main()
{
	Student::show();
}
