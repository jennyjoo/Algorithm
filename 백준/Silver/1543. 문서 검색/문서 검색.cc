#include <iostream>
#include <string>

using namespace std;

int solution(string doc, string target){
    
    int result = 0;
    int pt = 0;
    
    while(doc.length() >= target.length() && pt < doc.length()){
        string tmp = doc.substr(pt++, target.length());
        if(tmp == target){
            result++;
            pt += target.length() - 1;
        }
        
    }
    
    return result;
}

int main() {
    
    string doc;
    string target;
    
    getline(cin, doc);
    getline(cin, target);
    
    cout << solution(doc, target) << endl;
    
    
    
    return 0;
}
