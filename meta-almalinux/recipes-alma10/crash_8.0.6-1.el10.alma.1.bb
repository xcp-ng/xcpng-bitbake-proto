
PN = "crash"
PE = "0"
PV = "8.0.6"
PR = "1.el10.alma.1"
PACKAGES = "crash crash-devel"


URI_crash = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/crash-8.0.6-1.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:crash = "
 lzo
 libgcc
 snappy
 libzstd
 libstdc++
 ncurses-libs
 binutils
 glibc
"

URI_crash-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/crash-devel-8.0.6-1.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:crash-devel = "
 crash
 zlib-ng-compat-devel
"
