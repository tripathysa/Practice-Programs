listToSort=[11,21,3,2,1]
def InsertionSortAsc():
    for i in xrange(0,len(listToSort),1):
        for j in xrange(i+1,len(listToSort),1):
            if listToSort[i]<listToSort[j]:
                temp=listToSort[i]
                listToSort[i]=listToSort[j]
                listToSort[j]=temp

    return listToSort
def reverseList():
    j=len(listToSort)-1
    for i in xrange(0,len(listToSort)/2,1):
        temp=listToSort[i]
        listToSort[i]=listToSort[j]
        listToSort[j]=temp
        j=j-1
    return listToSort
def reverseString():
    temp=''
    for i in xrange(len(listToSort)-1,-1,-1):
        temp+=str(listToSort[i])
    return temp
def testSteps():
    i=1
    for i in xrange(0,len(listToSort),i*2):
        print listToSort[i]
def reversearray(arr,start,end):
     while (start < end):
        temp = arr[start]
        arr[start] = arr[end]
        arr[end] = temp
        start += 1
        end = end-1
     return arr


#print InsertionSortAsc()

print reversearray(listToSort,0,4)

#print reverseList()
#print testSteps()
#print reverseString()

#print reverseList()

