
inherit dnf-bridge

PN = "libmpc"
PE = "0"
PV = "1.3.1"
PR = "7.el10"
PACKAGES = "libmpc libmpc-devel libmpc-doc"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/libmpc-1.3.1-7.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_libmpc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libmpc-1.3.1-7.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libmpc}"
RDEPENDS:libmpc = " \
 glibc \
 gmp \
 mpfr \
"

URI_libmpc-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libmpc-devel-1.3.1-7.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libmpc-devel}"
RDEPENDS:libmpc-devel = " \
 libmpc \
 mpfr-devel \
 gmp-devel \
"

URI_libmpc-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libmpc-doc-1.3.1-7.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_libmpc-doc}"
RDEPENDS:libmpc-doc = ""
