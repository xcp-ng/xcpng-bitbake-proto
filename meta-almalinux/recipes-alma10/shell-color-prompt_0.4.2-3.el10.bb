
inherit dnf-bridge

PN = "shell-color-prompt"
PE = "0"
PV = "0.4.2"
PR = "3.el10"
PACKAGES = "bash-color-prompt"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/shell-color-prompt-0.4.2-3.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_bash-color-prompt = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/bash-color-prompt-0.4.2-3.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_bash-color-prompt}"
RDEPENDS:bash-color-prompt = ""
