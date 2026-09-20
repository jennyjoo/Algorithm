import math

def isInteger(sqrt):
    floor = int(math.floor(sqrt));
    
    if sqrt - floor == 0: 
        return True
    else :
        return False
    

def solution(n):
    answer = 0
    
    sqrt = math.sqrt(n);
    
    if isInteger(sqrt):
        answer = math.pow(sqrt + 1, 2)
    else :
        answer = -1;
        
    return answer