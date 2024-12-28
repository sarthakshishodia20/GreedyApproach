class Solution {
    // Dono ko sort kia
    // Greedy Approach ka use kia ek pointer traiers pr ek pointer players pr agr trainer ki capacitiy player required se jyada ya equal hai tbhi players ka pointer move hoga vrna toh trainer ka move krte jao in the end the count of players required trainer is the index of its pointer that is l pointer;;; Striver Sheet Explaination
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        int l=0;
        int r=0;
        while(l<players.length && r<trainers.length){
            if(trainers[r]>=players[l]){
                l++;
            }
            r++;
        }
        return l;
    }
}
