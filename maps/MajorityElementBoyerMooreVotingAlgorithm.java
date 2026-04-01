package maps;

public class MajorityElementBoyerMooreVotingAlgorithm {

    public static void main(String[] args) {

        int nums[] = {3,2,3};

        System.out.println(majorityElement(nums));

    }

    public static int majorityElement(int[] nums) {

        int candidate = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            if (count == 0) {

                candidate = nums[i];


            }

            if (nums[i] == candidate) {

                count++;

            } else {

                count--;

            }


        }
        return candidate;
    }
}

/*

Example 1

[2,2,1,1,1,2,2]

initially count = 1, index = 0

candidate 2, count 1, index 0
candidate 2==2 so count = 2 and index is 1
candidate 2 now 1!=2 so decrement count now count is 1
candidate 2 now 1!=2 so decrement count now count is 0

so now reset candidate
candidate is 1, count is 1, index is 5
candidate is 1, 1!=2 so count becomes 0

now reset candidate again

candidate 2 , count 1  index 6
candidate 2, 2==2 so count =2  index 7

✅ When count becomes 0 — what does it mean?

It means:

👉 So far, the total number of elements equal to the candidate has been canceled out by an equal number of different elements.


 */
/*

🔹 What does “majority element > n/2” mean?

n = size of the array (number of elements)
n/2 = half of the array length
Majority element > n/2 means the element appears more than half of the total elements in the array.

Example 1: Majority exists

Array:
[2, 2, 1, 2, 3, 2]
Size n = 6
Half of n: n/2 = 6/2 = 3

Element counts:

2 → 4 times
1 → 1 time
3 → 1 time

✅ 2 appears 4 times > 3, so 2 is the majority element.

Example 2: No majority

Array:
[1, 1, 2, 3, 1, 4]
Size n = 6
Half of n: n/2 = 3

Element counts:
1 → 3 times
2 → 1 time
3 → 1 time
4 → 1 time

❌ 1 appears 3 times, which is not more than 3 → no majority element
(“most frequent element” exists, but it’s not > n/2)

🔹 How Boyer–Moore uses this property

It cancels out “different elements” against the candidate.
If a number appears more than half, it survives all cancellations.
If no number > n/2, cancellations can remove it → algorithm may fail.

Quick analogy:

Imagine a vote in a class of 6 students:
Majority vote (> n/2): a choice gets at least 4 votes → guaranteed to win.
No majority: top choice only gets 3 votes → it can be “overridden” by other votes → not guaranteed to win.
 */

