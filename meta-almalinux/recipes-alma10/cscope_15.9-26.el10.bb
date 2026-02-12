
inherit dnf-bridge

PN = "cscope"
PE = "0"
PV = "15.9"
PR = "26.el10"
PACKAGES = "cscope"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/cscope-15.9-26.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_cscope = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/cscope-15.9-26.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_cscope}"
RDEPENDS:cscope = " \
 emacs-filesystem \
 ed \
 bash \
 ncurses-libs \
 glibc \
 coreutils \
"
