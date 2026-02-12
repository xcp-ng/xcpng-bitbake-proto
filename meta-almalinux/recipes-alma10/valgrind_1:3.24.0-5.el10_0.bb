
inherit dnf-bridge

PN = "valgrind"
PE = "1"
PV = "3.24.0"
PR = "5.el10_0"
PACKAGES = "valgrind valgrind-devel"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/valgrind-3.24.0-5.el10_0.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_valgrind = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/valgrind-3.24.0-5.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_valgrind}"
RDEPENDS:valgrind = " \
 glibc \
 perl-interpreter \
 libgcc \
 python3 \
"

URI_valgrind-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/valgrind-devel-3.24.0-5.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_valgrind-devel}"
RDEPENDS:valgrind-devel = " \
 valgrind \
 pkgconf-pkg-config \
"
