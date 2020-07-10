// Copyright (c) 2019-present, Facebook, Inc.
// All rights reserved.
//
// This source code is licensed under the license found in the
// LICENSE file in the root directory of this source tree.
//

import java.util. *;
import java.util.stream.*;
import java.lang.*;
import javafx.util.Pair;
public class FIND_MEDIAN_ROW_WISE_SORTED_MATRIX{
static int f_gold ( int m [ ] [ ] , int r , int c ) {
  int max = Integer . MIN_VALUE ;
  int min = Integer . MAX_VALUE ;
  for ( int i = 0 ;
  i < r ;
  i ++ ) {
    if ( m [ i ] [ 0 ] < min ) min = m [ i ] [ 0 ] ;
    if ( m [ i ] [ c - 1 ] > max ) max = m [ i ] [ c - 1 ] ;
  }
  int desired = ( r * c + 1 ) / 2 ;
  while ( min < max ) {
    int mid = min + ( max - min ) / 2 ;
    int place = 0 ;
    int get = 0 ;
    for ( int i = 0 ;
    i < r ;
    ++ i ) {
      get = Arrays . binarySearch ( m [ i ] , mid ) ;
      if ( get < 0 ) get = Math . abs ( get ) - 1 ;
      else {
        while ( get < m [ i ] . length && m [ i ] [ get ] == mid ) get += 1 ;
      }
      place = place + get ;
    }
    if ( place < desired ) min = mid + 1 ;
    else max = mid ;
  }
  return min ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ] [ ]> param0 = new ArrayList<>();
    param0.add(new int[][]{new int[]{1,3,5}, new int[]{2,6,9}, new int[]{3,6,9}});
    param0.add(new int[][]{new int[]{7,22,92,20,32,19,28,89,86,66,85,70,97,42,54,67,64,24,12,69},new int[]{86,84,97,68,26,16,84,19,31,3,79,55,11,16,47,39,52,1,32,72},new int[]{19,59,90,41,85,86,11,71,70,25,96,33,95,16,36,17,45,26,23,45},new int[]{47,56,11,30,25,98,21,2,67,5,45,66,95,64,23,78,18,75,58,60},new int[]{15,85,69,67,82,8,38,26,96,64,77,64,74,1,42,11,69,1,65,83},new int[]{50,69,76,92,60,37,23,5,87,88,81,4,17,30,54,89,81,78,23,24},new int[]{17,59,52,46,81,78,59,79,19,69,17,97,6,25,47,17,33,11,33,28},new int[]{41,59,5,85,30,46,90,56,3,85,12,7,26,44,56,55,13,78,25,81},new int[]{16,92,41,82,4,40,51,81,55,33,39,24,83,63,60,98,94,52,49,95},new int[]{66,41,15,57,49,59,74,6,97,64,23,42,69,40,31,14,70,97,45,96},new int[]{12,39,22,78,35,88,99,79,13,40,21,58,67,72,14,63,10,97,72,56},new int[]{4,55,9,61,65,61,56,87,77,93,53,44,56,94,39,23,21,77,95,13},new int[]{59,26,88,89,47,4,85,71,70,70,43,39,31,73,2,85,7,1,7,9},new int[]{89,48,55,77,95,60,70,78,58,49,30,22,4,93,66,30,24,80,25,65},new int[]{76,16,55,27,93,93,68,60,58,96,57,48,41,68,34,34,2,92,1,87},new int[]{37,83,59,91,43,59,76,65,13,1,45,74,14,40,22,46,84,47,59,92},new int[]{12,57,80,65,18,68,70,58,51,62,62,35,76,27,56,29,43,17,37,40},new int[]{91,57,6,59,59,71,43,84,74,15,15,87,10,68,33,76,9,27,62,11},new int[]{96,15,71,90,8,69,66,2,74,17,77,9,80,71,76,4,31,96,3,41},new int[]{7,66,75,50,60,71,47,57,84,22,22,89,18,74,62,12,29,3,53,26}});
    param0.add(new int[][]{new int[]{99,84,78,41,13,40,92,51,96,2,36,14,26,66,11,73,50,71,35,81,90,29,38,33,75,98,6,18,31,79,94,77,5,84,40,47},new int[]{63,82,43,2,76,20,24,73,35,55,52,95,45,47,93,51,29,68,50,14,28,58,33,72,51,1,68,29,35,18,44,55,36,19,49,21},new int[]{53,80,70,90,1,82,1,27,19,99,90,52,79,70,63,95,98,81,67,84,2,37,53,73,87,97,39,31,19,42,51,68,34,54,58,15},new int[]{29,57,6,46,71,27,89,1,73,22,22,53,66,70,93,65,55,81,96,44,37,38,68,5,23,60,42,81,98,24,42,48,98,99,6,67},new int[]{16,29,74,58,93,95,3,22,65,31,5,91,38,20,65,87,64,68,30,68,7,61,92,52,31,17,78,19,7,23,66,54,76,43,11,29},new int[]{35,61,28,58,96,7,17,66,22,28,57,2,92,84,61,75,45,21,82,56,60,95,67,36,41,19,48,7,94,75,11,81,61,96,4,56},new int[]{6,62,30,59,43,61,56,58,59,77,65,60,53,11,80,49,42,89,62,66,91,20,94,17,89,44,16,58,21,53,82,10,6,17,12,42},new int[]{60,33,36,94,23,3,73,67,62,46,9,83,22,78,50,95,98,54,53,87,33,41,92,21,26,10,64,23,67,10,1,28,77,39,78,58},new int[]{38,65,2,70,18,52,54,18,22,47,76,75,73,28,42,39,19,20,68,27,65,91,46,64,64,57,50,92,99,1,3,4,27,37,23,27},new int[]{89,82,2,10,44,98,90,27,96,37,75,49,29,77,8,88,60,93,65,77,54,25,7,22,97,15,3,55,8,48,65,76,95,92,83,82},new int[]{52,77,99,38,22,57,13,36,54,47,47,70,72,88,80,83,38,48,67,22,22,62,87,1,86,63,80,42,67,2,61,61,10,36,57,16},new int[]{13,34,22,19,18,48,10,83,27,14,12,76,86,9,35,14,24,67,90,46,26,46,99,71,29,5,30,12,89,61,14,31,43,76,62,52},new int[]{67,89,45,23,94,5,58,97,40,12,94,17,15,43,67,75,14,59,81,96,35,30,69,13,98,21,90,38,56,70,68,82,95,24,73,27},new int[]{8,90,77,64,57,5,19,52,78,45,37,96,15,58,27,81,98,91,91,8,48,26,78,9,76,15,98,86,12,89,33,4,5,16,53,45},new int[]{68,19,13,3,5,15,91,33,84,41,34,17,41,58,7,44,37,44,37,15,98,3,66,98,60,99,63,84,17,95,81,74,87,30,37,44},new int[]{66,41,60,70,13,56,24,3,64,29,16,88,4,71,54,20,79,73,57,99,67,56,89,64,67,15,75,88,70,21,78,27,77,87,66,95},new int[]{77,16,1,66,96,66,4,66,4,77,45,1,57,67,15,67,97,14,10,87,43,8,1,45,92,75,73,43,11,41,65,40,52,67,87,83},new int[]{45,9,70,80,45,83,19,3,44,13,26,20,64,23,83,31,70,99,51,6,17,65,92,44,61,95,16,68,67,7,60,23,68,20,77,72},new int[]{36,98,68,26,35,53,20,10,70,94,3,84,46,67,80,4,40,39,17,29,4,74,73,75,65,95,17,64,47,18,71,26,24,33,90,29},new int[]{88,46,76,92,26,41,25,15,95,34,51,72,27,4,76,95,85,20,48,53,63,17,95,79,32,66,92,85,50,13,97,27,26,53,34,82},new int[]{74,83,57,12,88,65,9,93,45,92,99,82,44,48,19,86,82,54,76,73,36,15,9,9,46,31,55,70,58,15,40,10,1,72,24,85},new int[]{64,48,94,50,3,70,64,25,56,41,59,33,75,12,1,68,69,99,59,75,30,33,40,85,22,25,98,4,12,4,23,70,58,97,35,58},new int[]{97,6,7,21,15,66,87,67,12,49,79,62,33,61,13,13,59,28,77,24,30,4,13,76,1,44,49,81,24,34,39,42,7,23,21,43},new int[]{60,24,67,93,28,66,4,81,84,36,57,90,57,86,19,31,42,60,89,30,48,73,30,41,32,59,48,79,99,65,21,36,67,79,88,16},new int[]{58,7,80,28,50,12,25,30,72,11,60,42,55,36,49,46,94,70,35,94,14,37,92,40,52,41,5,21,55,49,61,6,51,61,62,24},new int[]{52,16,7,42,90,21,48,60,82,17,21,52,6,19,66,19,22,80,25,44,11,76,28,66,38,76,25,2,33,13,56,52,45,50,59,64},new int[]{88,84,84,47,12,45,37,8,97,31,29,18,56,20,72,46,88,1,58,67,75,42,43,3,21,69,65,78,68,19,47,20,7,60,48,9},new int[]{34,42,13,68,36,19,81,60,89,14,5,7,78,97,76,52,4,52,56,6,65,84,90,87,76,13,59,57,82,95,46,53,28,69,39,20},new int[]{20,98,50,14,15,36,30,18,98,26,83,64,68,91,55,67,44,59,12,36,2,42,34,31,69,20,38,75,95,89,4,85,62,1,42,51},new int[]{37,43,92,62,51,53,1,64,16,2,2,58,17,86,80,77,7,62,17,21,95,79,64,43,87,53,41,26,94,75,26,70,67,89,79,59},new int[]{21,42,70,23,57,53,76,27,62,79,72,25,43,48,61,19,35,21,18,93,91,40,74,53,5,22,56,14,40,1,77,27,49,58,81,72},new int[]{92,26,20,83,14,25,36,28,8,49,97,6,89,1,94,5,73,8,88,89,41,72,85,19,3,39,16,65,74,70,69,17,21,93,62,31},new int[]{3,38,60,92,92,65,76,16,89,82,8,70,51,50,73,18,94,84,82,29,75,82,33,3,92,5,80,59,4,18,27,18,66,6,99,83},new int[]{93,11,38,65,59,54,21,99,8,67,15,81,92,61,51,41,78,17,39,20,39,70,70,77,35,99,27,32,98,3,32,71,34,21,29,4},new int[]{68,1,31,45,81,71,52,44,50,36,21,23,77,34,69,31,12,28,48,28,7,34,86,51,88,78,80,11,94,38,42,7,46,45,3,79},new int[]{57,30,97,52,81,54,48,84,33,91,20,98,95,5,82,83,17,87,2,24,51,48,44,1,52,22,14,77,76,71,66,67,40,36,77,58}});
    param0.add(new int[][]{new int[]{37,14,64,26,40,7,92,8,79,5,97,43,36,59,3,62,22,22,96,38,50,87,53,85,4,79,21,20,84,25,45,64,61,53,95,68},new int[]{56,93,99,94,58,73,37,5,18,33,13,33,40,66,12,93,93,47,48,23,40,5,36,31,23,16,72,9,54,66,18,47,83,37,40,72},new int[]{81,69,72,74,3,67,95,91,92,38,27,16,15,72,49,28,79,60,24,69,70,60,55,5,25,40,7,31,61,3,52,82,64,93,65,56},new int[]{29,59,40,33,88,35,71,97,68,35,34,74,74,20,44,81,41,77,7,94,22,11,13,23,74,28,17,47,94,22,49,40,84,6,82,95},new int[]{26,47,66,45,31,50,13,38,99,25,96,29,35,28,83,19,7,49,83,72,14,99,8,66,64,93,24,15,72,3,11,71,39,5,21,22},new int[]{96,38,7,90,91,53,53,43,51,4,18,2,58,33,65,94,63,89,90,31,80,68,13,27,57,14,52,63,80,73,94,9,39,91,7,57},new int[]{55,7,83,80,16,47,98,63,93,96,79,33,21,95,39,29,16,45,87,71,32,43,30,10,15,13,58,86,23,53,34,70,45,32,53,76},new int[]{31,44,79,76,99,65,25,10,33,57,42,52,63,15,8,38,28,72,88,2,3,25,34,36,81,52,19,93,62,52,83,30,11,9,98,20},new int[]{4,69,53,77,68,10,66,55,10,47,66,80,71,73,24,73,46,93,8,12,2,9,71,29,96,84,23,89,79,33,94,16,9,74,36,55},new int[]{32,47,14,35,14,1,51,88,76,48,58,41,73,13,57,26,15,80,10,17,10,47,10,61,35,8,10,71,98,65,69,81,48,20,68,46},new int[]{98,36,1,50,60,29,20,29,16,80,40,88,17,91,73,20,46,24,42,85,81,50,31,14,37,13,93,97,85,43,6,79,14,32,63,9},new int[]{46,74,83,67,32,1,16,32,66,83,47,79,5,14,69,11,27,39,7,2,49,42,23,21,87,1,29,51,35,35,37,47,18,97,6,74},new int[]{28,58,76,68,25,71,38,84,55,44,23,59,72,81,29,48,99,54,26,10,75,79,82,68,91,69,70,10,19,76,59,24,80,73,77,18},new int[]{32,19,38,21,56,85,57,49,6,55,2,6,81,30,55,11,25,35,73,89,8,67,90,86,24,21,16,46,36,10,66,97,91,17,75,73},new int[]{57,10,75,79,66,17,75,32,69,18,46,46,2,27,8,92,28,56,49,69,94,91,27,89,27,12,4,52,57,34,50,24,36,53,17,32},new int[]{54,60,55,62,59,76,6,32,2,16,55,91,68,28,80,23,47,10,61,82,99,53,68,85,59,90,16,36,19,21,99,39,37,57,21,85},new int[]{13,1,35,97,50,53,9,95,86,57,6,48,59,91,87,94,67,84,22,21,15,49,79,50,47,79,69,41,84,22,92,91,77,62,78,10},new int[]{74,19,91,88,43,65,27,8,54,81,28,44,91,97,24,65,8,2,18,79,61,42,40,4,64,39,79,90,77,10,34,91,27,45,88,95},new int[]{10,77,83,37,3,15,62,9,67,4,29,29,31,60,22,82,66,44,35,12,22,90,89,32,9,64,59,74,64,99,48,53,32,54,41,67},new int[]{55,94,35,58,69,94,1,9,49,68,46,84,88,37,77,77,19,81,20,39,15,97,93,72,21,54,10,49,1,32,88,14,28,40,52,27},new int[]{15,61,89,62,1,4,39,27,31,51,84,42,63,88,81,30,7,54,97,59,68,72,66,29,59,34,53,81,40,58,84,29,70,84,91,70},new int[]{49,6,7,36,70,98,1,94,22,81,42,84,32,32,6,6,72,11,29,33,1,91,72,77,37,37,93,26,41,90,96,42,60,88,3,13},new int[]{11,57,69,65,98,32,13,17,66,21,85,70,54,94,15,15,9,76,71,88,21,9,96,66,71,2,56,12,56,79,99,51,70,59,71,11},new int[]{3,34,95,85,93,19,7,11,63,67,56,43,56,45,60,33,28,96,57,52,4,99,17,35,42,60,26,48,64,17,98,72,73,7,65,52},new int[]{41,16,66,72,86,56,27,18,63,80,26,22,58,1,96,46,86,27,44,33,94,83,33,54,25,6,48,93,60,62,15,76,59,38,15,31},new int[]{65,20,29,75,73,16,80,33,55,19,89,50,34,64,24,32,3,13,94,87,94,12,62,45,24,24,94,81,15,50,88,96,88,67,45,65},new int[]{20,21,12,85,83,19,2,33,37,10,32,94,81,30,14,5,36,77,58,80,13,93,88,18,8,69,48,78,3,70,17,51,57,43,42,29},new int[]{86,98,55,70,43,60,41,91,49,78,84,27,3,81,68,42,77,54,1,21,67,47,89,59,1,14,98,40,67,9,69,25,64,60,33,5},new int[]{76,52,75,33,16,3,5,62,19,11,85,73,18,12,43,87,50,40,77,35,57,56,28,62,99,87,15,8,15,65,35,58,76,9,39,97},new int[]{21,95,60,94,43,63,42,83,34,17,98,65,25,99,58,10,97,78,6,50,20,46,76,91,11,79,28,2,64,14,69,74,78,82,98,81},new int[]{28,38,95,33,54,60,4,54,87,21,25,51,15,78,13,61,97,21,44,61,24,89,35,23,68,55,21,24,90,61,89,8,70,62,98,3},new int[]{16,6,21,3,65,71,24,20,34,46,72,89,38,28,37,61,25,76,43,20,82,33,33,39,12,78,20,18,74,17,5,64,28,33,38,85},new int[]{39,92,65,3,77,26,70,89,35,19,50,35,86,11,89,26,10,46,28,83,19,36,18,26,49,55,8,5,72,30,8,36,74,27,15,84},new int[]{38,82,39,76,43,82,35,51,38,91,72,35,52,96,9,44,8,72,1,25,71,32,62,10,86,17,11,47,56,41,16,25,30,76,41,61},new int[]{49,90,90,76,42,63,95,26,38,28,70,1,66,91,42,8,50,10,73,52,11,4,30,37,91,17,9,6,93,69,49,1,18,14,12,68},new int[]{72,70,60,84,87,81,65,53,39,49,78,2,16,48,45,26,11,55,97,13,27,62,12,63,3,4,15,92,47,78,24,41,70,75,93,16}});
    param0.add(new int[][]{new int[]{82,57,41,47,46,74,62,36,30,15,18,29,58,93,22,55,23,93,44,70,60,88,5,87,34,12,75,67,88,93,41,95,8,2},new int[]{93,58,37,80,60,41,72,36,78,76,91,19,51,54,77,29,67,8,61,56,78,7,68,21,45,12,95,73,7,45,35,40,11,42},new int[]{2,34,54,99,80,51,32,79,74,12,13,30,86,71,80,45,97,87,97,70,46,32,83,36,30,3,37,82,98,80,4,68,43,7},new int[]{82,43,37,99,66,46,69,3,35,15,80,27,76,69,53,67,75,39,6,14,87,4,16,7,27,67,3,32,48,68,10,1,18,94},new int[]{28,43,80,22,64,30,41,39,74,25,11,87,22,20,5,22,81,18,79,94,76,2,3,44,78,36,37,78,23,53,79,62,71,58},new int[]{33,57,49,38,76,51,58,24,78,42,71,20,93,44,54,47,7,5,97,52,77,32,27,50,66,77,38,56,63,30,46,70,67,51},new int[]{94,59,83,59,50,80,68,52,45,9,64,8,49,55,90,9,12,92,69,80,19,87,8,18,26,43,26,79,14,7,89,2,48,70},new int[]{73,56,21,75,7,96,40,27,77,2,13,4,68,26,87,20,94,89,57,27,64,20,80,4,73,71,47,20,41,61,96,65,73,40},new int[]{83,40,98,54,98,23,65,36,56,87,64,93,87,47,87,42,27,91,91,23,87,85,71,85,45,84,32,39,54,44,64,70,82,6},new int[]{8,66,40,63,84,42,77,72,90,62,74,73,92,7,1,97,43,13,98,11,93,91,35,38,89,45,51,15,59,66,14,14,41,24},new int[]{5,34,32,92,46,77,16,85,22,87,32,76,41,22,53,23,35,89,43,62,45,94,57,94,67,55,31,54,36,35,14,22,15,87},new int[]{72,50,24,42,40,49,97,71,9,98,43,62,20,19,96,21,90,9,61,34,70,33,79,82,87,59,71,14,78,53,54,84,98,94},new int[]{44,29,7,94,94,46,90,69,89,94,34,46,19,30,8,86,94,18,87,60,88,44,52,80,8,13,42,78,20,96,35,72,66,87},new int[]{49,66,92,69,89,1,51,86,71,54,87,88,26,78,95,91,22,49,46,17,94,60,85,8,61,61,2,48,46,61,6,13,29,63},new int[]{99,94,46,34,84,15,74,24,82,3,28,50,76,97,16,49,42,3,33,88,1,51,78,9,99,16,73,76,31,49,6,30,45,89},new int[]{29,52,29,86,68,73,85,11,77,20,74,57,87,96,88,44,11,33,91,59,87,68,49,15,3,67,89,86,11,75,55,8,37,28},new int[]{20,22,58,46,75,23,98,34,50,47,88,49,3,30,23,65,18,52,67,88,25,2,58,86,73,54,16,63,43,44,16,79,7,27},new int[]{18,7,86,62,61,62,62,13,59,83,26,17,17,16,57,13,69,98,19,93,93,91,76,54,69,61,94,49,29,59,23,61,1,69},new int[]{48,4,11,43,14,32,56,77,96,50,62,9,31,51,50,81,77,30,26,11,3,54,83,22,49,55,86,63,96,71,64,88,73,47},new int[]{89,86,24,44,7,53,23,65,37,69,23,42,85,15,66,85,18,40,18,18,79,59,75,76,65,99,32,63,10,12,87,91,1,97},new int[]{19,23,11,49,68,67,75,48,9,24,39,9,15,1,75,23,9,6,12,54,15,3,1,13,97,75,62,80,3,16,32,90,28,91},new int[]{81,48,48,27,12,35,19,97,17,9,46,12,33,79,29,13,67,99,58,85,99,99,95,77,96,63,82,18,10,80,87,31,53,98},new int[]{44,29,49,80,57,94,89,37,48,83,96,59,12,15,56,79,84,60,70,19,53,29,62,27,99,97,83,40,36,69,20,98,48,71},new int[]{98,55,58,92,39,86,41,50,59,56,53,63,41,30,55,85,61,40,73,36,13,46,97,90,1,60,2,36,45,94,80,9,15,39},new int[]{55,59,86,79,4,16,11,96,22,65,54,90,3,96,97,97,66,86,57,12,66,8,81,4,44,65,6,62,40,86,35,50,40,11},new int[]{66,18,73,70,34,12,21,60,90,10,16,79,23,21,61,43,16,58,11,84,21,16,75,33,86,89,33,98,15,65,4,81,92,32},new int[]{8,36,83,56,88,3,14,96,76,95,34,95,36,96,35,32,80,1,52,13,75,75,25,64,5,63,85,99,76,52,46,77,67,76},new int[]{47,34,20,39,52,50,68,41,43,49,71,47,57,67,46,41,77,29,41,85,46,25,3,30,86,2,9,58,4,72,19,85,14,1},new int[]{20,83,80,74,66,65,8,9,39,64,57,82,15,80,85,25,88,16,49,73,79,48,77,60,61,44,24,51,33,12,10,31,56,4},new int[]{36,10,67,22,85,38,46,67,29,51,60,59,5,3,64,94,47,40,8,56,77,54,84,77,6,74,53,26,70,26,28,76,53,61},new int[]{40,68,88,15,88,13,67,91,45,79,26,56,23,39,97,21,14,13,32,12,63,52,74,22,47,25,93,71,35,93,80,72,51,59},new int[]{73,20,19,16,62,29,98,92,34,81,4,55,52,98,30,59,64,38,30,95,43,96,56,98,82,6,3,40,78,38,17,51,27,37},new int[]{26,78,60,88,21,65,62,42,96,63,75,58,81,62,67,29,19,97,5,66,9,41,25,84,75,12,65,88,81,16,55,38,43,8},new int[]{53,61,88,70,46,9,67,23,31,34,35,48,81,21,67,38,53,35,98,14,80,58,68,73,38,15,54,65,10,11,95,36,98,57}});
    param0.add(new int[][]{new int[]{37,18,39,36},new int[]{40,7,76,19},new int[]{37,8,74,36},new int[]{71,92,41,43}});
    param0.add(new int[][]{new int[]{65,54,93,86,22,47,45,88,25,20,30,51,71,3,70,80,77,7,29,55,75,2,88,26,45,54,38,9,70,54,47,94,78,48,78,78,24},new int[]{82,2,96,90,31,21,93,78,64,49,47,1,34,32,63,63,52,39,76,48,3,14,86,26,35,87,4,45,26,53,64,26,90,94,29,96,61},new int[]{14,93,53,59,69,30,22,96,81,94,6,5,41,86,47,23,77,53,40,61,80,14,22,68,81,3,67,73,38,7,13,96,55,2,37,77,93},new int[]{77,50,20,49,11,50,41,73,4,43,79,31,2,12,85,30,44,87,75,36,25,71,50,72,22,36,3,78,27,90,7,37,55,44,72,60,59},new int[]{52,4,2,17,85,84,30,48,2,79,66,27,21,89,93,5,65,25,25,48,11,97,19,18,7,87,4,21,41,77,91,6,77,63,18,27,87},new int[]{46,46,95,85,89,45,43,80,50,80,21,33,92,30,1,69,33,75,72,95,85,89,18,12,12,99,64,29,78,77,19,84,2,12,44,74,36},new int[]{17,7,18,13,77,60,12,79,48,51,67,60,10,23,4,25,65,61,69,69,47,27,62,71,49,61,88,87,72,30,31,16,92,65,11,62,38},new int[]{87,96,96,93,95,59,19,9,96,95,69,23,55,85,20,13,57,20,47,77,7,34,56,53,53,81,63,30,68,4,37,39,36,15,86,75,36},new int[]{96,19,16,74,81,43,6,97,84,14,28,6,19,6,5,66,48,70,14,78,94,45,40,88,30,75,78,22,3,29,48,8,49,7,24,5,84},new int[]{64,5,49,70,92,15,59,90,21,85,9,47,41,56,74,48,62,89,85,98,31,66,16,35,49,31,76,54,23,17,14,97,48,48,6,23,48},new int[]{49,61,31,5,67,38,28,31,58,54,17,22,64,13,44,85,47,85,6,10,58,40,14,23,71,88,15,87,5,41,20,52,10,87,27,51,60},new int[]{95,6,77,28,16,17,46,95,10,31,59,39,6,84,49,21,16,25,39,36,34,72,14,57,49,87,76,84,60,88,77,33,34,32,55,29,27},new int[]{77,86,71,71,93,14,2,7,81,33,22,14,54,1,72,41,8,29,81,91,45,8,6,51,94,23,79,60,41,14,27,67,12,67,40,65,17},new int[]{18,10,59,12,17,22,14,41,8,17,79,6,71,50,96,43,9,84,42,45,39,66,64,82,61,38,66,79,11,3,9,43,87,63,10,88,32},new int[]{68,7,93,45,46,60,29,64,73,46,2,3,92,84,42,68,62,30,31,41,22,73,9,31,16,35,22,52,59,95,13,92,51,39,59,39,71},new int[]{89,48,65,50,46,35,63,75,98,82,31,60,16,51,94,55,37,25,28,24,98,21,11,53,91,73,16,11,14,43,79,86,42,86,89,86,67},new int[]{30,65,45,3,47,81,97,77,61,56,8,32,57,26,70,76,8,93,20,13,45,8,18,26,84,33,8,76,66,16,43,11,81,94,44,8,87},new int[]{74,70,65,75,87,67,78,77,20,99,49,15,5,53,41,85,49,75,71,76,68,23,26,48,60,66,16,98,75,87,51,23,51,55,94,45,84},new int[]{80,11,46,95,88,58,26,66,57,79,45,22,26,49,68,6,22,38,23,64,89,67,20,33,20,70,76,44,83,25,49,82,15,27,88,21,79},new int[]{26,10,67,93,38,55,69,88,69,32,90,48,27,76,32,36,55,70,13,50,95,18,29,10,39,3,82,48,93,42,47,26,32,27,75,70,95},new int[]{8,88,18,73,22,63,50,74,1,3,90,56,7,27,15,87,85,77,32,49,84,69,32,53,28,92,76,70,90,81,36,62,10,90,80,96,80},new int[]{14,25,65,39,43,80,97,86,92,50,23,2,15,44,44,63,37,5,32,87,23,97,70,48,33,20,2,84,87,90,54,26,2,66,97,74,28},new int[]{15,82,91,52,39,76,14,31,73,46,40,59,26,91,16,2,81,93,96,63,25,67,41,55,99,3,27,14,33,85,10,53,81,71,91,95,40},new int[]{98,24,10,49,28,33,47,13,44,93,27,75,74,29,78,85,40,89,7,79,72,86,77,39,25,28,51,80,71,49,57,70,15,99,2,12,78},new int[]{53,60,66,43,34,28,5,35,16,38,99,46,44,44,5,46,46,77,65,29,2,63,81,36,38,88,18,8,28,4,38,82,64,72,58,63,20},new int[]{60,35,81,37,75,63,35,52,18,57,20,59,68,26,13,21,88,95,55,42,83,97,99,23,70,44,26,65,76,51,74,90,27,37,40,27,65},new int[]{60,56,78,52,53,14,32,96,83,72,35,49,14,59,5,95,32,88,22,61,21,33,79,51,48,15,3,94,57,56,62,18,72,83,56,48,91},new int[]{5,90,14,41,60,50,63,65,32,91,18,18,41,75,70,51,93,36,5,34,15,9,97,81,11,42,63,41,61,30,13,75,7,58,42,64,45},new int[]{85,71,22,96,4,79,39,85,41,41,41,28,43,64,6,66,31,91,9,1,15,23,17,58,71,67,98,53,83,30,10,55,42,48,82,23,87},new int[]{4,99,73,75,65,10,95,14,92,36,88,28,59,4,78,69,96,17,98,37,62,90,31,92,28,93,53,36,26,86,99,28,61,22,50,35,82},new int[]{69,93,11,88,38,59,45,44,25,16,20,54,13,35,12,63,4,36,94,93,82,93,9,74,10,53,8,59,19,44,44,34,53,3,87,2,60},new int[]{46,15,99,7,61,35,35,69,49,83,95,2,34,13,64,35,98,78,35,26,44,7,39,85,79,13,84,98,90,4,98,84,19,31,83,43,64},new int[]{2,90,22,81,88,76,22,84,67,15,43,14,74,20,23,54,73,62,62,64,74,53,61,53,3,12,20,25,89,28,16,51,40,21,71,76,99},new int[]{82,82,11,32,97,47,45,97,79,18,86,6,59,86,6,15,94,61,30,46,96,84,17,93,75,84,84,8,50,17,57,58,76,96,86,27,58},new int[]{51,47,57,50,90,31,29,95,24,63,68,78,77,23,8,13,1,63,27,81,41,9,27,90,21,46,48,68,14,42,59,75,62,4,59,34,5},new int[]{32,80,92,66,35,8,57,25,23,36,25,17,63,64,90,37,85,5,24,74,66,90,73,48,30,39,63,96,57,72,61,3,4,89,49,91,16},new int[]{23,26,79,26,25,42,75,77,44,1,36,95,22,5,19,95,87,61,86,57,95,21,67,53,60,61,75,12,42,89,48,85,71,95,75,65,78}});
    param0.add(new int[][]{new int[]{69,40,56,69,66,38,70,81,5,78,60,47,92,76,97,40,24,18,75,89,83,68,62,7,82,15,79,66,36,59,71,29,25,55,21,49,12,8,85,41,24,36,2},new int[]{29,13,89,7,40,59,58,11,29,17,13,9,94,42,9,21,78,27,55,35,91,40,89,12,72,29,5,60,19,35,46,46,45,39,41,89,18,59,87,30,65,90,84},new int[]{41,85,55,59,45,84,67,17,91,82,74,20,23,64,8,65,60,7,4,28,19,6,26,40,19,81,93,21,5,17,38,62,40,7,27,31,98,62,26,70,31,12,15},new int[]{58,1,62,59,90,37,6,24,47,64,36,83,56,82,80,17,11,4,80,9,87,74,90,39,67,84,81,47,28,1,36,89,97,50,85,94,77,39,50,23,53,6,83},new int[]{10,16,77,22,66,42,90,5,94,37,86,51,82,93,19,4,72,27,55,93,97,7,61,99,68,26,59,77,75,39,34,25,85,36,66,89,96,65,97,6,13,17,80},new int[]{38,86,43,41,71,2,1,19,16,34,93,72,90,11,74,68,51,98,49,23,2,97,32,54,20,77,67,93,18,70,14,68,90,76,61,38,58,92,41,6,4,72,44},new int[]{95,96,4,28,7,9,67,53,97,20,19,16,3,6,93,54,98,78,26,34,9,55,33,60,19,73,39,6,23,57,9,90,10,70,14,17,68,78,24,13,59,65,38},new int[]{97,17,14,81,46,16,71,47,76,23,6,38,30,22,1,67,40,1,97,48,39,44,49,61,75,54,96,19,21,75,86,19,28,96,90,19,15,5,12,23,49,81,11},new int[]{95,41,58,72,40,22,96,10,39,51,45,70,99,75,18,97,41,77,69,53,64,46,25,68,47,29,24,85,58,75,27,48,41,74,11,43,73,3,49,49,44,6,48},new int[]{89,71,27,50,86,83,94,86,23,76,66,29,93,14,73,90,29,5,86,59,93,77,18,71,77,61,48,85,92,44,38,3,28,54,45,86,43,33,13,41,57,5,8},new int[]{66,44,43,81,4,19,34,62,81,89,5,81,11,58,16,80,70,82,3,18,7,75,47,15,62,78,23,36,17,22,24,27,17,23,71,1,50,63,50,91,98,37,15},new int[]{56,82,56,68,29,87,43,86,20,86,12,99,90,14,61,84,76,61,9,97,88,73,24,94,69,8,79,45,53,20,58,79,86,96,70,33,61,11,92,3,49,57,67},new int[]{29,11,55,96,50,15,4,32,52,62,98,74,94,41,82,17,5,72,69,81,39,91,32,7,86,76,50,88,49,43,17,71,81,20,91,45,74,70,48,32,8,44,62},new int[]{83,83,22,35,28,33,6,12,97,50,98,61,50,76,37,67,61,92,11,80,54,67,86,58,49,79,99,84,43,68,93,84,29,14,1,18,81,15,89,13,97,24,34},new int[]{11,62,47,25,32,65,29,41,75,22,76,1,16,16,3,94,3,99,52,31,35,50,76,94,89,23,81,65,81,59,35,63,18,10,47,33,6,21,47,30,90,71,21},new int[]{45,97,50,3,76,33,88,71,58,72,47,37,54,35,63,7,4,34,39,86,33,75,9,15,92,30,44,23,68,78,83,88,57,45,71,18,45,49,15,47,5,62,84},new int[]{7,74,65,98,87,94,40,83,57,33,98,80,34,30,24,96,36,16,83,58,3,81,31,3,12,38,46,94,62,70,77,53,34,5,86,73,33,27,12,18,47,42,73},new int[]{89,30,37,42,16,27,23,70,95,78,27,17,6,78,83,10,45,56,31,91,40,3,47,92,24,11,75,31,47,78,43,11,56,6,1,76,2,36,73,80,41,98,65},new int[]{33,66,93,73,8,92,3,44,11,1,48,70,42,77,45,91,87,34,32,61,93,6,78,78,97,88,62,35,11,14,45,26,90,40,34,79,92,95,66,22,41,59,99},new int[]{82,32,35,70,4,94,76,8,53,85,31,22,14,73,33,16,18,16,30,12,14,94,85,6,24,13,52,92,81,74,77,97,71,69,97,98,14,85,82,78,91,39,48},new int[]{26,28,65,13,99,86,45,3,50,85,1,99,52,38,10,88,63,52,8,58,49,4,34,32,25,31,10,35,40,77,60,78,68,3,67,3,64,48,53,8,47,61,27},new int[]{73,70,20,10,28,68,52,2,38,1,43,58,64,3,69,8,16,76,84,14,92,33,43,42,46,47,88,2,70,33,69,59,44,88,28,48,64,97,58,18,89,37,29},new int[]{52,61,77,53,80,77,20,67,43,58,14,12,33,81,82,12,45,26,28,77,12,57,4,84,57,10,49,45,47,74,28,12,22,64,85,45,15,80,64,66,50,79,79},new int[]{87,82,93,43,33,93,37,17,26,43,58,9,21,65,63,73,27,78,36,59,95,46,99,30,82,17,81,52,47,92,88,37,99,92,14,36,35,58,50,6,62,62,38},new int[]{85,92,9,13,80,23,96,33,54,45,48,85,68,61,99,52,46,44,75,49,37,41,22,42,58,52,53,49,13,62,36,52,41,37,19,58,24,63,55,4,25,61,31},new int[]{21,94,5,68,96,5,16,91,12,65,66,72,43,98,25,98,46,1,78,32,61,29,48,83,94,23,69,87,99,53,71,95,78,91,87,26,71,21,88,81,60,55,73},new int[]{79,68,88,95,12,8,17,43,9,17,16,51,35,52,77,12,94,67,69,13,13,28,47,44,63,69,20,92,36,45,82,57,87,91,2,42,50,31,82,48,87,80,26},new int[]{25,35,86,73,34,45,23,91,74,16,4,54,95,68,53,14,80,83,3,42,67,50,20,55,66,84,53,26,19,63,33,98,28,48,53,56,49,78,63,14,29,53,26},new int[]{33,69,66,73,19,91,59,91,90,78,3,58,21,46,40,72,70,66,57,6,59,39,75,69,74,52,38,71,82,74,57,7,36,95,50,72,40,74,40,51,92,90,20},new int[]{2,87,23,81,41,57,21,39,26,95,72,51,71,21,58,50,23,77,42,42,92,40,27,96,20,62,13,42,66,43,83,49,79,91,12,40,74,92,68,4,92,42,93},new int[]{12,22,68,89,72,93,71,8,18,90,60,73,61,31,6,79,18,54,40,51,74,72,89,98,36,6,23,48,20,61,87,55,87,36,45,86,87,42,73,29,21,62,37},new int[]{37,30,67,33,61,48,43,80,28,20,43,74,28,8,88,65,17,60,20,13,13,31,22,15,79,98,47,36,96,13,84,25,53,86,67,41,29,41,68,82,54,40,21},new int[]{95,98,17,90,89,4,60,92,38,66,52,67,29,28,60,91,7,21,38,78,44,87,52,99,94,93,73,51,23,69,14,15,15,35,11,93,37,72,21,15,45,76,97},new int[]{8,24,32,71,25,46,81,95,10,50,56,72,1,9,48,26,10,90,58,45,18,59,57,67,28,81,15,35,42,25,13,66,99,57,61,86,82,85,11,57,43,47,42},new int[]{4,62,25,34,56,69,41,33,44,71,92,84,74,30,67,28,95,40,31,66,95,18,10,32,72,85,85,43,46,85,95,27,93,78,9,11,71,5,72,59,67,33,83},new int[]{47,32,41,9,11,35,12,12,98,50,51,36,98,30,41,3,98,49,55,32,79,8,51,49,73,90,63,22,38,94,33,14,69,10,44,25,84,52,75,51,51,34,16},new int[]{68,57,53,52,28,74,88,48,73,6,37,10,61,95,41,52,34,9,29,41,1,64,12,23,1,95,25,38,4,43,90,61,32,28,33,27,1,8,85,23,32,3,44},new int[]{54,6,70,49,59,57,89,61,56,41,14,83,77,37,41,30,92,42,36,56,71,83,78,26,84,14,39,96,60,94,28,44,45,18,30,70,70,3,7,34,82,65,27},new int[]{54,79,43,24,91,62,93,84,40,30,44,82,83,15,49,87,43,6,50,46,40,30,74,30,1,29,89,95,15,17,8,74,46,57,79,28,90,84,77,31,51,78,29},new int[]{78,14,84,41,35,5,64,79,56,77,1,7,12,96,21,76,36,33,4,51,49,73,39,71,18,59,23,20,31,89,67,53,54,62,20,25,94,51,21,48,99,54,99},new int[]{94,16,87,60,75,12,99,69,56,44,38,22,81,21,91,13,94,46,59,79,18,43,55,75,71,98,32,77,16,90,40,41,54,34,85,18,20,76,85,96,9,47,61},new int[]{11,11,28,81,97,98,24,21,35,37,11,32,26,18,76,20,34,91,54,98,65,79,14,43,27,67,2,76,63,51,98,93,87,49,73,15,1,37,10,21,35,50,34},new int[]{75,48,54,68,74,10,31,11,4,87,75,5,22,39,41,11,58,11,48,72,53,57,40,98,49,62,61,52,28,66,77,42,78,69,35,98,9,7,57,36,35,14,74}});
    param0.add(new int[][]{new int[]{74,32,24,39,84,34,39,40,15,49,60,14,15,12,18,15,6},new int[]{61,8,50,18,95,67,24,95,91,88,40,24,56,45,12,39,91},new int[]{29,1,1,37,12,68,71,48,40,15,26,55,25,95,42,25,25},new int[]{25,17,75,21,58,16,97,7,75,5,98,79,25,8,1,62,33},new int[]{78,47,60,43,5,90,22,63,2,99,3,1,98,11,99,69,93},new int[]{17,1,33,46,30,77,52,9,72,75,3,48,26,84,53,12,66},new int[]{83,65,93,23,6,43,98,83,96,83,59,94,97,61,42,65,24},new int[]{35,25,15,27,15,16,62,56,22,87,65,17,59,11,2,93,58},new int[]{70,12,55,3,77,66,92,66,1,80,65,31,96,18,46,26,24},new int[]{41,30,8,68,46,60,46,89,90,74,1,95,62,46,19,3,86},new int[]{58,90,79,63,77,10,54,18,69,59,44,96,49,56,20,24,79},new int[]{40,58,23,41,59,14,43,11,86,99,31,17,82,53,46,78,25},new int[]{25,55,22,90,42,12,55,43,96,38,5,54,17,85,17,32,62},new int[]{34,59,69,90,4,84,95,72,70,81,89,4,14,81,60,79,89},new int[]{51,13,99,74,30,82,67,18,21,89,44,57,56,47,7,95,99},new int[]{69,73,65,19,41,96,66,82,17,58,99,68,47,65,14,77,16},new int[]{33,99,5,56,37,12,73,65,37,82,65,47,7,23,17,42,62}});
    param0.add(new int[][]{new int[]{49,31,43,10,49,12,37,33,44,33,45,47,72,76,53,27,59,99,91,75,50,74,20,97,56,18,80,65,79,54,5,15,62,86,38,45,89,61,52,97,60,24,63,60},new int[]{10,46,68,6,73,44,78,92,82,31,35,35,19,33,95,89,59,47,71,68,2,89,25,34,53,25,22,37,1,32,79,48,78,7,67,66,57,36,93,74,13,83,44,82},new int[]{62,68,47,30,73,35,51,53,10,43,1,2,5,32,95,39,28,71,51,2,75,48,83,27,48,64,87,95,70,49,9,33,23,93,94,70,60,17,2,39,14,80,37,88},new int[]{68,29,90,19,18,92,92,31,12,85,32,68,23,58,13,17,95,22,73,6,73,66,59,62,8,48,9,99,21,38,76,41,3,24,28,61,55,42,73,4,91,3,75,73},new int[]{62,47,94,35,62,61,97,15,94,75,52,64,56,31,2,71,61,57,9,90,52,10,31,15,17,27,54,61,14,92,72,50,92,30,41,93,12,99,83,54,46,69,76,70},new int[]{5,88,18,25,58,56,28,49,88,87,65,78,83,38,97,70,34,23,91,14,86,38,78,86,45,61,9,75,76,89,2,9,50,45,35,96,62,78,93,57,83,46,69,81},new int[]{98,86,75,30,50,93,15,36,39,81,60,27,54,2,70,4,87,47,95,48,57,65,58,51,47,77,70,34,37,80,55,96,44,79,68,43,76,10,66,88,16,35,40,81},new int[]{72,93,62,34,42,95,81,4,63,23,11,23,61,69,52,61,96,5,17,87,34,94,91,97,16,95,4,52,20,48,96,98,51,45,80,93,49,93,56,3,42,71,42,85},new int[]{99,29,95,17,85,28,60,87,95,92,47,11,65,60,88,61,77,43,39,91,1,9,85,74,9,3,29,86,42,43,94,24,3,8,45,26,99,51,95,55,33,35,80,11},new int[]{49,79,25,78,73,10,87,45,6,28,13,77,64,30,5,71,55,90,87,52,28,24,97,77,49,98,77,95,93,95,48,31,24,94,71,20,2,82,76,58,54,85,39,19},new int[]{70,73,4,20,3,73,91,62,69,68,19,16,22,80,21,56,60,34,69,80,66,13,96,78,21,60,68,74,46,16,55,11,33,86,50,52,75,92,62,98,41,11,7,79},new int[]{84,16,29,5,85,64,15,6,49,87,51,42,93,65,5,73,79,97,24,37,53,6,39,75,89,62,82,86,60,41,78,10,81,93,70,7,5,27,35,55,17,7,61,65},new int[]{15,58,49,75,52,26,43,53,56,78,77,68,33,14,77,17,39,48,6,22,87,37,43,45,99,96,65,4,68,97,57,34,30,39,79,96,90,39,72,90,17,94,99,12},new int[]{6,29,14,1,91,39,6,97,44,41,95,32,97,84,5,47,17,33,42,23,70,50,29,64,4,7,79,62,59,21,16,70,13,8,97,61,3,46,62,23,8,20,30,75},new int[]{54,20,2,98,17,15,65,69,98,69,72,68,43,12,94,83,22,92,94,70,20,15,8,37,28,11,70,27,42,75,83,76,81,8,59,60,95,62,19,43,60,51,84,64},new int[]{66,70,91,48,18,20,73,67,40,18,12,83,26,97,33,6,58,57,9,10,44,53,27,81,52,84,64,54,13,31,81,49,75,27,13,46,51,43,79,86,89,19,29,87},new int[]{83,67,19,13,97,88,38,35,33,45,57,49,66,83,39,47,33,91,50,66,33,49,71,10,28,89,95,44,13,95,29,40,9,95,29,4,81,81,19,48,67,97,42,82},new int[]{85,58,88,59,16,95,60,67,17,64,33,71,22,7,97,5,13,94,10,14,71,31,4,48,63,4,78,79,57,35,98,14,77,24,23,53,80,99,27,98,85,8,33,92},new int[]{91,17,58,62,78,30,46,17,67,57,6,56,89,70,50,67,35,19,75,15,37,96,31,55,86,71,1,96,54,85,34,72,27,43,87,16,78,25,69,3,68,75,72,59},new int[]{97,61,86,15,61,12,63,24,71,24,78,62,13,10,65,5,98,47,8,51,78,37,81,43,86,57,44,65,49,39,76,30,93,80,66,51,79,46,8,6,59,5,78,68},new int[]{3,32,88,62,88,30,49,12,89,50,82,18,93,47,63,44,21,48,66,32,94,45,51,53,28,89,62,29,61,8,46,31,66,62,18,55,85,37,86,30,83,21,78,13},new int[]{99,19,4,21,24,45,13,22,87,49,48,17,20,32,50,62,15,42,11,37,68,38,81,61,61,93,15,28,87,67,21,29,61,16,43,24,96,31,98,85,13,25,6,86},new int[]{79,43,82,95,51,75,89,41,89,82,35,44,14,56,84,58,43,59,55,37,34,46,48,90,40,20,42,72,64,23,51,99,12,51,3,7,37,20,88,58,89,19,27,77},new int[]{86,36,60,23,84,30,83,91,39,66,34,9,85,84,72,50,85,80,1,2,69,35,74,45,10,63,26,79,3,79,46,39,80,50,60,87,19,10,4,97,39,77,75,43},new int[]{72,93,98,37,85,18,29,94,46,50,17,23,6,91,35,37,89,49,3,40,60,35,40,59,4,41,55,5,65,31,60,43,9,91,58,16,70,88,89,34,35,85,96,77},new int[]{38,50,94,12,97,30,44,87,89,94,96,94,92,2,74,9,71,12,34,79,49,51,12,6,26,69,49,51,74,85,92,41,11,47,14,16,44,58,21,14,76,26,73,3},new int[]{88,49,41,19,12,55,2,28,42,65,29,3,87,8,78,28,42,85,3,60,51,78,19,4,87,7,41,16,65,53,55,20,90,4,37,82,81,22,44,98,61,72,46,26},new int[]{3,89,55,37,47,48,36,15,7,31,61,46,15,13,22,50,52,56,44,87,67,20,83,46,48,30,42,96,41,30,24,12,44,53,17,73,79,25,12,78,84,46,49,45},new int[]{37,27,30,25,92,81,26,71,47,39,84,8,28,15,81,91,26,53,15,55,13,20,81,89,85,8,17,34,48,10,95,78,75,75,29,16,19,86,24,43,56,39,9,93},new int[]{48,33,42,91,92,34,45,36,32,82,26,80,96,33,88,43,6,52,60,78,84,90,78,59,44,24,71,67,40,90,20,25,94,32,71,52,85,21,49,23,64,12,68,83},new int[]{5,65,95,64,43,48,2,66,75,73,67,33,23,82,62,74,59,95,80,27,68,43,54,65,46,12,55,58,9,93,46,37,65,83,77,64,73,22,25,9,35,53,46,46},new int[]{63,57,73,7,81,76,73,6,88,19,55,64,81,78,65,56,82,94,88,80,18,11,64,34,38,66,36,27,8,80,79,1,90,95,67,65,4,10,97,71,79,73,69,33},new int[]{42,29,63,25,19,81,29,85,79,90,3,30,81,6,77,71,41,80,5,81,65,73,50,77,92,21,71,69,56,72,23,33,65,94,24,87,21,77,98,41,87,85,22,46},new int[]{29,53,23,22,98,8,88,44,9,31,11,49,95,52,54,67,25,77,80,44,22,13,19,58,61,92,21,26,41,42,51,81,61,7,90,57,58,24,17,58,64,14,4,80},new int[]{20,33,49,18,28,82,53,12,84,69,58,36,63,64,11,41,32,1,22,22,54,77,47,69,31,80,30,90,83,9,54,83,69,10,97,89,8,56,26,32,87,12,38,32},new int[]{96,26,2,94,39,99,5,84,60,81,23,97,60,40,76,57,59,28,5,86,2,41,66,33,69,88,83,38,29,72,50,68,71,89,58,2,7,72,63,47,29,61,85,85},new int[]{89,31,91,33,39,14,34,31,48,70,26,93,52,32,5,52,61,19,73,17,38,65,77,21,14,83,53,14,72,63,25,18,77,88,56,9,90,23,98,13,39,14,61,93},new int[]{91,86,41,21,62,43,25,29,22,77,92,13,86,46,91,94,58,28,41,41,20,99,51,8,50,32,43,61,85,86,88,85,44,36,68,11,8,4,74,12,97,37,65,81},new int[]{14,98,40,91,24,82,63,16,51,16,58,35,68,98,33,87,74,57,75,68,92,12,17,69,96,2,77,85,13,32,41,20,59,1,47,47,87,77,5,99,4,93,66,48},new int[]{54,3,22,78,77,2,55,73,16,12,56,50,66,97,85,79,78,11,18,51,89,72,66,84,57,26,74,72,94,6,98,56,47,80,19,3,13,82,41,41,7,22,31,83},new int[]{19,47,15,72,93,56,50,17,34,42,85,29,72,6,68,24,20,83,81,52,88,91,23,78,54,75,87,8,12,45,57,65,68,4,62,77,31,54,31,32,40,4,7,56},new int[]{57,46,49,50,49,80,43,65,6,86,30,72,67,54,74,25,42,72,61,38,36,41,47,87,31,2,68,34,8,56,96,11,87,70,74,68,67,12,61,1,78,92,11,30},new int[]{2,6,24,78,36,2,67,26,29,87,50,7,60,68,79,23,22,71,50,82,89,48,15,6,59,76,80,26,39,72,27,91,65,43,41,61,32,3,94,61,17,9,57,48},new int[]{7,32,93,58,82,5,98,39,15,70,32,53,59,3,25,57,51,17,47,11,35,6,25,17,55,30,10,28,67,55,82,80,26,83,81,41,61,57,45,28,20,38,94,13}});
    List<Integer> param1 = new ArrayList<>();
    param1.add(3);
    param1.add(10);
    param1.add(24);
    param1.add(30);
    param1.add(22);
    param1.add(3);
    param1.add(32);
    param1.add(39);
    param1.add(14);
    param1.add(34);
    List<Integer> param2 = new ArrayList<>();
    param2.add(3);
    param2.add(13);
    param2.add(29);
    param2.add(28);
    param2.add(33);
    param2.add(3);
    param2.add(21);
    param2.add(39);
    param2.add(13);
    param2.add(26);
    for(int i = 0; i < param0.size(); ++i)
    {
        if(f_filled(param0.get(i),param1.get(i),param2.get(i)) == f_gold(param0.get(i),param1.get(i),param2.get(i)))
        {
            n_success+=1;
        }
    }
    System.out.println("#Results:" + n_success + ", " + param0.size());
}
}