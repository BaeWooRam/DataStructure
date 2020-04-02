# DataStructure

# 정렬
## 단순 정렬
**1. 선택 정렬(Selection Sort)**    
```
선택 정렬은 이름에 맞게 현재 위치에 들어갈 값을 찾아 정렬하는 배열이다.    
현재 위치에 저장될 값의 크기가 작냐, 크냐에 따라 최소 선택 정렬(Min Selection Sort)과 최대 선택 정렬(Max Selection Sort)로 구분할 수 있다.    
최소 선택 정렬은 오름차순으로 정렬될 것이고, 최대 선택 정렬은 내림차순으로 정렬될 것이다.    
```
    
- 원리    
1)정렬 되지 않은 인덱스의 맨 앞에서부터, 이를 포함한 그 이후의 배열값 중 가장 작은 값을 찾아간다.      
2)가장 작은 값을 찾으면, 그 값을 현재 인덱스의 값과 바꿔준다.    
3)다음 인덱스에서 위 과정을 반복한다.    
     
**2. 삽입 정렬(Insertion Sort)**    
```
삽입 정렬은 현재 위치에서, 그 이하의 배열들을 비교하여 자신이 들어갈 위치를 찾아, 그 위치에 삽입하는 배열 알고리즘이다.
```
    
- 원리    
```
부분집합 S : 정렬된 앞 부분의 원소들      
부분집합 U : 아직 정렬되지 않은 나머지 원소들     
정렬되지 않는 원소와 정렬된 앞 부분의 원소들을 비교한다.
```

1)두 번째 인덱스부터 시작한다. 현재 인덱스는 별도의 변수에 저장해주고, 비교 인덱스를 현재 인덱스 -1로 잡는다.    
2)별도로 저장해 둔 삽입을 위한 변수와, 비교 인덱스의 배열 값을 비교한다.    
3)삽입 변수의 값이 더 작으면 현재 인덱스로 비교 인덱스의 값을 저장해주고, 비교 인덱스를 -1하여 비교를 반복한다.    
4)만약 삽입 변수가 더 크면, 비교 인덱스+1에 삽입 변수를 저장한다.      
    
**3. 버블 정렬(Bubble Sort)**         
```
버블 정렬은 매번 연속된 두개 인덱스를 비교하여, 정한 기준의 값을 뒤로 넘겨 정렬하는 방법이다.    
오름차순으로 정렬하고자 할 경우, 비교시마다 큰 값이 뒤로 이동하여, 1바퀴 돌 시 가장 큰 값이 맨 뒤에 저장된다.    
```    
     
- 원리    
1)두 번째 인덱스부터 시작한다. 현재 인덱스 값과 이전 인덱스 값을 비교한다.    
2)만약 이전 인덱스가 더 크면 현재 인덱스와 바꾼다.    
3)현재 인덱스가 더 크면 교환하지 않고 다음 두 연속된 배열값을 비교한다.
4)이를 (전체 배열의 크기 - 현재까지 순환한 바퀴 수)만큼 반복한다.    
    
## 효율적인 정렬
**1. 합병 정렬(Merge Sort)**         
```
합병 정렬은 분할 정복 방식으로 설계된 알고리즘이다. 분할 정복은 큰 문제를 반으로 쪼개 문제를 해결해 나가는 방식으로,
분할은 배열의 크기가 1보다 작거나 같을 때까지 반복한다.
```
    
- 원리    
**분할 과정**     
1)현재 배열을 반으로 쪼갠다(배열의 시작점과 끝점을 더한 후 2로 나눈다)    
2)이를 쪼갠 배열의 크기가 0이거나 1일때 까지 반복한다.    
    
**합병과정**    
1)두 배열 A,B의 크기를 비교한다. 각각의 배열의 현재 인덱스를 i,j로 가정하자,   
2)i에는 A배열의 시작 인덱스를 저장하고 j에는 B배열의 시작 인덱스를 저장한다.    
3)A[i]와 B[j]를 비교한다. 오름차순의 경우 이중에 작은 값을 새 배열 C에 저장한다. A[i]가 더 크다면 A[i]의 값을 배열 C에 저장해주고, i의 값을 하나 증가시켜준다.    
4)이를 i나 j 둘중 하나가 각자 배열의 끝에 도달할 때까지 반복한다.    
5)끝까지 저장을 못한 배열의 값을, 순서대로 전부다 C에 저장한다.    
6)C배열을 원래의 배열에 저장해준다.    
    
**2. 힙 정렬**        

**3. 퀵 정렬(Quick Sort)**        
```
정렬한 전체 원소에 대해서 정렬을 수행하지 않고, 기준 값을 중심으로 왼쪽 부분 집합과 오른쪽 부분 집합으로 분할하여 정렬하는 방법이다.
```
    
- 원리    
1) 기준 값(pivot)을 설정(일반적으로 전체 원소 중에서 가운데에 위치한 원소를 선택한다)    
2) 정렬할 자료들을 기준 값을 중심으로 2개의 부분 집합으로 분할한다.    
3) 부분 집합의 원소들 중에서 기준 값보다 작은 원소들은 왼쪽 부분으로 집합, 큰 원소들은 오른쪽 부분으로 집합하여 정렬한다.    
4) 부분 집합의 크기가 1이하로 충분히 작지 않으면 순환 호출을 이용하여 다시 분할한다.    
    
https://gmlwjd9405.github.io/2018/05/10/algorithm-quick-sort.html

**4. 셸 정렬(Shell Sort)**    

https://gmlwjd9405.github.io/2018/05/08/algorithm-shell-sort.html

## 알고리즘 성능
 - O(n²) : Bubble Sort, Selection Sort, Insertion Sort, Shell Sort, Quick Sort
 - O(n log n) : Heap Sort, Merge Sort
 - O(kn) : Radix Sort (k는 자릿수, 자릿수가 적은 4바이트 정수에서나 제대로 된 성능을 낼 수 있다는 제약조건이 있다.)

##참조
https://hsp1116.tistory.com/33
https://medium.com/@joongwon/%EC%A0%95%EB%A0%AC-%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98-%EA%B8%B0%EC%B4%88-805391cb088e
https://ko.wikipedia.org/wiki/%EC%A0%95%EB%A0%AC_%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98#%EB%8B%A8%EC%88%9C_%EC%A0%95%EB%A0%AC
      
      
       
# 탐색
