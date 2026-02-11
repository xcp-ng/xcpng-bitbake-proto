
PN = "libcap"
PE = "0"
PV = "2.69"
PR = "7.el10"
PACKAGES = "libcap libcap-devel libcap-static"


URI_libcap = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libcap-2.69-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libcap = "
 glibc
 pam-libs
 libgcc
"

URI_libcap-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libcap-devel-2.69-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libcap-devel = "
 pkgconf-pkg-config
 libcap
"

URI_libcap-static = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libcap-static-2.69-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libcap-static = "
 libcap
"
