
PN = "sbc"
PE = "0"
PV = "2.0"
PR = "6.el10"
PACKAGES = "libsbc sbc sbc-devel"


URI_libsbc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libsbc-2.0-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libsbc = "
 glibc
"

URI_sbc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/sbc-2.0-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:sbc = "
 glibc
 libsbc
"

URI_sbc-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/sbc-devel-2.0-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:sbc-devel = "
 sbc
 pkgconf-pkg-config
 libsbc
"
