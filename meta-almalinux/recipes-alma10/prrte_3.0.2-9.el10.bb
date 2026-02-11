
inherit dnf-bridge

PN = "prrte"
PE = "0"
PV = "3.0.2"
PR = "9.el10"
PACKAGES = "prrte prrte-libs prrte-devel"


URI_prrte = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/prrte-3.0.2-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:prrte = " \
 prrte-libs \
 libevent \
 hwloc-libs \
 pmix \
 glibc \
"

URI_prrte-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/prrte-libs-3.0.2-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:prrte-libs = " \
 libevent \
 hwloc-libs \
 torque-libs \
 glibc \
 pmix \
"

URI_prrte-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/prrte-devel-3.0.2-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:prrte-devel = " \
 prrte-libs \
"
