#include <iostream>
#include <string>

using namespace std;

int solution(string doc, string target){
    
    int lt = 0, rt = 0;
    int result = 0;
    
    while(lt < doc.length()){
        if(doc[lt] != target[0]){
            lt++;
            continue;
        }
        rt = lt;
        
        int i = 0;
        for(; i < target.length() && rt < doc.length(); i++){
            if(doc[rt] == target[i]){
                rt++;
            }else{
                break;
            }
        }
        
        if(i == target.length()){
            result++;
            lt = rt;
            continue; //<- 여기서 틀림
        }
        
        lt++;
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
