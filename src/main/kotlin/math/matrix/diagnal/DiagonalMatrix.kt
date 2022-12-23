package math.matrix.diagnal

class DiagonalMatrix {
    fun drawDiagonalMatrix(size: Int) {
        val elementsCount = size * size
        //In a square Diagonal matrix the difference between diagnal position is size + 1
        val diagonalEntryDiff = size + 1

        var nextDiagonalPos = 1

        for(i in 1..elementsCount) {
            if(i == nextDiagonalPos) {
                print(1)
                nextDiagonalPos += diagonalEntryDiff
            } else {
                print(0)
            }

            //goto next row
            if(i.isDivisibleOf(size)) {
                println()
            }
        }
    }

    private fun Int.isDivisibleOf(number: Int): Boolean = this % number == 0


    //solution by Najam
    fun drawDiagonalMatrixByNajam(size: Int) {
        for(i in 0 until size) {
            val singleRow = Array<String>(size){"0"}
            singleRow[i] = "1"
            println(singleRow.contentToString())
        }
    }
}