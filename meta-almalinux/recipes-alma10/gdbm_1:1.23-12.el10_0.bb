
inherit dnf-bridge

PN = "gdbm"
PE = "1"
PV = "1.23"
PR = "12.el10_0"
PACKAGES = "gdbm gdbm-libs gdbm-devel"


URI_gdbm = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/gdbm-1.23-12.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:gdbm = " \
 glibc \
 readline \
 gdbm-libs \
"

URI_gdbm-libs = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/gdbm-libs-1.23-12.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:gdbm-libs = " \
 glibc \
"

URI_gdbm-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/gdbm-devel-1.23-12.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:gdbm-devel = " \
 gdbm \
 info \
 gdbm-libs \
"
