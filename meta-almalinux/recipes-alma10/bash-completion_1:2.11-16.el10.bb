
inherit dnf-bridge

PN = "bash-completion"
PE = "1"
PV = "2.11"
PR = "16.el10"
PACKAGES = "bash-completion"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/bash-completion-2.11-16.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_bash-completion = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/bash-completion-2.11-16.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_bash-completion}"
RDEPENDS:bash-completion = " \
 bash \
 pkgconf-pkg-config \
"
