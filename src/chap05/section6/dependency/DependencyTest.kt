package chap05.section6.dependency

class Patient(val name: String, var id: Int) {
    fun doctorList(d: Doctor) {
        println("Patient: $name, Doctor: ${d.name}")
    }
}

class Doctor(val name: String, val p: Patient) {
    val customerID: Int = p.id

    fun patientList() {
        println("Doctor: $name, Patient: ${p.name}")
        println("Patient ID: $customerID")
    }
}

fun main() {
    val patient1 = Patient("Hong Kildong", 1234)
    val doctor1 = Doctor("Kim Sabu", patient1)
    doctor1.patientList()
}