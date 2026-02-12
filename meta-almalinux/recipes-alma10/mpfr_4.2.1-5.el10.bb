
inherit dnf-bridge

PN = "mpfr"
PE = "0"
PV = "4.2.1"
PR = "5.el10"
PACKAGES = "mpfr mpfr-devel mpfr-doc"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/mpfr-4.2.1-5.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_mpfr = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/mpfr-4.2.1-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_mpfr}"
RDEPENDS:mpfr = " \
 glibc \
 gmp \
"

URI_mpfr-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/mpfr-devel-4.2.1-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_mpfr-devel}"
RDEPENDS:mpfr-devel = " \
 gmp-devel \
 mpfr \
 pkgconf-pkg-config \
"

URI_mpfr-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/mpfr-doc-4.2.1-5.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_mpfr-doc}"
RDEPENDS:mpfr-doc = ""
