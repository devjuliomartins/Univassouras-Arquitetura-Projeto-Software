# 📘 Arquitetura de Software – Padrões de Projeto

Este repositório contém **materiais das aulas** e um **resumo de estudo** sobre padrões de projeto, voltado para a disciplina de **Arquitetura de Software**.  

O objetivo é servir como guia rápido para **entender, identificar e aplicar** os padrões mais comuns em projetos.

---

## 📚 Padrões abordados

### 🔹 1. Singleton

**O que é?**  
Só pode existir **um único objeto** da classe em toda a aplicação.

**Quando identificar?**  
- Quando o sistema precisa de **um único ponto central de controle**.

**Exemplo com aluno:**  
- Classe `GerenciadorDeMatricula`:  
  - Todos os alunos do sistema usam **o mesmo gerenciador** para se matricular.  
  - Não pode existir mais de um “gerenciador de matrícula”, senão haveria conflito.

**Dica UML:**  
- Classe com **atributo estático `instance`** e **método `getInstance()`**.

---

### 🔹 Factory Method
**O que é?**  
Delega a criação de objetos para **subclasses**, usando polimorfismo.  

**Quando identificar?**  
- Classe abstrata define método de criação.  
- Subclasses decidem **qual objeto criar**.  

**Exemplo com aluno:**  
- `CadastroAluno` com método `criarAluno()`:
  - `CadastroAlunoGraduacao` → cria `AlunoGraduacao`.
  - `CadastroAlunoPos` → cria `AlunoPosGraduacao`.

**Dica UML:**  
- Classe abstrata com `factoryMethod()`, subclasses retornam tipos diferentes.

---

### 🔹 Abstract Factory
**O que é?**  
Cria **famílias de objetos compatíveis** sem expor classes concretas.  

**Quando identificar?**  
- Objetos relacionados precisam variar juntos (ex: aluno + boletim compatível).  

**Exemplo com aluno:**  
- `FabricaAlunoEnsinoMedio` → cria `AlunoEM` + `BoletimEM`.  
- `FabricaAlunoUniversitario` → cria `AlunoUniv` + `BoletimUniv`.

**Dica UML:**  
- Interface `AbstractFactory` com métodos como `criarAluno()` e `criarBoletim()`.  
- Subclasses (fábricas concretas) implementam criando famílias.

---

### 🔹 Bridge
**O que é?**  
Separa **abstração (o que)** da **implementação (como)**, permitindo evolução independente.  

**Quando identificar?**  
- Duas hierarquias paralelas que podem variar separadamente.  

**Exemplo com aluno:**  
- `Aluno` precisa exibir informações.  
- Implementações de exibição: `ExibicaoConsole`, `ExibicaoWeb`, `ExibicaoMobile`.  
- Qualquer aluno pode usar qualquer forma de exibição.

**Dica UML:**  
- `Aluno` tem referência para `Exibicao` (interface).  
- Implementações (`Console`, `Web`, `Mobile`) ficam separadas.

---

### 🔹 Decorator
**O que é?**  
Permite **adicionar funcionalidades extras** a objetos sem alterar a classe original.  

**Quando identificar?**  
- Objetos embrulhando outros objetos da mesma interface.

**Exemplo com aluno:**  
- `AlunoSimples` → dados básicos.  
- `AlunoComBolsa` → adiciona desconto na mensalidade.  
- `AlunoMonitor` → adiciona carga horária de monitoria.  
- Um aluno pode ser apenas `AlunoSimples`, ou `AlunoSimples + AlunoComBolsa`, ou `AlunoSimples + AlunoComBolsa + AlunoMonitor`.

**Dica UML:**  
- `AlunoDecorator` implementa `Aluno` e mantém referência a outro `Aluno`.  
- Decoradores podem ser encadeados.

---

## 🧭 Guia Rápido de Identificação

| Padrão         | O que é? | Exemplo com aluno | Dica no diagrama |
|----------------|----------|------------------|-----------------|
| **Singleton**  | 1 instância única | `GerenciadorDeMatricula` | `getInstance()` estático |
| **Factory Method** | Subclasse decide criação | `CadastroAlunoGraduacao` cria `AlunoGraduacao` | Método abstrato `criarAluno()` |
| **Abstract Factory** | Famílias de objetos compatíveis | `AlunoUniv` + `BoletimUniv` | Interface com vários métodos de criação |
| **Bridge** | Abstração ↔ Implementação independentes | `Aluno` + `ExibicaoWeb/Console` | Classe `Aluno` tem referência para `Exibicao` |
| **Decorator** | Adicionar comportamento dinamicamente | `AlunoSimples` + `AlunoComBolsa` + `AlunoMonitor` | Classe que referencia outro `Aluno` |

---

## 📌 Objetivo
Este repositório é um **material de apoio** para fixação do conteúdo de **padrões de projeto**, com exemplos aplicados ao contexto de **alunos e sistemas acadêmicos**.  

Use este material para:  
- Revisar conceitos antes das provas.  
- Identificar padrões em **diagramas UML**.  
- Ter exemplos práticos para estudos e exercícios.  

---
