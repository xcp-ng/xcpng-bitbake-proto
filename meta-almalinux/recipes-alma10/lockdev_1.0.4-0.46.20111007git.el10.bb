
inherit dnf-bridge

PN = "lockdev"
PE = "0"
PV = "1.0.4"
PR = "0.46.20111007git.el10"
PACKAGES = "lockdev lockdev-devel"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/lockdev-1.0.4-0.46.20111007git.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_lockdev = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/lockdev-1.0.4-0.46.20111007git.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_lockdev}"
RDEPENDS:lockdev = " \
 glibc \
 shadow-utils \
 bash \
 systemd \
"

URI_lockdev-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/lockdev-devel-1.0.4-0.46.20111007git.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_lockdev-devel}"
RDEPENDS:lockdev-devel = " \
 pkgconf-pkg-config \
 lockdev \
"
