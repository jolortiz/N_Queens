# N_Queens
Written by: Jonathan Ortiz

A simple java program that solves the n queens problem 
explained here: https://en.wikipedia.org/wiki/Eight_queens_puzzle

This program reads an integer n from the command line indicating the size of the Queens problem to
solve. The program will operate in two modes: normal and verbose, indicated by the command line
option "-v". In normal mode, the program prints only the number of solutions to n-Queens. In verbose
mode, all permutations representing solutions to n-Queens will be printed in lexicographic order, followed
by the number of such solutions. Thus to find the number of solutions to 8-Queens you will type:

% Queens 8

To print all 92 unique solutions to 8-Queens type:

% Queens –v 8
