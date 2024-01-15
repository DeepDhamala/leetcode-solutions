def findMedianSortedArrays(nums1, nums2):
    mergedArray = [0] * (len(nums1)+len(nums2))
    i,j,k=0,0,0
    while i<len(nums1) and j<len(nums2):
        if nums1[i]<nums2[j]:
            mergedArray[k]=nums1[i]
            i+=1
        else:
            mergedArray[k]=nums2[j]
            j+=1
        k+=1

    while i<len(nums1):
        mergedArray[k]=nums1[i]
        i+=1
        k+=1
    
    while j<len(nums2):
        mergedArray[k]=nums2[j]
        j+=1
        k+=1

    if len(mergedArray)%2==1:
        return float(mergedArray[len(mergedArray)/2])
    else:
        return float((mergedArray[len(mergedArray)/2]+mergedArray[len(mergedArray)-1]/2))
