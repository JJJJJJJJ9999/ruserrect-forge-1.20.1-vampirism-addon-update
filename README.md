# Resurrect - Vampirism addon - Forge 1.20.1

Requires **Vampirism 1.10.x** (Forge 1.20.1). Install on BOTH client and server.

What it does
- Replaces Vampirism's "down but not out". Any vampire of level 4+ (configurable) that dies gets a **Resurrect**
  button on the death screen (unlocks after 15 seconds), whatever killed them: mobs, fall damage, the void,
  `/kill`, `/damage`, ...
- Resurrect respawns you where you died and plays an 8 second cutscene: you are frozen in place, third-person
  camera, body reassembles feet -> head while gore flies inward.
- The only final deaths (no button): sunlight and stakes (Vampirism's `sun_damage` / `stake` damage, or a hit
  from someone holding a stake). Crucifixes deal no damage in Vampirism, so they never kill.
- Vampires below the minimum level just die normally. Humans/hunters are unaffected.
- Config: `config/resurrect-common.toml` -> `minVampireLevel` (default 4).

Fixed: falling through the floor on revive (the revive spot is now checked, lifted out of blocks and settled onto the floor).

## Build the jar
Upload the contents of this folder to a GitHub repo; the "build" workflow (.github/workflows/build.yml) produces
the jar as an artifact. Or locally: JDK 17 + Gradle 8.8, `gradle build`, jar in `build/libs/`.

## Install in Prism Launcher
Instance -> Edit -> Mods -> Add file -> pick the jar (not the zip). Use a Forge 1.20.1 instance with Vampirism.
