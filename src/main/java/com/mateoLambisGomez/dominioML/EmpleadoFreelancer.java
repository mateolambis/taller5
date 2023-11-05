package com.mateoLambisGomez.dominioML;
    public class EmpleadoFreelancer extends Empleado {
        private double valorPorHoraMateo;
        private int horasTrabajadasMateo;

        public EmpleadoFreelancer(String nombreMateo, double valorPorHoraMateo) {
            super(nombreMateo);
            this.valorPorHoraMateo = valorPorHoraMateo;
        }

        @Override
        public Long calcularNominaLambis() {
            return (long) (valorPorHoraMateo * horasTrabajadasMateo);
        }


        public double getValorPorHoraMateo() {
            return valorPorHoraMateo;
        }

        public int getHorasTrabajadasMateo() {
            return horasTrabajadasMateo;
        }

        public void setHorasTrabajadasMateo(int horasTrabajadasMateo) {
            this.horasTrabajadasMateo = horasTrabajadasMateo;
        }


    }

