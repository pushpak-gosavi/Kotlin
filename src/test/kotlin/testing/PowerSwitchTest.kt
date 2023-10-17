package testing

import kotlin.test.*

class PowerSwitchTest {
    val powerSwitch = PowerSwitch()

    @Test
    fun `testing, initial state of Power switch`() {
        assertEquals(
            expected = State.Off,
            actual = powerSwitch.state,
            message = "Test is fail, initial value is on"
        )
    }

    @Test
    fun `testing, the trigger fun is on after the off`() {
        assertEquals(
            expected = State.Off,
            actual = powerSwitch.state,
            message = "Test is fail, initial value is on"
        )
        powerSwitch.trigger()
        assertEquals(
            expected = State.On,
            actual = powerSwitch.state,
            message = "Test is fail, after triger also switch is off"
        )
    }

    @Test
    fun `testing, the trigger fun is called the switch on again trigger fun call switch is off`() {
        assertEquals(
            expected = State.Off,
            actual = powerSwitch.state,
            message = "Test is fail, initially powerswicth is on"
        )
        powerSwitch.trigger()
        powerSwitch.trigger()
        assertEquals(
            expected = State.Off,
            actual = powerSwitch.state,
            message = "Test is fail, function not working"
        )
    }
}