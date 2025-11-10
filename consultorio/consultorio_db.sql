CREATE DATABASE IF NOT EXISTS consultorio_db;
USE consultorio_db;

-- Tabela de clínicas
CREATE TABLE clinicas (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(200) NOT NULL,
    cnpj VARCHAR(18) NOT NULL UNIQUE,
    endereco VARCHAR(200) NOT NULL,
    telefone VARCHAR(20) NOT NULL,
    cabecalho_documentos TEXT,
    rodape_documentos TEXT
);

-- Tabela de convênios
CREATE TABLE convenios (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    telefone VARCHAR(20),
    endereco VARCHAR(200),
    cnpj VARCHAR(18) NOT NULL UNIQUE,
    planos_fornecidos TEXT
);

-- Tabela de CID
CREATE TABLE cids (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    codigo VARCHAR(10) NOT NULL UNIQUE,
    descricao VARCHAR(200) NOT NULL,
    descricao_completa TEXT
);

-- Tabela de pacientes
CREATE TABLE pacientes (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    endereco VARCHAR(200),
    telefone VARCHAR(20),
    cpf VARCHAR(14) NOT NULL UNIQUE,
    rg VARCHAR(20),
    sexo VARCHAR(20) NOT NULL,
    convenio_id BIGINT,
    queixa_principal TEXT,
    antecedentes TEXT,
    historia_doenca TEXT,
    diagnostico TEXT,
    medicacao TEXT,
    exames_aparelhos_sistemas TEXT,
    exames_complementares TEXT,
    ativo BOOLEAN NOT NULL DEFAULT TRUE,
    FOREIGN KEY (convenio_id) REFERENCES convenios(id)
);

-- Tabela de médicos
CREATE TABLE medicos (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    cpf VARCHAR(14) NOT NULL UNIQUE,
    rg VARCHAR(20) NOT NULL,
    crm VARCHAR(20) NOT NULL UNIQUE,
    telefone VARCHAR(20),
    endereco VARCHAR(200),
    sexo VARCHAR(20) NOT NULL,
    especialidades TEXT
);

-- Tabela de secretárias
CREATE TABLE secretarias (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    cpf VARCHAR(14) NOT NULL UNIQUE,
    rg VARCHAR(20) NOT NULL,
    telefone VARCHAR(20),
    endereco VARCHAR(200),
    sexo VARCHAR(20) NOT NULL
);

-- Tabela de agendas
CREATE TABLE agendas (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    medico_id BIGINT NOT NULL,
    data_hora_inicio DATETIME NOT NULL,
    data_hora_fim DATETIME NOT NULL,
    descricao TEXT NOT NULL,
    tipo VARCHAR(30) NOT NULL,
    paciente_id BIGINT,
    FOREIGN KEY (medico_id) REFERENCES medicos(id),
    FOREIGN KEY (paciente_id) REFERENCES pacientes(id)
);

-- Tabela de documentos médicos
CREATE TABLE documentos_medicos (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    medico_id BIGINT NOT NULL,
    paciente_id BIGINT NOT NULL,
    tipo VARCHAR(50) NOT NULL,
    conteudo TEXT NOT NULL,
    data_emissao DATETIME NOT NULL,
    cabecalho TEXT,
    rodape TEXT,
    impresso BOOLEAN NOT NULL DEFAULT FALSE,
    FOREIGN KEY (medico_id) REFERENCES medicos(id),
    FOREIGN KEY (paciente_id) REFERENCES pacientes(id)
);

-- Tabela de faturamentos
CREATE TABLE faturamentos (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    convenio_id BIGINT NOT NULL,
    periodo_inicio DATE NOT NULL,
    periodo_fim DATE NOT NULL,
    consultas_realizadas INT NOT NULL,
    faturamento_devido DECIMAL(10,2) NOT NULL,
    faturamento_total DECIMAL(10,2) NOT NULL,
    data_geracao DATE NOT NULL,
    FOREIGN KEY (convenio_id) REFERENCES convenios(id)
);