
inherit dnf-bridge

PN = "ninja-build"
PE = "0"
PV = "1.11.1"
PR = "9.el10"
PACKAGES = "ninja-build"


URI_src = "https://vault.almalinux.org/10.0/CRB/Source/Packages/ninja-build-1.11.1-9.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_ninja-build = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/ninja-build-1.11.1-9.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_ninja-build}"
RDEPENDS:ninja-build = " \
 python3 \
 emacs-filesystem \
 libgcc \
 vim-filesystem \
 libstdc++ \
 glibc \
"
