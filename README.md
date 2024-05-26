# Prez SOLID and Clean Archi

## Step 1

- Clean archi structure est réalisée (entities, use_cases) pas besoin de l'infra et l'application
- L'implementation des Records est maline utilisant toString ant fromString pour écrire et lire

MAIS
- entities ne devraient pas contenir de règles métiers 

## Step 2
- Isolation des Readers et Writers dans un helpers du use_cases (principe S de SOLID)
- Builders aussi car il fait parti des cas métiers avec règles (les interfaces sont dans entities mais leurs implémentations dans use_cases) (principe D de SOLID) 

MAIS
- L'implementation avec `Record1Reader extends AbstractReader<Record1, Record1Builder>` est un peu lourde difficilement évolutive
- Readers et Writers doivent être reversible et là on est obligé de faire un test unitaire sur les 2 Helpers en même temps 

## Step 3
- Ajout des interfaces (principe I de Solid)
- Les Writers et Readers sont des interfaces isolées mais implémentée dans un Serializer

MAIS
- La création d'une nouvelle entité n'est pas intuitive et passe outre le Builder
- Nouveau besoin : l'un des champs du record le LEN(1) est calculé en fonction des autres

## Step 4
- Les entities sont Immutables
- Le Builder contient la mécanique de Build et de création d'une nouvelle entité
- Le RecordBuilder contient un callback permettant le calcule au build (principe O de SOLID)