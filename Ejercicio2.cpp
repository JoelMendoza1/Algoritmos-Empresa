#include <iostream>

using namespace std;
int main(){
	int dias, cont=0, horas, Htrabxdia, TotalHoras;
	float Sueldo, SueldoSem;
	
	cout<<"Escriba el sueldo que va ganar por hora"<<endl;
	cin>>Sueldo;
	
	do{
		dias=cont+1;
		cout<<"Ingrese el numero de horas trabajadas el dia: "<<dias<<endl;
		cin>>Htrabxdia;
		TotalHoras=TotalHoras+Htrabxdia;
		cont++;
	}while(dias<5);
	
	SueldoSem=TotalHoras*Sueldo;
	cout<<"El sueldo semanal es: "<<SueldoSem<<endl;
}	

