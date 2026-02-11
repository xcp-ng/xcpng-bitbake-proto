
PN = "expat"
PE = "0"
PV = "2.7.1"
PR = "1.el10_0.3"
PACKAGES = "expat expat-devel expat-static"


URI_expat = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/expat-2.7.1-1.el10_0.3.x86_64_v2.rpm;unpack=0"
RDEPENDS:expat = "
 glibc
"

URI_expat-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/expat-devel-2.7.1-1.el10_0.3.x86_64_v2.rpm;unpack=0"
RDEPENDS:expat-devel = "
 pkgconf-pkg-config
 expat
"

URI_expat-static = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/expat-static-2.7.1-1.el10_0.3.x86_64_v2.rpm;unpack=0"
RDEPENDS:expat-static = "
 expat-devel
"
