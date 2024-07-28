#include <iostream>
#include <vector>
#include <string>
#include <algorithm>
#include <map>

using namespace std;

void solution(const vector<string>& neverSeen, const vector<string>& neverHeard){
    
    map<string, bool> map;
    vector<string> result;
    
    for(int i = 0; i < neverSeen.size(); i++){
        map.insert(make_pair(neverSeen[i], true));
    }
    
    for(int i = 0; i < neverHeard.size(); i++){
        if(map[neverHeard[i]]){
            result.push_back(neverHeard[i]);
        }
    }
    
    sort(result.begin(), result.end());
    
    cout << result.size() << endl;
    for(int i = 0; i < result.size(); i++){
        cout << result[i] << endl;
    }
    
}

int main() {
    
    int n, m;
    vector<string> neverHeard;
    vector<string> neverSeen;
    
    cin >> n >> m;
    
    for(int i = 0; i < n; i++){
        string input;
        cin >> input;
        neverHeard.push_back(input);
    }
    
    for(int i = 0; i < n; i++){
        string input;
        cin >> input;
        neverSeen.push_back(input);
    }
    
    
    solution(neverHeard, neverSeen);
    
    
    
    return 0;
}
