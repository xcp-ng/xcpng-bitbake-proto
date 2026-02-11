
PN = "twolame"
PE = "0"
PV = "0.4.0"
PR = "6.el10"
PACKAGES = "twolame twolame-libs twolame-devel"


URI_twolame = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/twolame-0.4.0-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:twolame = "
 glibc
 twolame-libs
 libsndfile
"

URI_twolame-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/twolame-libs-0.4.0-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:twolame-libs = "
 glibc
"

URI_twolame-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/twolame-devel-0.4.0-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:twolame-devel = "
 twolame-libs
 pkgconf-pkg-config
"
