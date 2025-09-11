package aulas.aula1;

public class Pessoa {

    private float peso;
    private float altura;
    private String sexo;

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        if (!(sexo.equals("Masculino") || sexo.equals("Feminino"))){
            throw new IllegalArgumentException("Sexo Inválido");
        }
        this.sexo = sexo;
    }

    public float calcularImc() {
        return peso / (this.altura * this.altura);
    }

    public String verificarImc() {
        float imc;
        imc = this.calcularImc();
        if (this.sexo.equals("Masculino")) {
            if (imc < 20.7) {
                return "Abaixo do peso";
            } else {
                if (imc <= 26.4) {
                    return "No peso normal";
                } else {
                    if (imc < 27.8) {
                        return "Marginalmente acima do peso";
                    } else {
                        if (imc <= 31.1) {
                            return "Acima do peso ideal";
                        } else {
                            return "Obeso";
                        }
                    }
                }
            }
        } else {
            if (imc < 19.1) {
                return "Abaixo do peso";
            } else {
                if (imc <= 25.8) {
                    return "No peso normal";
                } else {
                    if (imc < 27.3) {
                        return "Marginalmente acima do peso";
                    } else {
                        if (imc <= 32.3) {
                            return "Acima do peso ideal";
                        } else {
                            return "Obeso";
                        }
                    }
                }
            }
        }
    }
}

