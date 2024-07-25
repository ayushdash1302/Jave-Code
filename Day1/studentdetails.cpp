#include<iostream>
using namespace std;

class Student

{
	//data members 
	int roll;
	char name[30];
	float mark;
	public:
		//methods
		void input()
		{
			cout<<"enter roll number\t ";
			cin>>roll;
			cout<<"enter name\t";
			cin>>name;
			cout<<"enter mark\t";
			cin>>mark;
			
		}
		void display()
		{
			cout<<"\ndetails of the students is \n";
			cout<<"name -"<<name;
			cout<<"\nroll number -"<<roll;
			cout<<"\nmark-"<<mark;
		}
};
main()
{
	Student st1,st2;//object
	cout<<"first student\n";
	st1.input();
	st1.display();
	cout<<"second student\n";
	st2.input();
	st2.display();
	
}
