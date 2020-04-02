# DataStructure

## 정렬
# 단순 정렬
1. 선택 정렬(Selection Sort)
- 정의 : 선택 정렬은 이름에 맞게 현재 위치에 들어갈 값을 찾아 정렬하는 배열이다.    
현재 위치에 저장될 값의 크기가 작냐, 크냐에 따라 최소 선택 정렬(Min Selection Sort)과 최대 선택 정렬(Max Selection Sort)로 구분할 수 있다.    
최소 선택 정렬은 오름차순으로 정렬될 것이고, 최대 선택 정렬은 내림차순으로 정렬될 것이다.    

- 원리
1)정렬 되지 않은 인덱스의 맨 앞에서부터, 이를 포함한 그 이후의 배열값 중 가장 작은 값을 찾아간다.
2)가장 작은 값을 찾으면, 그 값을 현재 인덱스의 값과 바꿔준다.
3)다음 인덱스에서 위 과정을 반복한다.

2. 삽입 정렬(Insertion Sort)

3. 버블 정렬(Bubble Sort)

4. 합병 정렬(Merge Sort)

# 알고리즘 성능
 - O(n²) : Bubble Sort, Selection Sort, Insertion Sort, Shell Sort, Quick Sort
 - O(n log n) : Heap Sort, Merge Sort
 - O(kn) : Radix Sort (k는 자릿수, 자릿수가 적은 4바이트 정수에서나 제대로 된 성능을 낼 수 있다는 제약조건이 있다.)
