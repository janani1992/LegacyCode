# Demo Legacy Java Repo

A small Java 8-style codebase intentionally written with classic POJO patterns (constructors, getters/setters, equals/hashCode/toString) to test migration tools.

## Project goals

- Provide realistic legacy DTO/domain objects
- Include cross-file references (order -> customer -> address)
- Keep dependencies minimal so it can compile out of the box

## Structure

- `src/main/java/com/demo/legacy/LegacyAddress.java`
- `src/main/java/com/demo/legacy/LegacyCustomer.java`
- `src/main/java/com/demo/legacy/LegacyOrderItem.java`
- `src/main/java/com/demo/legacy/LegacyOrderStatus.java`
- `src/main/java/com/demo/legacy/LegacyOrder.java`

## Build

This demo uses Maven and Java 8 source/target level.

## Local compile sanity check

```bash
mvn -q -DskipTests compile
```

## Use with Migrator UI

Your current UI accepts only `http/https` repository URLs.

1. Push this repository to GitHub (or any HTTPS git host).
2. Copy the HTTPS repo URL.
3. In Migrator UI, paste the URL into **Analyze Repository**.

Example URL format:

`https://github.com/<your-user>/demo-legacy-repo`

## Quick publish steps

```bash
git init
git add .
git commit -m "chore: initial legacy demo repo"
git branch -M main
git remote add origin https://github.com/<your-user>/demo-legacy-repo.git
git push -u origin main
```

