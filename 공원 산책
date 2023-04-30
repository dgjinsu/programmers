class Solution {
    public int[] solution(String[] park, String[] routes) {
        
        char[][] arr = new char[park.length][park[0].length()];
        int startX = 0;
        int startY = 0;
        for(int i = 0; i<park.length; i++) {
            for(int j = 0; j<park[i].length(); j++) {
                arr[i][j] = park[i].charAt(j);
                if(arr[i][j] == 'S') {
                    startX = i;
                    startY = j;
                }
            }
        }
        
        
        for(int i =0; i<routes.length; i++) {
            char location = routes[i].charAt(0);
            int move = routes[i].charAt(2) - '0';

            if(location == 'N') {
                if(startX - move < 0) continue;
                else {
                    int check = 0;
                    for(int j = 1; j<=move; j++) {
                        if(arr[startX-j][startY] == 'X') {
                            check = 1;
                            break;
                        }
                    }
                    if(check == 1) continue;
                    else {
                        startX -= move;
                    }
                    System.out.println("N " + startX + " " + startY);
                }
            }
            else if(location == 'S') {
                if(startX + move > park.length-1) continue;
                else {
                    int check = 0;
                    for(int j = 1; j<=move; j++) {
                        if(arr[startX+j][startY] == 'X') {
                            check = 1;
                            break;
                        }
                    }
                    if(check == 1) continue;
                    else {
                        startX += move;
                    }
                    System.out.println("S " + startX + " " + startY);
                }
            }
            else if(location == 'W') {
                if(startY - move < 0) continue;
                else {
                    int check = 0;
                    for(int j = 1; j<=move; j++) {
                        if(arr[startX][startY-j] == 'X') {
                            check = 1;
                            break;
                        }
                    }
                    if(check == 1) continue;
                    else {
                        startY -= move;
                    }
                    System.out.println("W " + startX + " " + startY);
                }
                
            }
            else if(location == 'E') {
                System.out.println(startX);
                System.out.println(move);
                if(startY + move > park[0].length()-1) continue;
                else {
                    int check = 0;
                    for(int j = 1; j<=move; j++) {
                        if(arr[startX][startY+j] == 'X') {
                            check = 1;
                            break;
                        }
                    }
                    if(check == 1) continue;
                    else {
                        startY += move;
                    }
                    System.out.println("E " + startX + " " + startY);
                }
            }
            
            
        }
        
        int[] answer = {startX, startY};
        return answer;
    }
}
