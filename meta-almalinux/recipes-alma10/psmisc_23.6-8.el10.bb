
inherit dnf-bridge

PN = "psmisc"
PE = "0"
PV = "23.6"
PR = "8.el10"
PACKAGES = "psmisc"


URI_psmisc = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/psmisc-23.6-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:psmisc = " \
 glibc \
 ncurses-libs \
"
