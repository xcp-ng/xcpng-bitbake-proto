
PN = "inih"
PE = "0"
PV = "58"
PR = "3.el10"
PACKAGES = "inih inih-cpp inih-devel"


URI_inih = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/inih-58-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:inih = "
 glibc
"

URI_inih-cpp = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/inih-cpp-58-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:inih-cpp = "
 glibc
 inih
 libgcc
 libstdc++
"

URI_inih-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/inih-devel-58-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:inih-devel = "
 inih
 inih-cpp
 pkgconf-pkg-config
 inih-devel
"
