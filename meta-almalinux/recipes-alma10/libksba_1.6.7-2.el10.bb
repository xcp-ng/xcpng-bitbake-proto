
PN = "libksba"
PE = "0"
PV = "1.6.7"
PR = "2.el10"
PACKAGES = "libksba libksba-devel"


URI_libksba = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libksba-1.6.7-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libksba = "
 glibc
 libgpg-error
"

URI_libksba-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libksba-devel-1.6.7-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libksba-devel = "
 libksba
 libgpg-error-devel
 bash
 pkgconf-pkg-config
"
