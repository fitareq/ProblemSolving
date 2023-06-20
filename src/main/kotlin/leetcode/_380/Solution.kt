package leetcode._380

import kotlin.random.Random

class RandomizedSet() {
    private val hashSet = HashSet<Int>()
    private val list = ArrayList<Int>()
    private val rand = Random(System.currentTimeMillis())
    fun insert(`val`: Int): Boolean {
        val contains = hashSet.contains(`val`)
        list.contains(`val`)
        if (!contains)
        {
            hashSet.add(`val`)
            list.add(`val`)
        }
        return !contains
    }

    fun remove(`val`: Int): Boolean {
        val contains = hashSet.contains(`val`)
        if (contains)
        {
            hashSet.remove(`val`)
            list.remove(`val`)
        }
        return contains
    }

    fun getRandom(): Int {
        val randomValue = rand.nextInt(list.size)
        return list[randomValue]
    }

}

class RandomizedSet2() {
    private val list = ArrayList<Int>()
    private val rand = Random(System.currentTimeMillis())
    fun insert(`val`: Int): Boolean {
        val contains = list.contains(`val`)
        if (!contains)
        {
            list.add(`val`)
        }
        return !contains
    }

    fun remove(`val`: Int): Boolean {
        val contains = list.contains(`val`)
        if (contains)
        {
            list.remove(`val`)
        }
        return contains
    }

    fun getRandom(): Int {
        val randomValue = rand.nextInt(list.size)
        return list[randomValue]
    }

}

fun main() {
}