
inherit dnf-bridge

PN = "tcsh"
PE = "0"
PV = "6.24.10"
PR = "5.el10"
PACKAGES = "tcsh"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/tcsh-6.24.10-5.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_tcsh = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tcsh-6.24.10-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_tcsh}"
RDEPENDS:tcsh = " \
 libxcrypt \
 grep \
 bash \
 ncurses-libs \
 glibc \
 coreutils \
 sed \
"
