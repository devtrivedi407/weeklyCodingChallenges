//Objective: To create a Java program to determine the result of an Plurality Election using a rank-based system.  

import java.util.Scanner;

public class plularityElection {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

// Candidates standing the Election
System.out.println("The Candidates standing in Election are: \n");

String[] candidates = { "alice", "bob", "charlie" };

for (int i = 0; i < candidates.length; i++) {
System.out.println((i + 1) + ") " + (candidates[i].substring(0, 1).toUpperCase() + candidates[i].substring(1)));
}

// Total Number of Voters

System.out.print("\nNumbers of Voters: ");
int noOfVoters = sc.nextInt();

calculate_rank(noOfVoters, candidates);
}

public static void calculate_rank(int noOfVoters, String[] candidates) {

// Taking the Input of Ranks from the the Voters

Scanner input = new Scanner(System.in);

String[] rank1 = new String[noOfVoters];
String[] rank2 = new String[noOfVoters];
String[] rank3 = new String[noOfVoters];

for (int i = 0; i < rank1.length; i++) {

System.out.print("\n");

System.out.print("Rank 1: ");
rank1[i] = input.nextLine().toLowerCase();
System.out.print("Rank 2: ");
rank2[i] = input.nextLine().toLowerCase();
System.out.print("Rank 3: ");
rank3[i] = input.nextLine().toLowerCase();
}
System.out.print("\n");

calculate_winner(rank1, rank2, rank3, candidates);

}

public static void calculate_winner(String[] rank1, String[] rank2, String[] rank3, String[] candidates) {
int candidate1_count = 0;
int candidate2_count = 0;
int candidate3_count = 0;

// Comparing the Ranks of the Candidates and Incrementing the Counts of the
// Matching Candidates

for (int i = 0; i < rank1.length; i++) {

if (rank1[i].equalsIgnoreCase(candidates[0])) {
candidate1_count++;
} else if (rank1[i].equalsIgnoreCase(candidates[1])) {
candidate2_count++;
} else {
candidate3_count++;
}

}
if (candidate1_count != candidate2_count && candidate2_count != candidate3_count && candidate1_count != candidate3_count) {

// Printing the Winner of the Plurality Election
if (candidate1_count > candidate2_count && candidate1_count > candidate3_count) {
System.out.println(
"Winner: " + (candidates[0].substring(0, 1).toUpperCase() + candidates[0].substring(1)));
} else if (candidate1_count < candidate2_count && candidate2_count > candidate3_count) {
System.out.println(
"Winner: " + (candidates[1].substring(0, 1).toUpperCase() + candidates[1].substring(1)));
} else{
   System.out.println(
"Winner: " + (candidates[2].substring(0, 1).toUpperCase() + candidates[2].substring(1)));
}
    }

else if(candidate1_count == candidate2_count) {
tie_candidate1_candidate2(rank1, rank2, rank3, candidates, candidate1_count, candidate2_count);
}
else if (candidate2_count == candidate3_count){
   tie_candidate2_candidate3(rank1, rank2, rank3, candidates, candidate2_count, candidate3_count);
}
else if (candidate1_count == candidate3_count){
   tie_candidate1_candidate3(rank1, rank2, rank3, candidates, candidate1_count, candidate3_count);
}
else{
   
}
}

public static void tie_candidate1_candidate2(String[] rank1, String[] rank2, String[] rank3, String[] candidates, int candidate1_count,
int candidate2_count) {
   
for (int i = 0; i < rank2.length; i++) {

if (rank2[i].equalsIgnoreCase(candidates[0])) {
candidate1_count++;
} else if(rank2[i].equalsIgnoreCase(candidates[1])){
candidate2_count++;
}
else {}
}


if (candidate1_count > candidate2_count) {
System.out.println(
"Winner: " + (candidates[0].substring(0, 1).toUpperCase() + candidates[0].substring(1)));
} else if (candidate1_count < candidate2_count) {
System.out.println(
"Winner: " + (candidates[1].substring(0, 1).toUpperCase() + candidates[1].substring(1)));
} else {
tie_rank2_candidate1_candidate2(rank1, rank2, rank3, candidates, candidate1_count, candidate2_count);
}

}
public static void tie_candidate2_candidate3(String[] rank1, String[] rank2, String[] rank3, String[] candidates, int candidate2_count,
int candidate3_count) {

for (int i = 0; i < rank2.length; i++) {

if (rank2[i].equalsIgnoreCase(candidates[1])) {
candidate2_count++;
} else if(rank2[i].equalsIgnoreCase(candidates[2])) {
candidate3_count++;
}
else {}

}

if (candidate2_count > candidate3_count) {
System.out.println(
"Winner: " + (candidates[1].substring(0, 1).toUpperCase() + candidates[1].substring(1)));
} else if (candidate2_count < candidate3_count) {
System.out.println(
"Winner: " + (candidates[2].substring(0, 1).toUpperCase() + candidates[2].substring(1)));
} else {
tie_rank2_candidate2_candidate3(rank1, rank2, rank3, candidates, candidate2_count, candidate3_count);
}
}

public static void tie_candidate1_candidate3(String[] rank1, String[] rank2, String[] rank3, String[] candidates, int candidate1_count,
int candidate3_count) {

for (int i = 0; i < rank2.length; i++) {

if (rank2[i].equalsIgnoreCase(candidates[0])) {
candidate1_count++;
} else if (rank2[i].equalsIgnoreCase(candidates[2])){
candidate3_count++;
}
else {}

}

if (candidate1_count > candidate3_count) {
System.out.println(
"Winner: " + (candidates[0].substring(0, 1).toUpperCase() + candidates[1].substring(1)));
} else if (candidate1_count < candidate3_count) {
System.out.println(
"Winner: " + (candidates[2].substring(0, 1).toUpperCase() + candidates[2].substring(1)));
} else {
   tie_rank2_candidate1_candidate3(rank1, rank2, rank3, candidates, candidate1_count, candidate3_count);
}
}
public static void tie_rank2_candidate1_candidate2(String[] rank1,String[] rank2,String[] rank3,String[] candidates,int candidate1_count,int candidate2_count){
   for (int i = 0; i < rank2.length; i++) {

if (rank3[i].equalsIgnoreCase(candidates[0])) {
candidate1_count++;
} else if(rank3[i].equalsIgnoreCase(candidates[1])){
candidate2_count++;
}
else {}
            }

if (candidate1_count > candidate2_count) {
System.out.println(
"Winner: " + (candidates[0].substring(0, 1).toUpperCase() + candidates[0].substring(1)));
} else if (candidate1_count < candidate2_count) {
System.out.println(
"Winner: " + (candidates[1].substring(0, 1).toUpperCase() + candidates[1].substring(1)));
} else {

}

}
public static void tie_rank2_candidate2_candidate3(String[] rank1,String[] rank2,String[] rank3,String[] candidates,int candidate2_count,int candidate3_count){
   for (int i = 0; i < rank2.length; i++) {

if (rank3[i].equalsIgnoreCase(candidates[1])) {
candidate2_count++;
} else if(rank3[i].equalsIgnoreCase(candidates[2])){
candidate3_count++;
}
else {}
            }

if (candidate2_count > candidate3_count) {
System.out.println(
"Winner: " + (candidates[1].substring(0, 1).toUpperCase() + candidates[1].substring(1)));
} else if (candidate2_count < candidate3_count) {
System.out.println(
"Winner: " + (candidates[2].substring(0, 1).toUpperCase() + candidates[2].substring(1)));
} else {

}

}
public static void tie_rank2_candidate1_candidate3(String[] rank1,String[] rank2,String[] rank3,String[] candidates,int candidate1_count,int candidate3_count){
   for (int i = 0; i < rank2.length; i++) {

if (rank3[i].equalsIgnoreCase(candidates[0])) {
candidate1_count++;
} else if(rank3[i].equalsIgnoreCase(candidates[2])){
candidate3_count++;
}
else {}
            }

System.out.println("candidate1_count = "+candidate1_count+", candidate3_count "+candidate3_count);

if (candidate1_count > candidate3_count) {
System.out.println(
"Winner: " + (candidates[0].substring(0, 1).toUpperCase() + candidates[0].substring(1)));
} else if (candidate1_count < candidate3_count) {
System.out.println(
"Winner: " + (candidates[2].substring(0, 1).toUpperCase() + candidates[2].substring(1)));
} else {

}

}
}


/*
SAMPLE OUTPUT

The Candidates standing in Election are: 

1) Alice
2) Bob
3) Charlie

Numbers of Voters: 5

Rank 1: Alice
Rank 2: Charlie
Rank 3: Bob

Rank 1: Alice
Rank 2: Charlie
Rank 3: Bob

Rank 1: Bob
Rank 2: Charlie
Rank 3: Alice

Rank 1: Bob
Rank 2: Charlie
Rank 3: Alice

Rank 1: Charlie
Rank 2: Alice
Rank 3: Bob

Winner: Alice

 */