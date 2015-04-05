package m02;
//���j�d��,�N�O���g�c��
public class m02 {

	public static void main(String[] args) {
		int[][] maze = { { 2, 0, 2, 2, 2, 2, 2 }, { 2, 0, 2, 2, 0, 2, 2 },
				{ 2, 0, 0, 0, 0, 0, 2 }, { 2, 2, 2, 0, 2, 0, 2 },
				{ 2, 2, 0, 0, 0, 0, 2 }, { 2, 0, 0, 2, 2, 0, 2 },
				{ 2, 2, 2, 2, 2, 0, 2 } };
		//VISIT(maze);
		VISIT1(maze, 0, 1);

	}

	private static void VISIT1(int[][] maze, int i, int j) {
		maze[i][j] = 1;
		
		if (i == 6 && j == 5) {
			Point(maze);
		}
			// �p�G�J��0�N���k��
			if (maze[i][j + 1] == 0) {
				VISIT1(maze, i, j + 1);
			}
			// �p�G�J��0���U��
			if (maze[i + 1][j] == 0) {
				VISIT1(maze, i + 1, j);
			}
			// �p�G�J��0������
			if (maze[i][j - 1] == 0) {
				VISIT1(maze, i, j - 1);
			}
			// �p�G�J��0���W��
			if (maze[i - 1][j] == 0) {
				VISIT1(maze, i - 1, j);
			}
			//maze[i][j] = 0;
		}

	

	private static void Point(int[][] maze) {
		for(int[]row:maze ) {
			for(int rows: row) {
				if(rows == 2) {
					System.out.print("M");
				}else if(rows == 1) {
					System.out.print("o");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}

	public static void VISIT(int[][] maze) {
		for (int i = 0; i < maze.length; i++) {
			for (int j = 0; j < maze[0].length; j++) {
				System.out.print(maze[i][j] + "");

			}
			System.out.println();
		}

	}

}
