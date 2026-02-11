
PN = "liblc3"
PE = "0"
PV = "1.0.4"
PR = "6.el10"
PACKAGES = "liblc3 liblc3-devel liblc3-utils"


URI_liblc3 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/liblc3-1.0.4-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:liblc3 = "
 glibc
"

URI_liblc3-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/liblc3-devel-1.0.4-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:liblc3-devel = "
 liblc3
 pkgconf-pkg-config
"

URI_liblc3-utils = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/liblc3-utils-1.0.4-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:liblc3-utils = "
 glibc
 liblc3
"
