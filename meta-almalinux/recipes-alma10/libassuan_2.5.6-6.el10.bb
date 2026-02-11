
PN = "libassuan"
PE = "0"
PV = "2.5.6"
PR = "6.el10"
PACKAGES = "libassuan libassuan-devel"


URI_libassuan = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libassuan-2.5.6-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libassuan = "
 glibc
 libgpg-error
"

URI_libassuan-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libassuan-devel-2.5.6-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libassuan-devel = "
 libgpg-error-devel
 bash
 pkgconf-pkg-config
 libassuan
"
