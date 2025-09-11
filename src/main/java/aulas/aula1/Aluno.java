package aulas.aula1;

public class Aluno {
    private float frequencia;
    private int p1;
    private int p2;
    private int provaFinal;

    public float getFrequencia() {
        return this.frequencia;
    }

    public void setFrequencia(float frequencia) {
        this.frequencia = frequencia;
    }

    public int getP1() {
        return this.p1;
    }

    public void setP1(int p1) {
        this.p1 = p1;
    }

    public int getP2() {
        return this.p2;
    }

    public void setP2(int p2) {
        this.p2 = p2;
    }

    public int getProvaFinal() {
        return this.provaFinal;
    }

    public void setProvaFinal(int provaFinal) {
        this.provaFinal = provaFinal;
    }

    public boolean verificarAprovacao() {
        if (this.frequencia < 0) {
            throw new IllegalArgumentException("Frequencia invalida");
        }
        if (this.frequencia < 75.0f) {
            return false;
        } else {
            float media = (this.p1 + this.p2) / 2;
            if (media < 30) {
                return false;
            } else {
                if (media >= 70) {
                    return true;
                } else {
                    if (((media + this.provaFinal) / 2) >= 50) {
                        return true;
                    } else {
                        return false;
                    }
                }
            }
        }
    }
}
