# Imagens do Sistema de Consultório Médico

Este diretório contém todas as imagens utilizadas na interface do sistema.

## Arquivos:

1. **logo.png** - Logo da clínica (200x80px)
2. **patient-icon.png** - Ícone de paciente (64x64px)
3. **doctor-icon.png** - Ícone de médico (64x64px)
4. **secretary-icon.png** - Ícone de secretária (64x64px)
5. **clinic-icon.png** - Ícone de clínica (64x64px)
6. **agenda-icon.png** - Ícone de agenda (64x64px)
7. **invoice-icon.png** - Ícone de faturamento (64x64px)
8. **document-icon.png** - Ícone de documento (64x64px)

## Recomendações para uso:

- Todas as imagens devem ter fundo transparente (PNG)
- Tamanhos recomendados conforme descrito acima
- Para geração das imagens, use ferramentas como Figma, Adobe Illustrator ou Canva
- As cores sugeridas são: azul (#3498db), verde (#2ecc71), roxo (#9b59b6), vermelho (#e74c3c)
- O logo deve incluir um estetoscópio e a cruz vermelha como elementos identificadores

## Observações:

- Para o ícone de CID, foi usado um ícone da biblioteca Font Awesome (fas fa-notes-medical) por ser mais fácil de implementar
- Todos os ícones foram criados com estilo flat e cores suaves para manter a usabilidade (RNF001)
- A interface foi projetada para ser intuitiva e prevenir erros graves

# Diretório de Arquivos Estáticos

Este diretório contém todos os arquivos estáticos do sistema:

- **images/** - Todas as imagens e ícones da interface
- **css/** - Arquivos CSS personalizados (não utilizado atualmente, mas estrutura pronta)
- **js/** - Arquivos JavaScript personalizados (não utilizado atualmente, mas estrutura pronta)

## Estrutura recomendada:

static/
├── images/
│ ├── logo.png
│ ├── patient-icon.png
│ ├── doctor-icon.png
│ ├── secretary-icon.png
│ ├── clinic-icon.png
│ ├── agenda-icon.png
│ ├── invoice-icon.png
│ └── document-icon.png
├── css/
│ └── custom.css
└── js/
└── custom.js

Os arquivos são acessados via URL:
- `/images/logo.png` 
- `/images/patient-icon.png`
- etc.

A estrutura segue as boas práticas do Spring Boot para recursos estáticos.

Estrutura Final do Projeto
Agora o projeto está completo com:

Todas as entidades JPA/Hibernate implementadas conforme requisitos
Imagens e ícones para todos os módulos principais
Interface web moderna e responsiva com Bootstrap 5
Código HTML/CSS otimizado para usabilidade (RNF001)
Estrutura de arquivos organizada seguindo boas práticas
6. Como gerar as imagens
Para gerar as imagens, você pode:

Usar Canva (gratuito):
Criar um novo design com dimensões 64x64px
Usar ícones de "People", "Doctor", "Clinic" etc.
Exportar como PNG com fundo transparente
Usar Font Awesome (para ícones):
Acesse https://fontawesome.com/icons
Use fa-user para paciente, fa-user-md para médico, etc.
Use o código CSS fornecido no HTML
Usar IcoMoon:
Gere um conjunto de ícones personalizados
Exporte como PNG

consultorio-medico.zip
├── pom.xml
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── br/
│   │   │       └── com/
│   │   │           └── consultorio/
│   │   │               ├── ConsultorioApplication.java
│   │   │               ├── model/
│   │   │               │   ├── Clinica.java
│   │   │               │   ├── Medico.java
│   │   │               │   ├── Secretaria.java
│   │   │               │   ├── Convenio.java
│   │   │               │   ├── Paciente.java
│   │   │               │   ├── Cid.java
│   │   │               │   ├── Agenda.java
│   │   │               │   ├── DocumentoMedico.java
│   │   │               │   ├── Faturamento.java
│   │   │               │   └── enums/
│   │   │               │       ├── Sexos.java
│   │   │               │       └── TiposCompromisso.java
│   │   │               ├── repository/
│   │   │               │   ├── ClinicaRepository.java
│   │   │               │   ├── MedicoRepository.java
│   │   │               │   ├── SecretariaRepository.java
│   │   │               │   ├── ConvenioRepository.java
│   │   │               │   ├── PacienteRepository.java
│   │   │               │   ├── CidRepository.java
│   │   │               │   ├── AgendaRepository.java
│   │   │               │   ├── DocumentoMedicoRepository.java
│   │   │               │   └── FaturamentoRepository.java
│   │   │               └── controller/
│   │   │                   └── HomeController.java
│   │   └── resources/
│   │       ├── application.properties
│   │       ├── static/
│   │       │   ├── images/
│   │       │   │   ├── logo.png
│   │       │   │   ├── patient-icon.png
│   │       │   │   ├── doctor-icon.png
│   │       │   │   ├── secretary-icon.png
│   │       │   │   ├── clinic-icon.png
│   │       │   │   ├── agenda-icon.png
│   │       │   │   ├── invoice-icon.png
│   │       │   │   └── document-icon.png
│   │       │   ├── README.md
│   │       │   └── images/README.md
│   │       └── templates/
│   │           └── home.html
│   └── test/
│       └── java/
│           └── br/
│               └── com/
│                   └── consultorio/
│                       └── ConsultorioApplicationTests.java
└── README.md