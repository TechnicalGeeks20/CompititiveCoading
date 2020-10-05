#include <iostream>
#include <vector>
using namespace std;

vector<int> factorial(int n){
    vector<int> fact(1,1);
    int num;
    for(int i = 1; i <= n; i++){
        int carry = 0;
        for(int j = 0; j < fact.size(); j++){
            num = i * fact[j] + carry;
            fact[j] = num%10;
            carry = num/10;
        }
        while(carry){
            fact.push_back(carry%10);
            carry /= 10;
        }
    }
    return fact;
}




int main() {
	// your code goes here
	int test,n;
	cout<<"Enter No of test Cases  ";
	cin >> test;
	
	while(test--){
	    cout<<"Enter Number  ";	
	    cin >> n;
	    vector<int> largeNum = factorial(n);
        for(vector<int>::reverse_iterator it = largeNum.rbegin(); it != largeNum.rend();it++){
            cout << *it;
        }
	    cout << endl;
	}
	return 0;
}
