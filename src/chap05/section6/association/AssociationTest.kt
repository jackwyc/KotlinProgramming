package chap05.section6.association

class Patient(val name: String) {
    fun doctorList(d: Doctor) {
        println("Patient: $name, Doctor: ${d.name}")
    }
}

class Doctor(val name: String) {
    fun patientList(p: Patient) {
        println("Doctor: $name, Patient: ${p.name}")
    }
}

fun main() {
    val doctor1 = Doctor("Kim Sabu")
    val patient1 = Patient("Hong Kildong")
    doctor1.patientList(patient1)
    patient1.doctorList(doctor1)
}