fun main(args: Array<String>) {
    var x = readlnOrNull()?.toInt()
    val sticks = arrayOf(64, 32, 16, 8, 4, 2, 1)
    var cnt = 0

    x?.let {
        for (i in 0..sticks.size) {
            if (x >= sticks[i]) {
                cnt += 1
                x -= sticks[i]
            }
            if (x == 0) {
                break
            }
        }
        println(cnt)
    }
}
// 지민이가 가지고 있는 막대의 길이를 모두 더한다. 처음에는 64cm 막대 하나만 가지고 있다. 이때, 합이 X보다 크다면, 아래와 같은 과정을 반복한다.
// 가지고 있는 막대 중 길이가 가장 짧은 것을 절반으로 자른다.
// 만약, 위에서 자른 막대의 절반 중 하나를 버리고 남아있는 막대의 길이의 합이 X보다 크거나 같다면, 위에서 자른 막대의 절반 중 하나를 버린다.
// 이제, 남아있는 모든 막대를 풀로 붙여서 Xcm를 만든다.
// 위와 같은 과정을 거치면 몇 개의 막대를 붙여서 Xcm를 만들 수 있는지 확인하는 문제이다.
// 여기서 핵심은 몇 개의 막대로 Xcm를 만들 수 있냐를 찾는 것이다. 그래서 먼저 막대를 나눴을 경우 막대의 길이가 될 수 있는 수를 배열로 만들었다.
// 다음 Xcm의 막대를 만들기 위해서는 지민이가 가지고 있는 막대의 길이가 X보다는 작아야 하기 때문에 막대의 길이가 될 수 있는 수를 배열을 반복문으로 돌면서 X보다 작은지 확인한다.
// X보다 작으면 붙여서 막대로 사용이 가능하기 때문에 막대 수를 추가하고, 붙인 길이만큼 X를 빼준다. 그리고 X가 0이 되면 조건을 만족한 것이므로 반복문에서 탈출하여 답을 출력한다.
