#include <stdio.h>
#include <conio.h>
#include <string.h>

int main(){
    int n;
    scanf("%d",&n);
    int arr[n];
    for(int i = 0; i < n; i++){
        scanf("%d",&arr[i]);
    }
    int larr = sizeof(arr)/sizeof(arr[0]);
    char sen[100];
    fgets(stdin,sizeof(sen), stdin);
    return 0;
}