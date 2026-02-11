
PN = "libei"
PE = "0"
PV = "1.3.0"
PR = "1.el10"
PACKAGES = "libei libeis liboeffis libei-devel libeis-devel liboeffis-devel libei-utils"


URI_libei = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libei-1.3.0-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libei = "
 glibc
 libgcc
"

URI_libeis = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libeis-1.3.0-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libeis = "
 glibc
 libgcc
"

URI_liboeffis = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/liboeffis-1.3.0-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:liboeffis = "
 glibc
 libgcc
 systemd-libs
"

URI_libei-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libei-devel-1.3.0-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libei-devel = "
 pkgconf-pkg-config
 libei
"

URI_libeis-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libeis-devel-1.3.0-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libeis-devel = "
 libeis
 pkgconf-pkg-config
"

URI_liboeffis-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/liboeffis-devel-1.3.0-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:liboeffis-devel = "
 systemd-devel
 liboeffis
 pkgconf-pkg-config
"

URI_libei-utils = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libei-utils-1.3.0-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libei-utils = "
 glibc
 libgcc
 libei
"
